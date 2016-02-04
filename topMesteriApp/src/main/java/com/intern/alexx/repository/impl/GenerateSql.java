package com.intern.alexx.repository.impl;

public class GenerateSql {

	private String sql;

	public String createString(MesterSearchCriteria searchCriteria) {

		StringBuilder query = new StringBuilder("SELECT mester.*  ");
		String from = "FROM mester AS m ";
		StringBuilder join = new StringBuilder(" ");
		String on1 = null, on2 = null, on3 = null;
		StringBuilder on = new StringBuilder(" ");
		String where1 = null, where2 = null, where3 = null, wm1 = null, wm2 = null, wm3 = null;
		StringBuilder where = new StringBuilder(" WHERE ");
		Boolean verify = false;

		if (searchCriteria.getFirstName() != null) {
			wm1 = " m.first_name= ? ";
		}
		if (searchCriteria.getLastName() != null) {
			wm2 = " m.last_name= ? ";
		}
		if (searchCriteria.getLocation() != null) {
			wm3 = " m.location= ? ";
		}

		if (searchCriteria.getSpecialityName() != null) {

			// query.append(", speciality.speciality_name ");
			join.append("JOIN mester_has_speciality as mhs JOIN speciality as s  ");
			on1 = " (m.id = mhs.id_mester) AND (s.id = mhs.id_speciality) ";
			where1 = " s.speciality_name= ? ";
		}

		if ((searchCriteria.getEmail() != null) || (searchCriteria.getPhoneNumber() != null)) {
			join.append("JOIN contact AS c  ");
			on2 = " m.id=c.id_mester ";

			if ((searchCriteria.getEmail() != null) && (searchCriteria.getPhoneNumber() == null)) {
				// query.append(", contact.email ");
				where2 = " c.email= ? ";
			}

			if ((searchCriteria.getEmail() == null) && (searchCriteria.getPhoneNumber() != null)) {
				// query.append(", contact.numar_telefon ");
				where2 = " c.numar_telefon= ? ";
			}

			if ((searchCriteria.getEmail() != null) && (searchCriteria.getPhoneNumber() != null)) {
				// query.append(", contact.email, contact.numar_telefon ");
				where2 = " c.email= ? AND c.numar_telefon= ? ";
			}
		}

		if ((searchCriteria.getRating() != null) || (searchCriteria.getPrice() != null)) {
			join.append("JOIN review_mester AS rm  ");
			on3 = " m.id=rm.id_mester ";

			if ((searchCriteria.getRating() != null) && (searchCriteria.getPrice() == null)) {
				// query.append(", review_mester.rating ");
				where3 = " rm.rating= ? ";
			}

			if ((searchCriteria.getRating() == null) && (searchCriteria.getPrice() != null)) {
				// query.append(", review_mester.price ");
				where3 = " rm.price= ? ";
			}
			if ((searchCriteria.getRating() != null) && (searchCriteria.getPrice() != null)) {
				// query.append(", review_mester.rating, review_mester.price ");
				where3 = " rm.rating= ? AND rm.price= ? ";
			}
		}

		if ((wm1 != null) || (wm2 != null) || (wm3 != null)) {
			verify = true;
			if ((wm1 != null) && (wm2 != null) && (wm3 != null)) {
				where.append(wm1).append(" AND ").append(wm2).append(" AND ").append(wm3);
			} else if ((wm1 != null) && (wm2 == null) && (wm3 == null)) {
				where.append(wm1);
			} else if ((wm1 == null) && (wm2 != null) && (wm3 == null)) {
				where.append(wm2);
			} else if ((wm1 == null) && (wm2 == null) && (wm3 != null)) {
				where.append(wm3);
			} else if ((wm1 != null) && (wm2 != null) && (wm3 == null)) {
				where.append(wm1).append(" AND ").append(wm2);
			} else if ((wm1 != null) && (wm2 == null) && (wm3 != null)) {
				where.append(wm1).append(" AND ").append(wm3);
			} else if ((wm1 == null) && (wm2 != null) && (wm3 != null)) {
				where.append(wm2).append(" AND ").append(wm3);
			}
		}

		if ((on1 != null) || (on2 != null) || (on3 != null)) {
			on.append(" ON ");
			if (verify) {
				where.append(" AND ");
			}
			if ((on1 != null) && (on2 != null) && (on3 != null)) {
				on.append(on1).append(" AND ").append(on2).append(" AND ").append(on3);
				where.append(where1).append(" AND ").append(where2).append(" AND ").append(where3);
			} else if ((on1 != null) && (on2 == null) && (on3 == null)) {
				on.append(on1);
				where.append(where1);
			} else if ((on1 == null) && (on2 != null) && (on3 == null)) {
				on.append(on2);
				where.append(where2);
			} else if ((on1 == null) && (on2 == null) && (on3 != null)) {
				on.append(on3);
				where.append(where3);
			} else if ((on1 != null) && (on2 != null) && (on3 == null)) {
				on.append(on1).append(" AND ").append(on2);
				where.append(where1).append(" AND ").append(where2);
			} else if ((on1 != null) && (on2 == null) && (on3 != null)) {
				on.append(on1).append(" AND ").append(on3);
				where.append(where1).append(" AND ").append(where3);
			} else if ((on1 == null) && (on2 != null) && (on3 != null)) {
				on.append(on2).append(" AND ").append(on3);
				where.append(where2).append(" AND ").append(where3);
			}
		}

		sql = query.append(from).append(join).append(on).append(where).append(" ;").toString();

		return sql;

	}

}

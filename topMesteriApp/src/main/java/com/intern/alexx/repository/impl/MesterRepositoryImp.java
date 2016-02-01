/**
 * 
 */
package com.intern.alexx.repository.impl;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.intern.alexx.model.Mester;
import com.intern.alexx.repository.MesterRepository;

@Component
public class MesterRepositoryImp implements MesterRepository {

	@Autowired
	private DataSource dataSource;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public void insert(Mester mester) {
		// TODO Auto-generated method stub
		String sql = "INSERT INTO MESTER (ID, FIRST_NAME, LAST_NAME, DESCRIPTION, LOCATION) " + "VALUES (?,?,?,?,?)";
		Connection conn = null;
		try {
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, mester.getIdMester());
			ps.setString(2, mester.getFirstName());
			ps.setString(3, mester.getLastName());
			ps.setString(4, mester.getDescription());
			ps.setString(5, mester.getLocation());
			ps.executeUpdate();
			ps.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
				}
			}
		}
	}

	public void update(Mester mester) {
		// TODO Auto-generated method stub

	}

	public void delete(Mester mester) {
		String sql = "DELETE FROM MESTER  WHERE id = ? ";
		Connection conn = null;
		try {
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, mester.getIdMester());
			ps.executeUpdate();
			ps.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
				}
			}
		}

	}

	public Mester getById(Integer id) {
		Mester mester = null;
		String sql = "SELECT * FROM mester WHERE id = ?";
		Connection conn = null;

		try {
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet resultSet = ps.executeQuery();
			if (resultSet.next()) {
				mester = new Mester();
				mester.setIdMester(resultSet.getInt("id"));
				mester.setFirstName(resultSet.getString("first_name"));
				mester.setLastName(resultSet.getString("last_name"));
				mester.setLocation(resultSet.getString("location"));
			}
			ps.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
				}
			}
		}

		return mester;
	}

}

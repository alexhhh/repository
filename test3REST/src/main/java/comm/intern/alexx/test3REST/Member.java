package comm.intern.alexx.test3REST;

import org.springframework.stereotype.Component;

@Component
public class Member {


	private String name;
	private String phone;
	private String email;

	public String getEmail() {
		return email;
	}

	public String getName() {
		return name;
	}

	public String getPhone() {
		return phone;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	@Override
	public String toString() {
		return "Member [name=" + name + ", phone=" + phone + ", email=" + email + "]";
	}
	
}
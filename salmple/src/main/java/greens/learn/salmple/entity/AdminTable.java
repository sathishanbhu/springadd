package greens.learn.salmple.entity;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="AdminTable")
public class AdminTable {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "adminId")
	private Integer adminId;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "userName")
	private String userName;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "adminFlag")
	private Character adminFlag;
	
	public Integer getAdminId() {
		return adminId;
	}
	public void setAdminId(Integer adminId) {
		this.adminId = adminId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Character getAdminFlag() {
		return adminFlag;
	}
	public void setAdminFlag(Character adminFlag) {
		this.adminFlag = adminFlag;
	}
	
	@Override
	public String toString() {
		return "AdminTable [adminId=" + adminId + ", name=" + name + ", userName=" + userName + ", password=" + password
				+ ", adminFlag=" + adminFlag + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(adminFlag, adminId, name, password, userName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AdminTable other = (AdminTable) obj;
		return Objects.equals(adminFlag, other.adminFlag) && Objects.equals(adminId, other.adminId)
				&& Objects.equals(name, other.name) && Objects.equals(password, other.password)
				&& Objects.equals(userName, other.userName);
	}
	public AdminTable() {
		
	}
	
	
	
	

}

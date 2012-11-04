package org.infinitetracker.core.user.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the tbl_role database table.
 * 
 */
@Entity
@Table(name="tbl_role")
public class Role implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(name="role_developer", length=9)
	private String roleDeveloper;

	@Column(name="role_guest", length=5)
	private String roleGuest;

	@Column(name="role_lead_developer", length=12)
	private String roleLeadDeveloper;

	@Column(name="role_lead_qa", length=6)
	private String roleLeadQa;

	@Column(name="role_manager", length=7)
	private String roleManager;

	@Column(name="role_qa", length=2)
	private String roleQa;

	@Column(name="role_user", length=4)
	private String roleUser;

	//bi-directional many-to-one association to User
	@OneToMany(mappedBy="tblRole")
	private List<User> tblUsers;

	//bi-directional many-to-one association to UserRole
	@OneToMany(mappedBy="tblRole")
	private List<UserRole> tblUserRoles;

	public Role() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRoleDeveloper() {
		return this.roleDeveloper;
	}

	public void setRoleDeveloper(String roleDeveloper) {
		this.roleDeveloper = roleDeveloper;
	}

	public String getRoleGuest() {
		return this.roleGuest;
	}

	public void setRoleGuest(String roleGuest) {
		this.roleGuest = roleGuest;
	}

	public String getRoleLeadDeveloper() {
		return this.roleLeadDeveloper;
	}

	public void setRoleLeadDeveloper(String roleLeadDeveloper) {
		this.roleLeadDeveloper = roleLeadDeveloper;
	}

	public String getRoleLeadQa() {
		return this.roleLeadQa;
	}

	public void setRoleLeadQa(String roleLeadQa) {
		this.roleLeadQa = roleLeadQa;
	}

	public String getRoleManager() {
		return this.roleManager;
	}

	public void setRoleManager(String roleManager) {
		this.roleManager = roleManager;
	}

	public String getRoleQa() {
		return this.roleQa;
	}

	public void setRoleQa(String roleQa) {
		this.roleQa = roleQa;
	}

	public String getRoleUser() {
		return this.roleUser;
	}

	public void setRoleUser(String roleUser) {
		this.roleUser = roleUser;
	}

	public List<User> getTblUsers() {
		return this.tblUsers;
	}

	public void setTblUsers(List<User> tblUsers) {
		this.tblUsers = tblUsers;
	}

	public List<UserRole> getTblUserRoles() {
		return this.tblUserRoles;
	}

	public void setTblUserRoles(List<UserRole> tblUserRoles) {
		this.tblUserRoles = tblUserRoles;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result
				+ ((roleDeveloper == null) ? 0 : roleDeveloper.hashCode());
		result = prime * result
				+ ((roleGuest == null) ? 0 : roleGuest.hashCode());
		result = prime
				* result
				+ ((roleLeadDeveloper == null) ? 0 : roleLeadDeveloper
						.hashCode());
		result = prime * result
				+ ((roleLeadQa == null) ? 0 : roleLeadQa.hashCode());
		result = prime * result
				+ ((roleManager == null) ? 0 : roleManager.hashCode());
		result = prime * result + ((roleQa == null) ? 0 : roleQa.hashCode());
		result = prime * result
				+ ((roleUser == null) ? 0 : roleUser.hashCode());
		result = prime * result
				+ ((tblUserRoles == null) ? 0 : tblUserRoles.hashCode());
		result = prime * result
				+ ((tblUsers == null) ? 0 : tblUsers.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Role other = (Role) obj;
		if (id != other.id) {
			return false;
		}
		if (roleDeveloper == null) {
			if (other.roleDeveloper != null) {
				return false;
			}
		} else if (!roleDeveloper.equals(other.roleDeveloper)) {
			return false;
		}
		if (roleGuest == null) {
			if (other.roleGuest != null) {
				return false;
			}
		} else if (!roleGuest.equals(other.roleGuest)) {
			return false;
		}
		if (roleLeadDeveloper == null) {
			if (other.roleLeadDeveloper != null) {
				return false;
			}
		} else if (!roleLeadDeveloper.equals(other.roleLeadDeveloper)) {
			return false;
		}
		if (roleLeadQa == null) {
			if (other.roleLeadQa != null) {
				return false;
			}
		} else if (!roleLeadQa.equals(other.roleLeadQa)) {
			return false;
		}
		if (roleManager == null) {
			if (other.roleManager != null) {
				return false;
			}
		} else if (!roleManager.equals(other.roleManager)) {
			return false;
		}
		if (roleQa == null) {
			if (other.roleQa != null) {
				return false;
			}
		} else if (!roleQa.equals(other.roleQa)) {
			return false;
		}
		if (roleUser == null) {
			if (other.roleUser != null) {
				return false;
			}
		} else if (!roleUser.equals(other.roleUser)) {
			return false;
		}
		if (tblUserRoles == null) {
			if (other.tblUserRoles != null) {
				return false;
			}
		} else if (!tblUserRoles.equals(other.tblUserRoles)) {
			return false;
		}
		if (tblUsers == null) {
			if (other.tblUsers != null) {
				return false;
			}
		} else if (!tblUsers.equals(other.tblUsers)) {
			return false;
		}
		return true;
	}

}
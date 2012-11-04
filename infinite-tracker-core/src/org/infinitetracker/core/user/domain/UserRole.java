package org.infinitetracker.core.user.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tbl_user_role database table.
 * 
 */
@Entity
@Table(name="tbl_user_role")
public class UserRole implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(unique=true, nullable=false)
	private int id;

	//bi-directional many-to-one association to Role
	@ManyToOne
	@JoinColumn(name="role_id")
	private Role tblRole;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="user_id")
	private User tblUser;

	public UserRole() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Role getTblRole() {
		return this.tblRole;
	}

	public void setTblRole(Role tblRole) {
		this.tblRole = tblRole;
	}

	public User getTblUser() {
		return this.tblUser;
	}

	public void setTblUser(User tblUser) {
		this.tblUser = tblUser;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((tblRole == null) ? 0 : tblRole.hashCode());
		result = prime * result + ((tblUser == null) ? 0 : tblUser.hashCode());
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
		UserRole other = (UserRole) obj;
		if (id != other.id) {
			return false;
		}
		if (tblRole == null) {
			if (other.tblRole != null) {
				return false;
			}
		} else if (!tblRole.equals(other.tblRole)) {
			return false;
		}
		if (tblUser == null) {
			if (other.tblUser != null) {
				return false;
			}
		} else if (!tblUser.equals(other.tblUser)) {
			return false;
		}
		return true;
	}
	
	

}
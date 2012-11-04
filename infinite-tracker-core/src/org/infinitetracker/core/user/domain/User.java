package org.infinitetracker.core.user.domain;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.infinitetracker.core.issue.domain.Issue;
import org.infinitetracker.core.project.domain.Project;
import org.infinitetracker.core.tracker.domain.Tracker;


/**
 * The persistent class for the tbl_user database table.
 * 
 */
@Entity
@Table(name="tbl_user")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(name="issue_id")
	private int issueId;

	@Column(name="register_date")
	private Timestamp registerDate;

	@Column(name="user_email", length=45)
	private String userEmail;

	@Column(name="user_name", length=45)
	private String userName;

	@Column(name="user_password", length=45)
	private String userPassword;

	//bi-directional many-to-one association to Issue
	@OneToMany(mappedBy="tblUser1")
	private List<Issue> tblIssues1;

	//bi-directional many-to-one association to Issue
	@OneToMany(mappedBy="tblUser2")
	private List<Issue> tblIssues2;

	//bi-directional many-to-one association to Role
	@ManyToOne
	@JoinColumn(name="role_id")
	private Role tblRole;

	//bi-directional many-to-one association to Project
	@ManyToOne
	@JoinColumn(name="project_id")
	private Project tblProject;

	//bi-directional many-to-one association to Tracker
	@ManyToOne
	@JoinColumn(name="tracker_id")
	private Tracker tblTracker;

	//bi-directional many-to-one association to UserRole
	@OneToMany(mappedBy="tblUser")
	private List<UserRole> tblUserRoles;

	public User() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIssueId() {
		return this.issueId;
	}

	public void setIssueId(int issueId) {
		this.issueId = issueId;
	}

	public Timestamp getRegisterDate() {
		return this.registerDate;
	}

	public void setRegisterDate(Timestamp registerDate) {
		this.registerDate = registerDate;
	}

	public String getUserEmail() {
		return this.userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return this.userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public List<Issue> getTblIssues1() {
		return this.tblIssues1;
	}

	public void setTblIssues1(List<Issue> tblIssues1) {
		this.tblIssues1 = tblIssues1;
	}

	public List<Issue> getTblIssues2() {
		return this.tblIssues2;
	}

	public void setTblIssues2(List<Issue> tblIssues2) {
		this.tblIssues2 = tblIssues2;
	}

	public Role getTblRole() {
		return this.tblRole;
	}

	public void setTblRole(Role tblRole) {
		this.tblRole = tblRole;
	}

	public Project getTblProject() {
		return this.tblProject;
	}

	public void setTblProject(Project tblProject) {
		this.tblProject = tblProject;
	}

	public Tracker getTblTracker() {
		return this.tblTracker;
	}

	public void setTblTracker(Tracker tblTracker) {
		this.tblTracker = tblTracker;
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
		result = prime * result + issueId;
		result = prime * result
				+ ((registerDate == null) ? 0 : registerDate.hashCode());
		result = prime * result
				+ ((tblIssues1 == null) ? 0 : tblIssues1.hashCode());
		result = prime * result
				+ ((tblIssues2 == null) ? 0 : tblIssues2.hashCode());
		result = prime * result
				+ ((tblProject == null) ? 0 : tblProject.hashCode());
		result = prime * result + ((tblRole == null) ? 0 : tblRole.hashCode());
		result = prime * result
				+ ((tblTracker == null) ? 0 : tblTracker.hashCode());
		result = prime * result
				+ ((tblUserRoles == null) ? 0 : tblUserRoles.hashCode());
		result = prime * result
				+ ((userEmail == null) ? 0 : userEmail.hashCode());
		result = prime * result
				+ ((userName == null) ? 0 : userName.hashCode());
		result = prime * result
				+ ((userPassword == null) ? 0 : userPassword.hashCode());
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
		User other = (User) obj;
		if (id != other.id) {
			return false;
		}
		if (issueId != other.issueId) {
			return false;
		}
		if (registerDate == null) {
			if (other.registerDate != null) {
				return false;
			}
		} else if (!registerDate.equals(other.registerDate)) {
			return false;
		}
		if (tblIssues1 == null) {
			if (other.tblIssues1 != null) {
				return false;
			}
		} else if (!tblIssues1.equals(other.tblIssues1)) {
			return false;
		}
		if (tblIssues2 == null) {
			if (other.tblIssues2 != null) {
				return false;
			}
		} else if (!tblIssues2.equals(other.tblIssues2)) {
			return false;
		}
		if (tblProject == null) {
			if (other.tblProject != null) {
				return false;
			}
		} else if (!tblProject.equals(other.tblProject)) {
			return false;
		}
		if (tblRole == null) {
			if (other.tblRole != null) {
				return false;
			}
		} else if (!tblRole.equals(other.tblRole)) {
			return false;
		}
		if (tblTracker == null) {
			if (other.tblTracker != null) {
				return false;
			}
		} else if (!tblTracker.equals(other.tblTracker)) {
			return false;
		}
		if (tblUserRoles == null) {
			if (other.tblUserRoles != null) {
				return false;
			}
		} else if (!tblUserRoles.equals(other.tblUserRoles)) {
			return false;
		}
		if (userEmail == null) {
			if (other.userEmail != null) {
				return false;
			}
		} else if (!userEmail.equals(other.userEmail)) {
			return false;
		}
		if (userName == null) {
			if (other.userName != null) {
				return false;
			}
		} else if (!userName.equals(other.userName)) {
			return false;
		}
		if (userPassword == null) {
			if (other.userPassword != null) {
				return false;
			}
		} else if (!userPassword.equals(other.userPassword)) {
			return false;
		}
		return true;
	}
	
	

}
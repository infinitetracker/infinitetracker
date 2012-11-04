package org.infinitetracker.core.issue.domain;

import java.io.Serializable;
import javax.persistence.*;

import org.infinitetracker.core.project.domain.Project;
import org.infinitetracker.core.tracker.domain.Tracker;
import org.infinitetracker.core.user.domain.User;

import java.sql.Timestamp;


/**
 * The persistent class for the tbl_issue database table.
 * 
 */
@Entity
@Table(name="tbl_issue")
public class Issue implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(unique=true, nullable=false)
	private int id;

	private double completion;

	@Column(name="due_date")
	private Timestamp dueDate;

	@Column(name="issue_name", length=45)
	private String issueName;

	@Column(name="start_date")
	private Timestamp startDate;

	//bi-directional many-to-one association to Status
	@ManyToOne
	@JoinColumn(name="status_id")
	private Status tblStatus;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="assigned_to")
	private User tblUser1;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="opened_by")
	private User tblUser2;

	//bi-directional many-to-one association to IssuePriority
	@ManyToOne
	@JoinColumn(name="issue_priority")
	private IssuePriority tblPriority;

	//bi-directional many-to-one association to Project
	@ManyToOne
	@JoinColumn(name="project_id")
	private Project tblProject;

	//bi-directional many-to-one association to Tracker
	@ManyToOne
	@JoinColumn(name="tracker_id")
	private Tracker tblTracker;

	public Issue() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getCompletion() {
		return this.completion;
	}

	public void setCompletion(double completion) {
		this.completion = completion;
	}

	public Timestamp getDueDate() {
		return this.dueDate;
	}

	public void setDueDate(Timestamp dueDate) {
		this.dueDate = dueDate;
	}

	public String getIssueName() {
		return this.issueName;
	}

	public void setIssueName(String issueName) {
		this.issueName = issueName;
	}

	public Timestamp getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Timestamp startDate) {
		this.startDate = startDate;
	}

	public Status getTblStatus() {
		return this.tblStatus;
	}

	public void setTblStatus(Status tblStatus) {
		this.tblStatus = tblStatus;
	}

	public User getTblUser1() {
		return this.tblUser1;
	}

	public void setTblUser1(User tblUser1) {
		this.tblUser1 = tblUser1;
	}

	public User getTblUser2() {
		return this.tblUser2;
	}

	public void setTblUser2(User tblUser2) {
		this.tblUser2 = tblUser2;
	}

	public IssuePriority getTblPriority() {
		return this.tblPriority;
	}

	public void setTblPriority(IssuePriority tblPriority) {
		this.tblPriority = tblPriority;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(completion);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((dueDate == null) ? 0 : dueDate.hashCode());
		result = prime * result + id;
		result = prime * result
				+ ((issueName == null) ? 0 : issueName.hashCode());
		result = prime * result
				+ ((startDate == null) ? 0 : startDate.hashCode());
		result = prime * result
				+ ((tblPriority == null) ? 0 : tblPriority.hashCode());
		result = prime * result
				+ ((tblProject == null) ? 0 : tblProject.hashCode());
		result = prime * result
				+ ((tblStatus == null) ? 0 : tblStatus.hashCode());
		result = prime * result
				+ ((tblTracker == null) ? 0 : tblTracker.hashCode());
		result = prime * result
				+ ((tblUser1 == null) ? 0 : tblUser1.hashCode());
		result = prime * result
				+ ((tblUser2 == null) ? 0 : tblUser2.hashCode());
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
		Issue other = (Issue) obj;
		if (Double.doubleToLongBits(completion) != Double
				.doubleToLongBits(other.completion)) {
			return false;
		}
		if (dueDate == null) {
			if (other.dueDate != null) {
				return false;
			}
		} else if (!dueDate.equals(other.dueDate)) {
			return false;
		}
		if (id != other.id) {
			return false;
		}
		if (issueName == null) {
			if (other.issueName != null) {
				return false;
			}
		} else if (!issueName.equals(other.issueName)) {
			return false;
		}
		if (startDate == null) {
			if (other.startDate != null) {
				return false;
			}
		} else if (!startDate.equals(other.startDate)) {
			return false;
		}
		if (tblPriority == null) {
			if (other.tblPriority != null) {
				return false;
			}
		} else if (!tblPriority.equals(other.tblPriority)) {
			return false;
		}
		if (tblProject == null) {
			if (other.tblProject != null) {
				return false;
			}
		} else if (!tblProject.equals(other.tblProject)) {
			return false;
		}
		if (tblStatus == null) {
			if (other.tblStatus != null) {
				return false;
			}
		} else if (!tblStatus.equals(other.tblStatus)) {
			return false;
		}
		if (tblTracker == null) {
			if (other.tblTracker != null) {
				return false;
			}
		} else if (!tblTracker.equals(other.tblTracker)) {
			return false;
		}
		if (tblUser1 == null) {
			if (other.tblUser1 != null) {
				return false;
			}
		} else if (!tblUser1.equals(other.tblUser1)) {
			return false;
		}
		if (tblUser2 == null) {
			if (other.tblUser2 != null) {
				return false;
			}
		} else if (!tblUser2.equals(other.tblUser2)) {
			return false;
		}
		return true;
	}
	
	

}
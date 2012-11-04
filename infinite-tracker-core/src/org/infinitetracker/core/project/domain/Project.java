package org.infinitetracker.core.project.domain;

import java.io.Serializable;
import javax.persistence.*;

import org.infinitetracker.core.tracker.domain.Tracker;

import java.sql.Timestamp;


/**
 * The persistent class for the tbl_project database table.
 * 
 */
@Entity
@Table(name="tbl_project")
public class Project implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(name="project_description", length=45)
	private String projectDescription;

	@Column(name="project_name", length=45)
	private String projectName;

	@Column(name="start_date", nullable=false)
	private Timestamp startDate;

	//bi-directional many-to-one association to Tracker
	@ManyToOne
	@JoinColumn(name="tracker_id")
	private Tracker tblTracker;

	public Project() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProjectDescription() {
		return this.projectDescription;
	}

	public void setProjectDescription(String projectDescription) {
		this.projectDescription = projectDescription;
	}

	public String getProjectName() {
		return this.projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public Timestamp getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Timestamp startDate) {
		this.startDate = startDate;
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
		result = prime * result + id;
		result = prime
				* result
				+ ((projectDescription == null) ? 0 : projectDescription
						.hashCode());
		result = prime * result
				+ ((projectName == null) ? 0 : projectName.hashCode());
		result = prime * result
				+ ((startDate == null) ? 0 : startDate.hashCode());
		result = prime * result
				+ ((tblTracker == null) ? 0 : tblTracker.hashCode());
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
		Project other = (Project) obj;
		if (id != other.id) {
			return false;
		}
		if (projectDescription == null) {
			if (other.projectDescription != null) {
				return false;
			}
		} else if (!projectDescription.equals(other.projectDescription)) {
			return false;
		}
		if (projectName == null) {
			if (other.projectName != null) {
				return false;
			}
		} else if (!projectName.equals(other.projectName)) {
			return false;
		}
		if (startDate == null) {
			if (other.startDate != null) {
				return false;
			}
		} else if (!startDate.equals(other.startDate)) {
			return false;
		}
		if (tblTracker == null) {
			if (other.tblTracker != null) {
				return false;
			}
		} else if (!tblTracker.equals(other.tblTracker)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Project [id=" + id + ", projectDescription="
				+ projectDescription + ", projectName=" + projectName
				+ ", startDate=" + startDate + ", tblTracker=" + tblTracker
				+ "]";
	}
}
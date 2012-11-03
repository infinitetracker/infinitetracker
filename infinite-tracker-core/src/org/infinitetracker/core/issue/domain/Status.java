package org.infinitetracker.core.issue.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the tbl_status database table.
 * 
 */
@Entity
@Table(name="tbl_status")
public class Status implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(name="status_closed", length=5)
	private String statusClosed;

	@Column(name="status_doing", length=5)
	private String statusDoing;

	@Column(name="status_new", length=3)
	private String statusNew;

	@Column(name="status_ready", length=5)
	private String statusReady;

	//bi-directional many-to-one association to IssueStatus
	@OneToMany(mappedBy="tblStatus")
	private List<IssueStatus> tblIssueStatuses;

	public Status() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStatusClosed() {
		return this.statusClosed;
	}

	public void setStatusClosed(String statusClosed) {
		this.statusClosed = statusClosed;
	}

	public String getStatusDoing() {
		return this.statusDoing;
	}

	public void setStatusDoing(String statusDoing) {
		this.statusDoing = statusDoing;
	}

	public String getStatusNew() {
		return this.statusNew;
	}

	public void setStatusNew(String statusNew) {
		this.statusNew = statusNew;
	}

	public String getStatusReady() {
		return this.statusReady;
	}

	public void setStatusReady(String statusReady) {
		this.statusReady = statusReady;
	}

	public List<IssueStatus> getTblIssueStatuses() {
		return this.tblIssueStatuses;
	}

	public void setTblIssueStatuses(List<IssueStatus> tblIssueStatuses) {
		this.tblIssueStatuses = tblIssueStatuses;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result
				+ ((statusClosed == null) ? 0 : statusClosed.hashCode());
		result = prime * result
				+ ((statusDoing == null) ? 0 : statusDoing.hashCode());
		result = prime * result
				+ ((statusNew == null) ? 0 : statusNew.hashCode());
		result = prime * result
				+ ((statusReady == null) ? 0 : statusReady.hashCode());
		result = prime
				* result
				+ ((tblIssueStatuses == null) ? 0 : tblIssueStatuses.hashCode());
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
		Status other = (Status) obj;
		if (id != other.id) {
			return false;
		}
		if (statusClosed == null) {
			if (other.statusClosed != null) {
				return false;
			}
		} else if (!statusClosed.equals(other.statusClosed)) {
			return false;
		}
		if (statusDoing == null) {
			if (other.statusDoing != null) {
				return false;
			}
		} else if (!statusDoing.equals(other.statusDoing)) {
			return false;
		}
		if (statusNew == null) {
			if (other.statusNew != null) {
				return false;
			}
		} else if (!statusNew.equals(other.statusNew)) {
			return false;
		}
		if (statusReady == null) {
			if (other.statusReady != null) {
				return false;
			}
		} else if (!statusReady.equals(other.statusReady)) {
			return false;
		}
		if (tblIssueStatuses == null) {
			if (other.tblIssueStatuses != null) {
				return false;
			}
		} else if (!tblIssueStatuses.equals(other.tblIssueStatuses)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Status [id=" + id + ", statusClosed=" + statusClosed
				+ ", statusDoing=" + statusDoing + ", statusNew=" + statusNew
				+ ", statusReady=" + statusReady + ", tblIssueStatuses="
				+ tblIssueStatuses + "]";
	}
}
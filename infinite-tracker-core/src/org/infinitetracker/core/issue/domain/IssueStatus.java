package org.infinitetracker.core.issue.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tbl_issue_status database table.
 * 
 */
@Entity
@Table(name="tbl_issue_status")
public class IssueStatus implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(unique=true, nullable=false)
	private int id;

	//bi-directional many-to-one association to Status
	@ManyToOne
	@JoinColumn(name="status_id")
	private Status tblStatus;

	public IssueStatus() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Status getTblStatus() {
		return this.tblStatus;
	}

	public void setTblStatus(Status tblStatus) {
		this.tblStatus = tblStatus;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result
				+ ((tblStatus == null) ? 0 : tblStatus.hashCode());
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
		IssueStatus other = (IssueStatus) obj;
		if (id != other.id) {
			return false;
		}
		if (tblStatus == null) {
			if (other.tblStatus != null) {
				return false;
			}
		} else if (!tblStatus.equals(other.tblStatus)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "IssueStatus [id=" + id + ", tblStatus=" + tblStatus + "]";
	}
}
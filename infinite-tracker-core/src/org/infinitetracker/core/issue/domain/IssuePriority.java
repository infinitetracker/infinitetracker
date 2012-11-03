package org.infinitetracker.core.issue.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tbl_priority database table.
 * 
 */
@Entity
@Table(name="tbl_priority")
public class IssuePriority implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(name="priority_high", length=4)
	private String priorityHigh;

	@Column(name="priority_normal", length=6)
	private String priorityNormal;

	@Column(name="prority_low", length=3)
	private String prorityLow;

	@Column(name="prority_urgent", length=6)
	private String prorityUrgent;

	public IssuePriority() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPriorityHigh() {
		return this.priorityHigh;
	}

	public void setPriorityHigh(String priorityHigh) {
		this.priorityHigh = priorityHigh;
	}

	public String getPriorityNormal() {
		return this.priorityNormal;
	}

	public void setPriorityNormal(String priorityNormal) {
		this.priorityNormal = priorityNormal;
	}

	public String getProrityLow() {
		return this.prorityLow;
	}

	public void setProrityLow(String prorityLow) {
		this.prorityLow = prorityLow;
	}

	public String getProrityUrgent() {
		return this.prorityUrgent;
	}

	public void setProrityUrgent(String prorityUrgent) {
		this.prorityUrgent = prorityUrgent;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result
				+ ((priorityHigh == null) ? 0 : priorityHigh.hashCode());
		result = prime * result
				+ ((priorityNormal == null) ? 0 : priorityNormal.hashCode());
		result = prime * result
				+ ((prorityLow == null) ? 0 : prorityLow.hashCode());
		result = prime * result
				+ ((prorityUrgent == null) ? 0 : prorityUrgent.hashCode());
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
		IssuePriority other = (IssuePriority) obj;
		if (id != other.id) {
			return false;
		}
		if (priorityHigh == null) {
			if (other.priorityHigh != null) {
				return false;
			}
		} else if (!priorityHigh.equals(other.priorityHigh)) {
			return false;
		}
		if (priorityNormal == null) {
			if (other.priorityNormal != null) {
				return false;
			}
		} else if (!priorityNormal.equals(other.priorityNormal)) {
			return false;
		}
		if (prorityLow == null) {
			if (other.prorityLow != null) {
				return false;
			}
		} else if (!prorityLow.equals(other.prorityLow)) {
			return false;
		}
		if (prorityUrgent == null) {
			if (other.prorityUrgent != null) {
				return false;
			}
		} else if (!prorityUrgent.equals(other.prorityUrgent)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "IssuePriority [id=" + id + ", priorityHigh=" + priorityHigh
				+ ", priorityNormal=" + priorityNormal + ", prorityLow="
				+ prorityLow + ", prorityUrgent=" + prorityUrgent + "]";
	}
}
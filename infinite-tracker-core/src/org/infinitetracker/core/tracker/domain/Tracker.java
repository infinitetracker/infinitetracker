package org.infinitetracker.core.tracker.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tbl_tracker database table.
 * 
 */
@Entity
@Table(name="tbl_tracker")
public class Tracker implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(name="tracker_name", length=45)
	private String trackerName;

	public Tracker() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTrackerName() {
		return this.trackerName;
	}

	public void setTrackerName(String trackerName) {
		this.trackerName = trackerName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result
				+ ((trackerName == null) ? 0 : trackerName.hashCode());
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
		Tracker other = (Tracker) obj;
		if (id != other.id) {
			return false;
		}
		if (trackerName == null) {
			if (other.trackerName != null) {
				return false;
			}
		} else if (!trackerName.equals(other.trackerName)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Tracker [id=" + id + ", trackerName=" + trackerName + "]";
	}
}
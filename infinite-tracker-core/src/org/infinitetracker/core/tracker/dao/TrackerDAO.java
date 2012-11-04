package org.infinitetracker.core.tracker.dao;

import java.util.List;

import org.infinitetracker.core.Dao;
import org.infinitetracker.core.tracker.domain.Tracker;

public interface TrackerDAO extends Dao<Tracker>{
	
	@Override
	public Tracker create();
	
	@Override
	public Tracker delete(Tracker t);
	
	@Override
	public Tracker read(int id);
	
	@Override
	public List<Tracker> readAll();
	
	@Override
	public Tracker update(Tracker t);
}

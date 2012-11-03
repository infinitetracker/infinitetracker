package org.infinitetracker.core.issue.dao;

import java.util.List;

import org.infinitetracker.core.Dao;
import org.infinitetracker.core.issue.domain.Status;

public interface StatusDAO extends Dao<Status>{
	
	@Override
	public Status create();
	
	@Override
	public Status delete(Status t);
	
	@Override
	public Status read(int id);
	
	@Override
	public List<Status> readAll();
	
	public Status readByStatus(String statusName);
}

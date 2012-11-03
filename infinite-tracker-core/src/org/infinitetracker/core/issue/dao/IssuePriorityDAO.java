package org.infinitetracker.core.issue.dao;

import java.util.List;

import org.infinitetracker.core.Dao;
import org.infinitetracker.core.issue.domain.IssuePriority;

public interface IssuePriorityDAO extends Dao<IssuePriority>{
	
	@Override
	public IssuePriority create();
	
	@Override
	public IssuePriority delete(IssuePriority t);
	
	@Override
	public IssuePriority read(int id);
	
	@Override
	public List<IssuePriority> readAll();
	
	@Override
	public IssuePriority update(IssuePriority t);
}

package org.infinitetracker.core.issue.dao;

import java.util.List;

import org.infinitetracker.core.Dao;
import org.infinitetracker.core.issue.domain.IssueType;

public interface IssueTypeDAO extends Dao<IssueType>{
	
	@Override
	public IssueType create();
	
	@Override
	public IssueType delete(IssueType t);
	
	@Override
	public IssueType read(int id);
	
	@Override
	public List<IssueType> readAll();
	
	@Override
	public IssueType update(IssueType t);
}

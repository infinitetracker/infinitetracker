package org.infinitetracker.core.issue.dao;

import java.util.List;

import org.infinitetracker.core.Dao;
import org.infinitetracker.core.issue.domain.IssueStatus;

public interface IssueStatusDAO extends Dao<IssueStatus>{
	
	@Override
	public IssueStatus create();
	
	@Override
	public IssueStatus delete(IssueStatus t);
	
	@Override
	public IssueStatus read(int id);
	
	@Override
	public List<IssueStatus> readAll();
	
	@Override
	public IssueStatus update(IssueStatus t);
}

package org.infinitetracker.core.project.dao;

import java.util.List;

import org.infinitetracker.core.Dao;
import org.infinitetracker.core.project.domain.Project;

public interface ProjectDAO extends Dao<Project>{
	
	@Override
	public Project create();
	
	@Override
	public Project delete(Project t);
	
	@Override
	public Project read(int id);
	
	@Override
	public List<Project> readAll();
	
	@Override
	public Project update(Project t);
}

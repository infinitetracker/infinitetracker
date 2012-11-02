package org.infinitetracker.core;

import java.util.List;

public interface Dao<T> {
	T read(int id);

	List<T> readAll();

	T delete(T t);

	T create();
}

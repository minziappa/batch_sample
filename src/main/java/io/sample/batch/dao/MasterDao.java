package io.sample.batch.dao;

import java.sql.SQLException;
import java.util.Map;

public interface MasterDao {

	public int insertSample(Map<String, Object> map) throws SQLException;
	public int updateSample(Map<String, Object> map) throws SQLException;
	public int deleteSample(Map<String, Object> map) throws SQLException;

}
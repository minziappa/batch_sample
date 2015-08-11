package io.sample.batch.dao;

import io.sample.batch.bean.model.SampleModel;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public interface SlaveDao {

	public List<SampleModel> selectSampleList(Map<String, Object> map) throws SQLException;
	public SampleModel selectSample(Map<String, Object> map) throws SQLException;

}
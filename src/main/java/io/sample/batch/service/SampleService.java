package io.sample.batch.service;

import java.util.List;

import io.sample.batch.bean.model.SampleModel;
import io.sample.batch.bean.para.SamplePara;

public interface SampleService {

	public boolean insertTest (SamplePara samplePara) throws Exception;
	public boolean updateTest (SamplePara samplePara) throws Exception;
	public String selectTest (int test) throws Exception;
	public List<SampleModel> selectTestList(String test) throws Exception;
	public boolean deleteTest (String test) throws Exception;

}
package io.sample.batch.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import io.sample.batch.bean.model.SampleModel;
import io.sample.batch.bean.para.SamplePara;
import io.sample.batch.dao.MasterDao;
import io.sample.batch.dao.SlaveDao;
import io.sample.batch.service.SampleService;

import org.apache.commons.configuration.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class SampleServiceImpl implements SampleService {

	final Logger logger = LoggerFactory.getLogger(SampleServiceImpl.class);

	@Autowired
	private SqlSession masterDao;
	@Autowired
	private SqlSession slaveDao;
	@Autowired
    private Configuration configuration;

	@Transactional(rollbackFor = Exception.class, propagation = Propagation.REQUIRED)
	@Override
	public boolean insertTest(SamplePara samplePara) throws Exception {

		int result = 0;
		Map<String, Object> insertMap = new HashMap<String, Object>();
		insertMap.put("sampleName", samplePara.getSampleName());
		insertMap.put("samplePwd", samplePara.getSamplePwd());
		insertMap.put("sampleStatus", samplePara.getSampleStatus());

		try {
			result = masterDao.getMapper(MasterDao.class).insertSample(insertMap);
			if(result < 1) {
				return false;
			}
		} catch (Exception e) {
			logger.error("Exception error", e);
		}
		
		return true;
	}

	@Transactional(rollbackFor = Exception.class, propagation = Propagation.REQUIRED)
	@Override
	public boolean updateTest(SamplePara samplePara) throws Exception {

		int result = 0;
		Map<String, Object> updateMap = new HashMap<String, Object>();
		updateMap.put("sampleName", samplePara.getSampleName());
		updateMap.put("sampleStatus", samplePara.getSampleStatus());

		try {
			result = masterDao.getMapper(MasterDao.class).updateSample(updateMap);
			if(result < 1) {
				return false;
			}
		} catch (Exception e) {
			logger.error("Exception error", e);
		}

		return true;
	}

	@Override
	public String selectTest(int id) throws Exception {

		Map<String, Object> selectMap = new HashMap<String, Object>();
		selectMap.put("sampleId", id);

		SampleModel sample = null;
		try {
			sample = slaveDao.getMapper(SlaveDao.class).selectSample(selectMap);
			if(sample == null) {
				return null;
				// throw new Exception();
			}

			logger.info("Result = " + sample.getSampleName());
		} catch (Exception e) {
			logger.error("Exception error", e);
		}

		return sample.getSampleStatus();
	}

	@Override
	public List<SampleModel> selectTestList(String test) throws Exception {

		List<SampleModel> sampleList = null;
		
		Map<String, Object> selectMap = new HashMap<String, Object>();
		selectMap.put("sampleName", test);

		try {
			sampleList = slaveDao.getMapper(SlaveDao.class).selectSampleList(selectMap);
			if(sampleList == null) {
				return null;
				// throw new Exception();
			}

		} catch (Exception e) {
			logger.error("Exception error", e);
		}

		return sampleList;
	}

	@Transactional(rollbackFor = Exception.class, propagation = Propagation.REQUIRED)
	@Override
	public boolean deleteTest(String test) throws Exception {

		int result = 0;
		Map<String, Object> deleteMap = new HashMap<String, Object>();
		deleteMap.put("sampleName", test);

		try {
			result = masterDao.getMapper(MasterDao.class).deleteSample(deleteMap);
			if(result < 1) {
				return false;
			}
		} catch (Exception e) {
			logger.error("Exception error", e);
		}

		return true;
	}

}
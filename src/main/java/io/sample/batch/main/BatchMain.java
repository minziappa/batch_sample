package io.sample.batch.main;

import java.util.List;

import io.sample.batch.bean.model.SampleModel;
import io.sample.batch.bean.para.SamplePara;
import io.sample.batch.service.SampleService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BatchMain {

	final static Logger logger = LoggerFactory.getLogger(BatchMain.class);
	
	@Autowired
    private static SampleService sampleService;

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {

		ApplicationContext context = new ClassPathXmlApplicationContext("springConfig.xml");
		SampleService sampleService = (SampleService) context.getBean("sampleServiceImpl");

		SamplePara samplePara = new SamplePara();
		// Insert
		samplePara.setSampleName("test1");
		samplePara.setSamplePwd("pwd1");
		samplePara.setSampleStatus("0");
		sampleService.insertTest(samplePara);

		// Update
		samplePara.setSampleName("test1");
		samplePara.setSampleStatus("1");
		sampleService.updateTest(samplePara);

		// Select
		sampleService.selectTest(1);
		// Select List
		List<SampleModel> sampleList = sampleService.selectTestList("test1");
		for(SampleModel sample : sampleList) {
			logger.info(sample.getSampleName());
			logger.info(sample.getSamplePwd());
			logger.info(sample.getSampleStatus());
		}

		// Delete
		sampleService.deleteTest("test1");

	}

}
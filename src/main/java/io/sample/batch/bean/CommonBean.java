package io.sample.batch.bean;

import io.sample.batch.bean.model.SampleModel;

import java.io.Serializable;
import java.util.List;

public class CommonBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private List<SampleModel> sampleModel;

	public List<SampleModel> getSampleModel() {
		return sampleModel;
	}

	public void setSampleModel(List<SampleModel> sampleModel) {
		this.sampleModel = sampleModel;
	}

}
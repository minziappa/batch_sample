package io.sample.batch.bean.model;

import java.util.Date;

public class SampleModel {

	private long sampleId;
	private String sampleName;
	private String samplePwd;
	private String sampleStatus;
	private Date insertDate;
	private Date updateDate;

	public long getSampleId() {
		return sampleId;
	}
	public void setSampleId(long sampleId) {
		this.sampleId = sampleId;
	}
	public String getSampleName() {
		return sampleName;
	}
	public void setSampleName(String sampleName) {
		this.sampleName = sampleName;
	}
	public String getSamplePwd() {
		return samplePwd;
	}
	public void setSamplePwd(String samplePwd) {
		this.samplePwd = samplePwd;
	}
	public String getSampleStatus() {
		return sampleStatus;
	}
	public void setSampleStatus(String sampleStatus) {
		this.sampleStatus = sampleStatus;
	}
	public Date getInsertDate() {
		return insertDate;
	}
	public void setInsertDate(Date insertDate) {
		this.insertDate = insertDate;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

}
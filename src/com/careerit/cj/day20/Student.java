package com.careerit.cj.day20;

public class Student {

	private String name;
	private String batch;
	private String cStatus;
	private String pStatus;
	private String qualification;
	private float score;

	public Student() {
	}

	public Student(String name, String batch, String cStatus, String pStatus, String qualification, float score) {
		this.name = name;
		this.batch = batch;
		this.cStatus = cStatus;
		this.pStatus = pStatus;
		this.qualification = qualification;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBatch() {
		return batch;
	}

	public void setBatch(String batch) {
		this.batch = batch;
	}

	public String getcStatus() {
		return cStatus;
	}

	public void setcStatus(String cStatus) {
		this.cStatus = cStatus;
	}

	public String getpStatus() {
		return pStatus;
	}

	public void setpStatus(String pStatus) {
		this.pStatus = pStatus;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public float getScore() {
		return score;
	}

	public void setScore(float score) {
		this.score = score;
	}

}

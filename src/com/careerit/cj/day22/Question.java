package com.careerit.cj.day22;

import java.util.List;

public class Question {

	private int id;
	private String qdata;
	private List<String> options;
	private String answer;

	public Question() {
		super();
	}

	public Question(int id, String qdata, List<String> options, String answer) {
		super();
		this.id = id;
		this.qdata = qdata;
		this.options = options;
		this.answer = answer;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getQdata() {
		return qdata;
	}

	public void setQdata(String qdata) {
		this.qdata = qdata;
	}

	public List<String> getOptions() {
		return options;
	}

	public void setOptions(List<String> options) {
		this.options = options;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	@Override
	public String toString() {
		return "Question [id=" + id + ", qdata=" + qdata + ", options=" + options + ", answer=" + answer + "]";
	}
	

}

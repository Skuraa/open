package com.example.demo.entity;

import java.io.Serializable;

public class Recruitment implements Serializable{
	private Integer recId;
	private Integer depId;
	private Integer posId;
	private String description;


	public Recruitment() {
	}

	public Recruitment(Integer depId, Integer posId, String description) {
		this.depId = depId;
		this.posId = posId;
		this.description = description;
	}

	public Integer getRecId() {
		return recId;
	}

	public void setRecId(Integer recId) {
		this.recId = recId;
	}

	public Integer getDepId() {
		return depId;
	}

	public void setDepId(Integer depId) {
		this.depId = depId;
	}

	public Integer getPosId() {
		return posId;
	}

	public void setPosId(Integer posId) {
		this.posId = posId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Recruitment{" +
				"recId=" + recId +
				", depId=" + depId +
				", posId=" + posId +
				", description='" + description + '\'' +
				'}';
	}
}


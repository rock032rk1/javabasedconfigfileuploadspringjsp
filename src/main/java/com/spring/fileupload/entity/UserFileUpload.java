package com.spring.fileupload.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_fileupload")
public class UserFileUpload {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int uid;
	private String filename;
	private String savepath;
	
	public UserFileUpload() {
		// TODO Auto-generated constructor stub
	}

	public UserFileUpload(String filename, String savepath) {
		super();
		this.filename = filename;
		this.savepath = savepath;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public String getSavepath() {
		return savepath;
	}

	public void setSavepath(String savepath) {
		this.savepath = savepath;
	}
	
	
}

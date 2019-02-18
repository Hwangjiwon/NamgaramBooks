package org.zerock.domain;

import java.util.Date;

//Lombok�� �̿��� �����ڿ� getter/setter, toString�� ����� ���� ��� �̿�. �̸� ���� Data������̼� ����
public class BoardVO {
	
	private String title;
	private String content;
	private String writer;
	private Date regdate;
	private Date updateDate;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
}
package com.example.demo.ex4;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class ClassEx4 
{
	private int pid;
	private String pname;
	@JsonIgnore
	private String page;
	
	public ClassEx4() {}

	public ClassEx4(int pid, String pname, String page) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.page = page;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getPage() {
		return page;
	}

	public void setPage(String page) {
		this.page = page;
	}
}
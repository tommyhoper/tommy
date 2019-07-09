package com.woniu.po;

public class Dept {
	private int dno;
	private int dname;
	private String loc;

	public Dept() {
		super();
	}

	public Dept(int dno, int dname, String loc) {
		super();
		this.dno = dno;
		this.dname = dname;
		this.loc = loc;
	}

	public int getDno() {
		return dno;
	}

	public void setDno(int dno) {
		this.dno = dno;
	}

	public int getDname() {
		return dname;
	}

	public void setDname(int dname) {
		this.dname = dname;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

}

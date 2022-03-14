package com.example.demo;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
public class Customers {
	
private int cid;
private String cname;
private String cemail;

public int getCid() {
	return cid;
}
public String getCname() {
	return cname;
}
public String getCemail() {
	return cemail;
}
public void setCid(int cid) {
	this.cid = cid;
}
public void setCname(String cname) {
	this.cname = cname;
}
public void setCemail(String cemail) {
	this.cemail = cemail;



}
@Override
public String toString() {
	return "Customers [cid=" + cid + ", cname=" + cname + ", cemail=" + cemail + "]";
}
}

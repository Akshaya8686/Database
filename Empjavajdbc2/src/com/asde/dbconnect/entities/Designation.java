package com.asde.dbconnect.entities;


public class Designation 
{

public int desgid;
public String desgname;
public String desgdesc;
public Designation()
{
	
}
public Designation(int desgid, String desgname, String desgdesc) {
	super();
	this.desgid = desgid;
	this.desgname = desgname;
	this.desgdesc = desgdesc;
}
@Override
public String toString() {
	return "Designation [desgid=" + desgid + ", desgname=" + desgname + ", desgdesc=" + desgdesc + "]";
}


}

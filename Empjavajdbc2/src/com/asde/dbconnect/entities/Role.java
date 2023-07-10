package com.asde.dbconnect.entities;


public class Role
{

public int roleid;
public String rolename;
public String roledesc;
public Role(int roleid, String rolename, String roledesc) {
	super();
	this.roleid = roleid;
	this.rolename = rolename;
	this.roledesc = roledesc;
}
@Override
public String toString() {
	return "Role [roleid=" + roleid + ", rolename=" + rolename + ", roledesc=" + roledesc + "]";
}


}

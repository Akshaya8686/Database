package com.asde.dbconnect.entities;


import java.time.LocalDate;
public class Employee 
{
public int employeeId;
public String firstName;
public String lastName;
public String surName;
public LocalDate joiningDate;
public LocalDate birthDate;
public String qualification;
public String address;
public int contactNo;
public Designation designation;


public  Employee ()
{
	
	
}
public int getEmployeeId() {
	return employeeId;
}
public void setEmployeeId(int employeeId) {
	this.employeeId = employeeId;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getSurName() {
	return surName;
}
public void setSurName(String surName) {
	this.surName = surName;
}
public LocalDate getJoiningDate() {
	return joiningDate;
}
public void setJoiningDate(LocalDate joiningDate) {
	this.joiningDate = joiningDate;
}
public LocalDate getBirthDate() {
	return birthDate;
}
public void setBirthDate(LocalDate birthDate) {
	this.birthDate = birthDate;
}
public String getQualification() {
	return qualification;
}
public void setQualification(String qualification) {
	this.qualification = qualification;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public int getContactNo() {
	return contactNo;
}
public void setContactNo(int contactNo) {
	this.contactNo = contactNo;
}
public Designation getDesignation() {
	return designation;
}
public void setDesignation(Designation designation) {
	this.designation = designation;
}
public Role getRole() {
	return role;
}
public void setRole(Role role) {
	this.role = role;
}
public Role role;
public Employee(int employeeId, String firstName, String lastName, String surName, LocalDate joiningDate,
		LocalDate birthDate, String qualification, String address, int contactNo, Designation designation, Role role) {
	super();
	this.employeeId = employeeId;
	this.firstName = firstName;
	this.lastName = lastName;
	this.surName = surName;
	this.joiningDate = joiningDate;
	this.birthDate = birthDate;
	this.qualification = qualification;
	this.address = address;
	this.contactNo = contactNo;
	this.designation = designation;
	this.role = role;
}
@Override
public String toString() {
	return "Employee [employeeId=" + employeeId + ", firstName=" + firstName + ", lastName=" + lastName + ", surName="
			+ surName + ", joiningDate=" + joiningDate + ", birthDate=" + birthDate + ", qualification=" + qualification
			+ ", address=" + address + ", contactNo=" + contactNo + ", designation=" + designation + ", role=" + role
			+ "]";
}



}




/*public class Employee 
{
public int employeeId;
public String firstName;
String lastName;
String surName;
LocalDate joiningDate;
LocalDate birthDate;
String qualification;
String address;
int contactNo;
String designation;
String role;
public Employee(int employeeId, String firstName, String lastName, String surName, LocalDate joiningDate, LocalDate birthDate,
		String qualification, String address, int contactNo, String designation, String role) {
	super();
	this.employeeId = employeeId;
	this.firstName = firstName;
	this.lastName = lastName;
	this.surName = surName;
	this.joiningDate = joiningDate;
	this.birthDate = birthDate;
	this.qualification = qualification;
	this.address = address;
	this.contactNo = contactNo;
	this.designation = designation;
	this.role = role;
}



public Employee()
{
	
	
}



@Override
public String toString() {
	return "Employee [employeeId=" + employeeId + ", firstName=" + firstName + ", lastName=" + lastName + ", surName="
			+ surName + ", joiningDate=" + joiningDate + ", birthDate=" + birthDate + ", qualification=" + qualification
			+ ", address=" + address + ", contactNo=" + contactNo + ", designation=" + designation + ", role=" + role
			+ "]";
}


	

}*/

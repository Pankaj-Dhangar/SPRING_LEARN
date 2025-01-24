package org.dnyanyog.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
	public String firstName = new String();
	public Long l;
	public Integer p;
	
	public String lastName;
	public String branchName;
	public int age;
	public String mobile;
	
	@Autowired    // ask spring to create object
	private Address address = new Address();
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public Long getL() {
		return l;
	}
	public void setL(Long l) {
		this.l = l;
	}
	public Integer getP() {
		return p;
	}
	public void setP(Integer p) {
		this.p = p;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", l=" + l + ", p=" + p + ", lastName=" + lastName + ", branchName="
				+ branchName + ", age=" + age + ", mobile=" + mobile + ", address=" + address + "]";
	}
	
	
}

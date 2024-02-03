package in.ineuron.comp;

import java.util.Date;

public class Employee {
	
	private int eno;
	private String ename;
	private Date dob;
	private Department department;
	
	public int getEno() {
		return eno;
	}
	
	public void setEno(int eno) {
		this.eno = eno;
	}
	
	public String getEname() {
		return ename;
	}
	
	public void setEname(String ename) {
		this.ename = ename;
	}
	
	public Date getDob() {
		return dob;
	}
	
	public void setDob(Date dob) {
		this.dob = dob;
	}
	
	public Department getDepartment() {
		return department;
	}
	
	public void setDepartment(Department department) {
		this.department = department;
	}
	
	@Override
	public String toString() {
		return "Employee [eno=" + eno + ", ename=" + ename + ", dob=" + dob + ", debt=" + department + "]";
	}
	
	
}

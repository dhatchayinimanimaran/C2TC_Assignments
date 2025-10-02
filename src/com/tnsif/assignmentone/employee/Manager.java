package com.tnsif.assignmentone.employee;

public class Manager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 private String department;

		    public Manager(String name, String employeeId, double salary, String department) {
		        super(name, employeeId, salary);
		        this.department = department;
		    }

		    public String getDepartment() {
		        return department;
		    }
		    public void setDepartment(String department) {
		        this.department = department;
		    }

		    @Override
		    public void displayInfo() {
		        super.displayInfo();
		        System.out.println("Department: " + department);

	}

}

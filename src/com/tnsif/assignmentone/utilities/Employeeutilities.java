package com.tnsif.assignmentone.utilities;

public class Employeeutilities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		import com.tnsif.assignmentone.employee.Employee;

		public class EmployeeUtilities {

		    public void giveRaise(Employee emp, double amount) {
		        double newSalary = emp.getSalary() + amount;
		        emp.setSalary(newSalary);
		        System.out.println(emp.getName() + " got a raise. New Salary: " + newSalary);
		    }

		    public void printEmployeeDetails(Employee emp) {
		        emp.displayInfo();


	}

}

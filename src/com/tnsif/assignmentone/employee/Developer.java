package com.tnsif.assignmentone.employee;

public class Developer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		private String programmingLanguage;

	    public Developer(String name, String employeeId, double salary, String programmingLanguage) {
	        super(name, employeeId, salary);
	        this.programmingLanguage = programmingLanguage;
	    }

	    public String getProgrammingLanguage() {
	        return programmingLanguage;
	    }
	    public void setProgrammingLanguage(String programmingLanguage) {
	        this.programmingLanguage = programmingLanguage;

	    @Override
	    public void displayInfo() {
	        super.displayInfo();
	        System.out.println("Programming Language: " + programmingLanguage);
	}

}

package org.test;

public class Employee {
private void employeeDetails() {
System.out.println("EmployeeDetails");
}
//differ by datatype
private void employeeDetails(float age) {
System.out.println("Employee age:"+" "+age);
}
private void employeeDetails(int age) {
System.out.println("Employee age:"+" "+age);}
//differ by datatype order
private void employeeDetails(int year, int date){
	System.out.println("Employee year: "+  year +"\n"+ "Employee date: " + date);
	
}
private void employeeDetails(String name){
	System.out.println("Employee Name: "+ name );
}


public void employeeDetails(String fn, String ln) {
	System.out.println("hi");
}


public static void main(String[] args) {
	Employee e= new Employee();
	e.employeeDetails(4);
	e.employeeDetails(16);
	e.employeeDetails(1996, 14);
			e.employeeDetails("Akshaya");
}


}

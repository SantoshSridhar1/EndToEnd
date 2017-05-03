package com.wipro.main;

import java.util.ArrayList;
import java.util.List;

import com.wipro.entity.Employee;

public class MyService {
	
	static List<Employee> employees=new ArrayList<Employee>();

	public MyService(){
				
		Employee e1=new Employee(1, "Santosh");
		Employee e2=new Employee(2, "Collence");
		 employees.add(e1);
		 employees.add(e2);		 
		
		}
	
	
	public int add(int a,int b){
		
		return a+b;
	}
	
	public String getMessage(String name){
		
		return "Welcome "+name;
	}

	
	public Employee getEmployeeById(int id){
		
		Employee emp=null;
		
		for(Employee e:employees){
			if(e.getId()==id){
				emp=e;
			}
		}
		
		return emp;
	}
	
	public List<Employee> getAllEmployees(){
			return employees;
	}

	public static List<Employee> getEmployees() {
		return employees;
	}

	public static void setEmployees(List<Employee> employees) {
		MyService.employees = employees;
	}
	
	
	
}

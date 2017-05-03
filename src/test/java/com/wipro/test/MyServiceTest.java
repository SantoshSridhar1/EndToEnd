package com.wipro.test;
import static org.junit.Assert.*;
import java.util.List;
import org.junit.Test;
import com.wipro.entity.Employee;
import com.wipro.main.MyService;

public class MyServiceTest {
	

	@Test
	public void testAdd() {
		assertEquals(5,new MyService().add(3, 2));
		assertEquals(6,new MyService().add(3, 3));
		assertEquals(5,new MyService().add(1, 4));
		assertEquals(2,new MyService().add(1, 1));
		assertEquals(6,new MyService().add(3, 3));
		
	}

	@Test
	public void testGetMessage() {
		assertEquals("Welcome Santosh",new MyService().getMessage("Santosh"));
	}

	@Test
	public void testGetEmployeeById() {
		MyService ms=new MyService();
		assertNull(ms.getEmployeeById(-34));		
		assertNotNull(ms.getEmployees());
		
	}

	@Test
	public void testGetAllEmployees() {
		List<Employee> emps=new MyService().getAllEmployees();
		assertNotNull(emps);
		//assertEquals(2,emps.size());		
		assertEquals("Santosh",emps.get(0).getName());
	}

}

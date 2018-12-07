package TestingPackage;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;

import org.junit.Test;

import peoplePackgae.Main;
import peoplePackgae.People;

public class Testing {
	
	@Test
	public void testShowEmployeeNotNull() {
		People person = new People("karibo", 21 , "Artist");
		ArrayList<People> worker = new ArrayList<People>();
		worker.add(person);
		
		assertNotNull("The object is null" , Main.showEmployees(worker));
	}
	
	@Test
	public void testShowEmployeeMatchesInput() { 
		People person = new People("karibo", 21 , "Artist");
		ArrayList<People> worker = new ArrayList<People>();
		worker.add(person);
		assertEquals("The input and ouput employee are not the same", "karibo 21 Artist", Main.showEmployees(worker));
		
    }
	
	

}

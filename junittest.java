import org.junit.Test;

import junit.framework.TestCase;


public class junittest extends TestCase {
	
	@Test
	public void test(){
		Employee employee1  = new Employee(30, "JOB1", 1250);
		Employee employee2  = new Employee(40, "JOB2", 1000);
		
		employee1.setEmployee_name("EMP1");
		
		assertEquals("EMP1", employee1.getEmployee_name());
	}

}

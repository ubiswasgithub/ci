
public class EmployeeTest {
	
	public static void main(String args[]){
		Employee employee1  = new Employee(30, "JOB1", 1250);
		Employee employee2  = new Employee(40, "JOB2", 1000);
		
		employee1.setEmployee_name("EMP1");
		employee1.increaseBonus(50);
		employee1.display();
		
		employee2.setEmployee_name("EMP2");
		employee2.increaseBonus(50);
		employee2.display();	
		
		
	}

}

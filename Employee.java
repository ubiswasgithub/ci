
public class Employee {
	
	private String employee_name;
	public String job_title;
	public double salary;
	public double bonus=150;
	public int age;
	
	Employee(int age, String job_title,double salary){
		this.age = age;
		this.job_title = job_title;
		this.salary = salary;
	}	
	
	public String getEmployee_name() {
		return employee_name;
	}
	public void setEmployee_name(String employee_name) {
		this.employee_name = employee_name;
	}
	
	public void increaseBonus(double increment){
		this.bonus = this.bonus+increment;
		this.salary = this.salary+this.bonus;
	}
	
	
	public void display(){
		System.out.println("Employee name: "+ this.getEmployee_name()+"\n Age:"+this.age+"\n Job Title: "+ this.job_title+"\n Salary: "+this.salary);
		
	}
	
	
}

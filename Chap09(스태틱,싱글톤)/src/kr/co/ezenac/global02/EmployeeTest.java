package kr.co.ezenac.global02;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee employee1 = new Employee();
		employee1.setEmployeeName("이순신");
		
		
		Employee employee2 = new Employee();
		employee2.setEmployeeName("진도준");
		
		
		System.out.println
		(employee1.getEmployeeName() + ", " + employee1.getEmployeeId());
		System.out.println
		(employee2.getEmployeeName() + ", " + employee2.getEmployeeId());
		
		System.out.println(Employee.serialNum);
		
		Employee.setSerialNum(1003);
		Employee.getSerialNum();
	}

}

package OOPSAssignmentEmployee;

public class EmployeeClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeDaoImpl emp=new EmployeeDaoImpl();
		System.out.println("Adding employee:");
		emp.addEmployee();
		System.out.println("Viewing employee:");
		emp.viewEmployee();

	}

}

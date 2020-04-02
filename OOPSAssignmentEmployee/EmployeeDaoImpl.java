package OOPSAssignmentEmployee;
import java.util.*;

public class EmployeeDaoImpl implements EmployeeDao {
	int eno;
	String ename;
	String address;
	
	Scanner sc=new Scanner(System.in);
	
	@Override
	public void addEmployee() {
		// TODO Auto-generated method stub
		System.out.print("Enter Employee Number:");
		eno=sc.nextInt();
		System.out.print("Enter Employee Name:");
		ename=sc.next();
		System.out.print("Enter Employee Address:");
		address=sc.next();	
		
	}

	@Override
	public void viewEmployee() {
		// TODO Auto-generated method stub
		System.out.println(eno+"\t"+ename+"\t"+address);
		
	}

}

package objectorientprogram;

class Person{
	private String firstname;
	private String lastname;
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
}

class Student extends Person{
	
	private int sno;
	private int age;
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
class Employee extends Person{
	private int eno;
	private int age;
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}

public class Inheritance {
	public static void main(String[] args)
	{
		System.out.println("Student Details");
		Student stu=new Student();
		stu.setSno(100);
		stu.setAge(27);
		stu.setFirstname("Ruby");
		stu.setLastname("Parveen");
		System.out.println(stu.getSno()+"\t"+stu.getFirstname()+"\t"+stu.getLastname()+"\t"+stu.getAge());
		System.out.println("Employee Details");
		Employee emp=new Employee();
		emp.setEno(102);
		emp.setFirstname("Rubyss");
		System.out.println(emp.getEno()+"\t"+emp.getFirstname()+"\t"+emp.getLastname()+"\t"+emp.getAge());
		
	}

}

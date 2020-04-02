package objectorientprogram;

public class ConstructorOverloadingThis {
	
	int pid;
	String pname;
//Constructor overloading
	public ConstructorOverloadingThis() {
		this(100,"tv");
		System.out.println("Default constructor");
		
	}

	public ConstructorOverloadingThis(int pid, String pname) {
		this.pid = pid;
		this.pname = pname;
		System.out.println("Parameterized constructor");
		
	}
	
	void display()
	{
		System.out.println(pid+"\t"+pname);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorOverloadingThis demo=new ConstructorOverloadingThis();
		demo.display();

	}

}

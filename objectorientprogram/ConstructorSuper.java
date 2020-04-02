package objectorientprogram;

class cons{
	
	public cons(int x,int y) {
		System.out.println(x+y);
		System.out.println("Parent Class parameterized constructor");
	}

	//if we have default then it will not throw error in child class
	public cons() {
		this(50,100);
		System.out.println("Cons parent default constructor ");
		
	}
	
}


public class ConstructorSuper extends cons {

	public ConstructorSuper(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
		System.out.println("Child Class constructor");
	}
	
	public ConstructorSuper()
	{
		//super();this will be defaultly executed even if we do not mention it
		System.out.println("child default constructor ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorSuper demo=new ConstructorSuper(10,20);
		ConstructorSuper demo1=new ConstructorSuper();

	}

}

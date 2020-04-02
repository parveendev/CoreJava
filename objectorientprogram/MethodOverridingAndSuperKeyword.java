package objectorientprogram;

class vehicle{
	//method overrriding is child class having the same run method with same name and parameters
	void run()
	{
		System.out.println("Parent Class run method");
	}
	void display()
	{
		System.out.println("Parent Class display method");
	}
}

public class MethodOverridingAndSuperKeyword extends vehicle {
	
	 void run()
	{
		super.run(); // super keyword is used to call the parent class run method
		display();   //No need of super keyword, since non static methods can be called in non static method
		super.display(); // not the best approach
		System.out.println("Child Class run method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverridingAndSuperKeyword demo=new MethodOverridingAndSuperKeyword();
		demo.run();

	}

}

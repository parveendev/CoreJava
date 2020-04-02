package objectorientprogram;

public class MethodOverloadingPolymor {
	//method overloading
	//different no.of arguments/parameters
	void display(int x,int y)
	{
		int res=x+y;
		System.out.println("Adding of two numbers:"+res);
	}
	
	int display(int x,int y,int z)
	{
		int res=x+y+z;
		System.out.println("Adding of three numbers:"+res);
		return res; //method overloading can have different return types as well but method name should be same
	}
	
	//----------------------------------------------------------------
	//same no.of arguments but different datatypes
	
	void display(String sname, int sno)
	{
		System.out.println(sname+"\t"+sno);
	}
	
	void display(int sno, String sname)
	{
		System.out.println(sno+"\t"+sname);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloadingPolymor sum=new MethodOverloadingPolymor();
		sum.display(100,200,300); //calls line 12
		
		sum.display("Ruby",124); //calls line 22

	}

}

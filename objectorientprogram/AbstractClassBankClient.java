package objectorientprogram;

abstract class Bank{
	abstract int getRateofInterset();
	void display() // where to access this method
	{
		System.out.println("Hello");
	}
}

class ICICI extends Bank
{
//	super.display();// throwing error in the remaining code
	@Override
	int getRateofInterset() {
		// TODO Auto-generated method stub
		return 9;
		
	}
	
class Canara extends Bank
{
	@Override
	int getRateofInterset() {
		// TODO Auto-generated method stub
		return 5;
	}
}
	
}

public class AbstractClassBankClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ICICI bnk=new ICICI();
		System.out.println(bnk.getRateofInterset());
		
		
	}

}

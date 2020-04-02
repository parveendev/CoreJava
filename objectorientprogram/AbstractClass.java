package objectorientprogram;

abstract class Bike
{
	abstract void run();
}

class Honda extends Bike
{
	@Override
	void run() {
		// TODO Auto-generated method stub
		System.out.println("Honda child class run method");
		
	}
	
}
class Pulsar extends Bike
{
	@Override
	void run() {
		// TODO Auto-generated method stub
		System.out.println("Pulsar child class run method");
	}
	
}

public class AbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Honda ho=new Honda();
		ho.run();
		Pulsar pul=new Pulsar();
		pul.run();

	}

}

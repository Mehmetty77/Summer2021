package day30exceptionsinterfacesiteratorscollections;

public class HondaCivic implements Engine, AirCondition, Music {

	public static void main(String[] args) {
		//

	}

	@Override
	public void gasUsage() {
		// 
		System.out.println("it uses gas like smelling...");
		
	}

	@Override
	public void speedLimit() {
		// 
		System.out.println("No Limit");
		
		
	}

	@Override
	public void climate() {
		// 
		
		System.out.println("No need to use, it uses gas too much");
		
	}

	@Override
	public void sound() {
		// 
		System.out.println("Lower the Volume");
		
	}

	@Override
	public void tune() {
		// 
		System.out.println("Tune Honda Radio...");
		
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}

}

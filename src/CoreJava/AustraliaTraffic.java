package CoreJava;

public class AustraliaTraffic implements CentralTraffic,ContinentalTraffic{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CentralTraffic a = new AustraliaTraffic();//create object for this class, referring to the method in AustraliaTraffic
		// create obj for this class to impl the methods present in CentralTraffic interface 
		a.RedStop();
		//a.YellowSlow();
		a.GreenGo();
		AustraliaTraffic a1= new AustraliaTraffic();
		ContinentalTraffic c= new AustraliaTraffic();
		a1.walkonsymbol();
		c.Trainsymbol();
		parentDemo pd = new parentDemo();
		pd.getStringData();
	}

	@Override
	public void GreenGo() {
		// TODO Auto-generated method stub
		System.out.println("Green Go");
	}

	@Override
	public void YellowSlow() {
		// TODO Auto-generated method stub
		System.out.println("Yellow slow implementation");
	}

	@Override
	public void RedStop() {
		// TODO Auto-generated method stub
		System.out.println("Redstop implementation");
	}
	public void walkonsymbol() {
		System.out.println("Walking");
	}

	@Override
	public void Trainsymbol() {
		// TODO Auto-generated method stub
		System.out.println("Continental Traffic rules");
		
	}
}

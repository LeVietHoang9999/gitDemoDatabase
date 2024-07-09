package demoPackage;

public class exceptionDemo {
	
	
	protected void getDataexceptiondemo() {
		System.out.println("This is the method getData from exceptionDemo class");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=4;
		int b = 7; 
		int c = 0;
		String ab = null;
		try {
			int k= b/c;
			
			System.out.println(ab.length());
		}//multiple catch block
		catch(NullPointerException npe) {
			System.out.println("The value of the string variable is null ");
		}
		catch(ArithmeticException et) {
			System.out.println(ab);
			System.out.println("Throw the Arithmetic Exception devide to Zero");
		}
		
		catch(Exception e) {
			System.out.println("Throw the exception");
		} 
		finally{
			//this block executes irrespectively of exception throw or not 
			System.out.println("Delete the cookies");
		}
	}

}

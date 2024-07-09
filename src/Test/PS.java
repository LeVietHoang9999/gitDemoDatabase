package Test;
import org.testng.annotations.BeforeMethod;

public class PS {
	public void doThis() {
		System.out.println("The function uses inheritance trait");
	}
	@BeforeMethod
	public void befoMethod() {
		System.out.println("Use before method in TestNG");
	}
}

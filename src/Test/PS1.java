package Test;
import org.testng.annotations.Test;

public class PS1 extends PS{
	@Test
	public void TestRun() {
		doThis();
		int a = 2;
		PS2 ps2 = new PS2(a);
		System.out.println(ps2.increment());
		System.out.println(ps2.decrement());
		System.out.println(ps2.multiplyFive());
	}
}

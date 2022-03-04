package jdbc;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
public class JunitTest{
	@Test
	public void display() {
		System.out.println(" welcome to Technoserve!!!!!!!");
	}
	@Disabled
	@Test
	public void display1()
	{
		System.out.println(" welcome to Capgemini!!!!!!!");

	}
}
package junit5;


	import static org.junit.Assert.assertNotNull;
	import static org.junit.jupiter.api.Assertions.assertAll;
	import static org.junit.jupiter.api.Assertions.assertEquals;

	import org.junit.jupiter.api.Test;
	public class Assert1 {
	
		
		@Test
		void demo() {
			Student st = new Student("Ranju", "naik");
			assertAll("student", () -> assertEquals("Ranju", st.getFirstName()), 
					() -> assertEquals("naik", st.getLastName()));
		}
	}

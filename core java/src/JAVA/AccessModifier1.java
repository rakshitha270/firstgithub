package JAVA;


	public class AccessModifier1{
		int nos;
		float hrs;
		int noc;
	public	void displayStudents() {
			System.out.println("Number of Students:AccessModifier1");
		}
	private	void displayHours() {
			System.out.println("Number of Hours:AccessModifier1");
		}
	protected	void displayClass() {
			System.out.println("Number of Class:AccessModifier1");
		}


		public static void main(String[] args) {
			AccessModifier am1 = new AccessModifier();
			AccessModifier am2 = new AccessModifier();
			am1.displayStudents();
			am2.displayStudents();
			
			am1.displayHours();
			
			am1.displayClass();
			am2.displayClass();
		}

	}
		

	


	

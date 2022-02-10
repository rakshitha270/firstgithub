package JAVA;


	public class AccessModifier{
		int nos;
		float hrs;
		int noc;
	public	void displayStudents() {
			System.out.println("Number of Students:AccessModifier");
		}
	protected	void displayHours() {
			System.out.println("Number of Hours:AccessModifier");
		}
	protected	void displayClass() {
			System.out.println("Number of Class:AccessModifier");
		}


		public static void main(String[] args) {
			AccessModifier am = new AccessModifier();
			AccessModifier am1 = new AccessModifier();
			am.displayStudents();
			am1.displayStudents();
			
			am.displayHours();
			
			am.displayClass();
			am1.displayClass();
		}

	}
		

	



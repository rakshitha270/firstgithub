package JAVA;


	public class AccessModifier2{
		int nos;
		float hrs;
		int noc;
		void displayStudents() {
			System.out.println("Number of Students:AccessModifier2");
		}
		void displayHours() {
			System.out.println("Number of Hours:AccessModifier2");
		}
		void displayClass() {
			System.out.println("Number of Class:AccessModifier2");
		}


		public static void main(String[] args) {
			AccessModifier2 am2 = new AccessModifier2();
			am2.displayStudents();
			am2.displayHours();
			am2.displayClass();
			

	}
		

	}
	



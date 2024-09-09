package MidtermBusFareProgram;

public class MainTestProgram {
	public static void main (String args[]) {
		
		// Construct Student object called "Ed".
		Student Ed = new Student();
		
		//Call method to print ticket.
		//Ed.ticket();
		System.out.println(Ed.ticket());
		
		// Construct Adult object called "Amy" and call method to print ticket.
		Adult Amy = new Adult();
		System.out.println(Amy.ticket());
		//Call method to print ticket.
		//Amy.ticket();
				

	}
}

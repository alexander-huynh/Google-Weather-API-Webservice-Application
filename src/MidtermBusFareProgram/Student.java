package MidtermBusFareProgram;

public class Student extends BusFare {
		//Subclass of BusFare superclass
	
		//Student Discount Rate.
		public double discountRate = 0.5;
		
		//Student ticket color.
		public String TicketColor = "Grey";

		// Method to get fare from superclass and apply discount rate. Returns a discounted fare.
		public double getFare() {
			return (super.getFare() * discountRate);
		}
		
		// Method to get student ticket color.
		public String getColor() {
			return TicketColor;
		}
		
		// Method to print the bus ticket.
		/*public void ticket() {
			System.out.println("Fare: " + getFare() + " Color: " + getColor());
		}
		*/
		public String ticket() {
			return ("Fare: " + getFare() + " Color: " + getColor());
		}
		
	}


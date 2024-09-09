package MidtermPart1ExamProgram;

public class Student extends BusFare {
		//Subclass of BusFare superclass
	
		//Student Discount Rate.
		public double discountRate = 0.5;
		
		//Student ticket color.
		public String TicketColor = "grey";

		// @Override. Method to get fare from superclass and apply discount rate. Returns a discounted fare.
		public double getFare() {
			return (super.getFare() * discountRate);
		}
		
		// Method to get student ticket color. Student class uses its own data field for color, grey.
		public String getColor() {
			return TicketColor;
		}
		
		// Method that returns String of bus ticket info.
		public String ticket() {
			return ("Fare: " + getFare() + " Color: " + getColor());
		}
		
	}


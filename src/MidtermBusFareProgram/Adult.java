package MidtermBusFareProgram;

public class Adult extends BusFare{
	//Adult is a subclass of the BusFare superclass.
	
	// Method to get fare from superclass
	public double getFare() {
		return super.getFare();
	}
	// Method to get ticket color from superclass
	public String getColor() {
		return super.getTicketColor();
	}
	
	//Print statement for ticket fare and ticket color.
	/*public void ticket() {
		System.out.println("Fare: " + getFare() + " Color: " + getColor());
	}
	*/
	
	public String ticket() {
		return ("Fare: " + getFare() + " Color: " + getColor());
	}
}

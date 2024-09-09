package MidtermBusFareProgram;

public abstract class BusFare {
	// Super class. Subclasses are Student and Adult. 
	// This superclass includes methods for returning fare and ticket color.
	
	// Private fields for encapsulation. Subclasses can only receive these fields through methods.
	
	//Private variable for Fare
	private double Fare = 3.0;
	
	//Private variable for Ticket color.
	private String TicketColor = "Red";

	// Get Fare method.
	public double getFare() 
	{
		return this.Fare;
	}
	
	// Get Ticket Color method.
	public String getTicketColor() 
	{
		return this.TicketColor;	
	}
	//Abstract method for printing ticket.
	public abstract String ticket();
}

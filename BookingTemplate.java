package BookingDetails;

abstract public class BookingTemplate {
	String modeOfTransport;
	public abstract void selectModeOfTransport(String s);
	public final void doPayment() {
		System.out.println("Payment completed");
	}
	public final void processOrder() {
		System.out.println("Order Placed");		
	}
	
	public final void CreateBookingTemplate() {
		selectModeOfTransport(modeOfTransport);
		doPayment();
		processOrder();
	}

}


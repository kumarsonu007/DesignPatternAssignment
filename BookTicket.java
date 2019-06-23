package BookingDetails;

class BookTrainTicket extends BookingTemplate {
	
	@Override
	public void selectModeOfTransport(String transportMode) {
		// TODO Auto-generated method stub
		this.modeOfTransport = transportMode;
	}	
}

class BookPlaneTicket extends BookingTemplate {
	@Override
	public void selectModeOfTransport(String transportMode) {
		// TODO Auto-generated method stub
		this.modeOfTransport = transportMode;
	}
}

class BookBusTicket extends BookingTemplate {
	@Override
	public void selectModeOfTransport(String transportMode) {
		// TODO Auto-generated method stub
		this.modeOfTransport = transportMode;
	}
}

public class BookTicket {
	public static void main(String[] args) 
    { 
        BookingTemplate order1 = new BookTrainTicket(); 
        order1.CreateBookingTemplate(); 
        System.out.println(); 
        BookingTemplate order2 = new BookPlaneTicket(); 
        order2.CreateBookingTemplate(); 
    } 
}


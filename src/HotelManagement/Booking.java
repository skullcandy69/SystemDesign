package HotelManagement;

import java.sql.Date;
import java.util.List;

public class Booking {
	String bookingDateTime;
	Date bookedAt;
	Duration duration;
	int bookingID;
	int userID;
	Enum<PaymentStatus> paymentStatus;
	List<Rooms> rooms;
	int amount;
	
}

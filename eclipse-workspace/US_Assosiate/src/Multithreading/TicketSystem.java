package Multithreading;

class TicketBooking implements Runnable{
	try {
		Thread.sleep(200);
	}catch (InterruptedException e) {
		e.printStackTrace();
	}
	System.out.println("State of booking thread while main thread waiting"+ TicketSystem.mainThread.getState());
	
	try {
		Thread.sleep(200);
	}catch (InterruptedException e) {
		e.printStackTrace();
	}
}

public class TicketSystem {

}

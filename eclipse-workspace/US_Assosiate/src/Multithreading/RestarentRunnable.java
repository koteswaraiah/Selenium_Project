package Multithreading;

class CookingJob implements Runnable{
	private String task;
	CookingJob(String task){
		this.task = task;
	}
	
	public void run() {
		System.out.println(task + "is beaing prepared by"+ Thread.currentThread().getName());
	}
	  
	
}

public class RestarentRunnable {

	public static void main(String[] args) {
		Thread t1 = new Thread(new CookingJob("Soup"));
		Thread t2 = new Thread(new CookingJob("piza"));
		Thread t3 = new Thread(new CookingJob("burger"));
		
		t1.start();
		t2.start();
		t3.start();
	

	}

}

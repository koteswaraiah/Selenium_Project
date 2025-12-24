package Multithreading;

class CookingTask extends Thread {
	private String task;
	
	CookingTask(String task){
		this.task =task;
	}
	public void run() {
		System.out.println(task +"is beaing prepared by " +Thread.currentThread().getName());
	}
}
public class Restarent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new CookingTask("Pasta");
		Thread t2 = new CookingTask("salad");
		Thread t3 = new CookingTask("Dessart");
		Thread t4 = new CookingTask("Rice");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		

	}

}

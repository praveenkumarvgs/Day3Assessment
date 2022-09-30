package number.programs;
/**
 * Implementing multi threading
 * @author praveen.kumar
 *
 */
class ThreadCount extends Thread{

	 ThreadCount(){

	    super("Overriding Thread Class");

	    System.out.println("New thread is created " + this);

	    start();

     }
	 /**
	  * Method to perform action for thread
	  */

	 public void run(){

	    try{

	        for (int i=0 ;i<10;i++){

	          System.out.println("New thread is created " + this);

	          Thread.sleep(1500);

	        }

	    }

	    catch(InterruptedException e){

	        System.out.println("Current thread is interrupted");

	    }

	    System.out.println("Current thread run is terminated" );

	 }

	}

class MultiThreading{

	 public static void main(String args[]){

	    ThreadCount multiThread = new ThreadCount();

	    try{

	        while(multiThread.isAlive()){

	        System.out.println("Main Thread is executing");

	        Thread.sleep(1000); // sleep mode

	        }

	    }

	    catch(InterruptedException e){

	    System.out.println("Main thread is interrupted");

	    }

	    System.out.println("Exiting Main thread" );

	 }

}

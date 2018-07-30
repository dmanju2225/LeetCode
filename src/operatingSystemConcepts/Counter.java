package operatingSystemConcepts;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Counter extends Thread
{
	static int count = 0;
	   private static Lock lock = new ReentrantLock();

	   Counter(int num)
	   {
	      super("Thread num :" + num);
	   }
	   public  void run()
	   {

	      int i = 0;
	      while(i++ < 100) {
	         lock.lock();
	         int temp = count;
	         int j =0;
	         while(j++ < 10);
	         count = temp + 1;
	         System.out.println(this + " : count =" + count);
	         lock.unlock();

	      }


	   }

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		for(int i = 0; i< 1000; i++) {
	         Counter c = new Counter(i);
	         c.start();
	      }


	      try
		{
			TimeUnit.MILLISECONDS.sleep(10000);
		}
		catch (InterruptedException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	      System.out.println("Final Counter Val:"  +count);
	   }
	}



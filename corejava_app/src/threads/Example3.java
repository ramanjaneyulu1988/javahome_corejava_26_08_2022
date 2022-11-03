package threads;

public class Example3 extends Thread
{
	public static void main(String[] args) throws InterruptedException {

		Thread t1 = new Example3(); // New
		t1.setName("t1");
		System.out.println(t1.getName());
		System.out.println(t1.getPriority()); // 5
		t1.start(); // Running
		
		Thread t2 = new Example3(); // t2
		t2.setName("t2");
		System.out.println(t2.getName());
		t2.setPriority(0);
		System.out.println(t2.getPriority()); // 10
		t2.start();
		
		Thread t3 = new Example3(); // t3
		t3.setName("t3");
		System.out.println(t3.getName());
		System.out.println(t3.getPriority()); // 5
		t3.start();

		for(int i=1; i<=10; i++)
		{
			Thread.sleep(1000);
			System.out.println(i);
		}

	}

	public void run()
	{
		String threadName = Thread.currentThread().getName();
		if(threadName.equals("t1"))
		{
			for(int i=11; i<=20; i++)
			{
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(i);
			}
		}
		if(threadName.equals("t2"))
		{
			for(int i=21; i<=30; i++)
			{
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(i);
			}
		}
		if(threadName.equals("t3"))
		{
			for(int i=31; i<=40; i++)
			{
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(i);
			}
		}
		
	}
}

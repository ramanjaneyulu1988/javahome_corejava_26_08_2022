package threads;

public class Example2 implements Runnable
{
	public static void main(String[] args) throws InterruptedException {

		Example2 example2 = new Example2();
		Thread t = new Thread(example2);
		t.start();

		for(int i=1; i<=10; i++)
		{
			Thread.sleep(1000);
			System.out.println(i);
		}

	}

	public void run()
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
}

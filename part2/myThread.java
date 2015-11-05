import java.lang.Thread;

class Test implements Runnable
{
    
    public void run()
    {
	for(int i =0;i<100;i++)
	{
	    System.out.println("Thread:"+i);
	}
    }

}



class myThread
{
    public static void main(String args[])
    {
	System.out.println("Hello world");
	Test mt = new Test();
	
	//mt.run();
	Thread tee = new Thread(mt);
	System.out.println("run Thread:");
	tee.start();

	System.out.println("runing Thread!");

	for(int i =0;i<100;i++)
	{
	    System.out.println(i);
	}


    }

    

}

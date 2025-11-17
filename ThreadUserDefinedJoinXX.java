class Demo extends Thread
{
    public void run()
    {
        System.out.println("Inside Run Method of:"+Thread.currentThread().getName());
    }
}

class ThreadUserDefinedJoinXX
{
    public static void main(String a[])

    {
        System.out.println("Inside main thread");
        Demo dobj1=new Demo();
        Demo dobj2=new Demo();

        dobj1.setName("First");
        dobj2.setName("Second");

        dobj1.start(); 
        dobj2.start();
        //checked exception
        try{
        dobj1.join();
        dobj2.join();      
        }

        catch(InterruptedException iboj)
        {
            
        }

        System.out.println("End of main thread");
    }
}
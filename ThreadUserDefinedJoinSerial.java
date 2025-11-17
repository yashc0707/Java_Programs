class Demo extends Thread
{
    public void run()
    {
        System.out.println("Inside Run Method of:"+Thread.currentThread().getName());
    }
}

class ThreadUserDefinedJoinSerial
{
    public static void main(String a[])

    {
        System.out.println("Inside main thread");
        Demo dobj1=new Demo();
        Demo dobj2=new Demo();

        dobj1.setName("First");
        dobj2.setName("Second");
        try{
        dobj1.start(); 
        dobj1.join();
        System.out.println("End of First Thread");

        dobj2.start();
        dobj2.join();
        System.out.println("End of Second Thread");

        }

        catch(InterruptedException iboj)
        {
            
        }

        System.out.println("End of main thread");
    }
}
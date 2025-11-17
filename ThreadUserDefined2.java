class Demo extends Thread
{
    public void run()
    {
        System.out.println("Inside Run Method");
    }
}

class ThreadUserDefined2
{
    public static void main(String a[])

    {
        System.out.println("inside main thread");
        Demo dobj1=new Demo();
        Demo dobj2=new Demo();

        dobj1.start(); 
        dobj2.start();      

        System.out.println("End of main thread");
    }
}
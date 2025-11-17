class ThreadDemo1
{
    public static void main(String a[])
    {
        System.out.println("Inside main method");

        String name=Thread.currentThread().getName();

        System.out.println("Name of Current thread is:"+name);

    }
}
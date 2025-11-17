interface A
{
    int no=11;
    void fun();
    default void gun()  //Concreate Method in Interface Provides Java Version 8+
    {
        System.out.println("Inside Gun");
    }
}


class Demo implements A  
{ 
    public void fun()
    {
        System.out.println("Inside Fun:"); 

    }
}




class InterfaceDemo8
{
    public static void main(String A[])
    {
        Demo dobj= new Demo();

        dobj.fun(); 
        dobj.gun();                                              
     
        
    }
}
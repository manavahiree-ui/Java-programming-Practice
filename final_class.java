final class Demo
{
    public void fun()
    { System.out.println("Inside demo Fun"); }

     public final void gun()
    { System.out.println("Inside final demo gun"); }
}

class Hello extends Demo          //Error
{
    public void gun()
    { System.out.println("Inside Hello Gun"); }
}

class final_class
{
    public static void main (String A[])
    {
        Demo dobj = new Demo();        //Allowed
        Hello hobj = new Hello();

    } 
}
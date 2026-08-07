class marvellous
{
     public marvellous()
     {
          System.out.println("Inside Constructor....");
     }

     protected void finalize()
     {
          System.out.println("Inside Finalize Method...");
     }
}

class FinalizeDemoX
{    
     public static void main(String A[])
     {
          marvellous mobj = new marvellous();
          marvellous mobj2 = mobj;

          mobj = null;
         
          System.gc();

          System.out.println("End of main...");
     }
}

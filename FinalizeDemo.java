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

class FinalizeDemo
{    
     public static void main(String A[])
     {
          marvellous mobj = new marvellous();

          mobj = null;
         
          System.gc();

          System.out.println("End of main...");
     }
}

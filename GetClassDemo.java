class marvellous
{

}

class Hello
{

}

class GetClassDemo
{    
     public static void main(String A[])
     {
          marvellous mobj = new marvellous();
          Hello hobj = new Hello();

          System.err.println(mobj.getClass());
          System.err.println(hobj.getClass());
     }
}

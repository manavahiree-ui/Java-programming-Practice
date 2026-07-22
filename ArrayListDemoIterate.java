import java.util.*;

class ArraylistDemoIterate
{
     public static void main(String A[])
     {
          ArrayList <Float> aobj = new ArrayList <Float> ();

          aobj.add(34.65f);

          aobj.add(56.87f);
     
          aobj.add(8.67f);

          aobj.add(90.65f);

          Iterator<Float> iobj = aobj.iterator();

          while(iobj.hasNext())
          {
               System.out.println(iobj.next());

          }
      }
}
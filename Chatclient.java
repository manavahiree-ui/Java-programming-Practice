import java.io.*;
import java.net.*;

class Chatclient
{
    public static void main(String A[]) throws Exception
    {
        System.out.println("Client Application is running...");

        Socket sobj = new Socket("localhost",2100);

        System.out.println("Connection is Successfull with server");

        PrintStream pobj = new PrintStream(sobj.getOutputStream());  //tond

        BufferedReader bobj1 = new BufferedReader(new InputStreamReader(sobj.getInputStream())); //kaan

        BufferedReader bobj2 = new BufferedReader(new InputStreamReader(System.in)); //to access keyboard

        System.out.println("------------------------------------------");
        System.out.println("--------- Marvellous Chat Client ---------");
        System.out.println("------------------------------------------");

        String str1 = null, str2 = null;

        System.out.println("Enter message for Server");

        while(!(str1 = bobj2.readLine()).equals("end"))
        {
            pobj.println(str1);
            str2 = bobj1.readLine();
            System.out.println("Server says"+str2);
            System.out.println("Enter message for Server");
        }
        sobj.close();
    }
}
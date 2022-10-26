package exp9;
import java.io.*;
import java.util.*;
public class ex93
{
    public static void main(String[] args)throws Exception
    {
        Scanner o = new Scanner(System.in);
        DataInputStream d=new DataInputStream(System.in);
        FileInputStream f1=new FileInputStream("D:\\DOWNLOADS\\stds\\Sem 3\\OOPS\\Manuals\\Ex 9\\test files\\abc.txt");
        FileWriter f2=new FileWriter("D:\\DOWNLOADS\\stds\\Sem 3\\OOPS\\Manuals\\Ex 9\\test files\\Char.txt");
        FileReader f3=new FileReader("D:\\DOWNLOADS\\stds\\Sem 3\\OOPS\\Manuals\\Ex 9\\test files\\xyz.txt");
        String s;
        int r;
        System.out.println("For File Writer : ");
        System.out.print("Enter your information to write in files : ");
        s=d.readLine();
        f2.write(s);
        f2.flush();
        System.out.println("The Given Data has been Recorded in the File.\n");
        System.out.println("For File Input Stream : ");
        while((r=f1.read())!=-1)
        {
            System.out.print((char)r);
        }
        System.out.println("\nYeah!,that's all it has.");
        System.out.println("\nFor Character Array Reader : ");
        //System.out.print("Enter Something you like : ");
        //String n = o.next();
        String n ="This is Painful!";
        char c[]=n.toCharArray();
        CharArrayReader ca=new CharArrayReader(c);
        while((r=ca.read()) != -1)
        {
            System.out.print((char)r);
        }
        System.out.println("\n\nFor File Reader : ");
        while((r=f3.read())!=-1)
        {
            System.out.print((char)r);
        }
        d.close();
        f1.close();
        f2.close();
        f3.close();
        
    }
    
}
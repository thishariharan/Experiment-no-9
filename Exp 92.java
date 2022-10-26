package exp9;
import java.io.*;
import java.util.*;
public class ex92
{
    public static void main(String args[])throws Exception
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter your file's Dictionary : ");
        String name=s.nextLine();
        File f=new File(name);
        if(f.exists())
        {
            System.out.println("Oh yeah!, file is Alive.");
        }
        else
        {
            System.out.println("Oh my god, The file doesn't live in this Universe.");
        }
        if(f.canRead())
        {
            System.out.println("It's just Readable.");
        }
        else if(f.canWrite())
        {
            System.out.println("You can use only for Storing Purpose.");
        }
        else if(f.canRead() && f.canRead())
        {
            System.out.println("Hey this file is a Precious one.It can Read and also Write.");
        }
        System.out.print("The length of the file : "+f.length());
        System.out.print("\nThe Type/Extension : ");
        String name1=name;
        char c2[]=name1.toCharArray();
        for(int i=0;i<(c2.length);i++)
        {
            if(c2[i]==('.'))
            {
                for(int j=i+1;j<c2.length;j++)
                {
                    System.out.print(c2[j]);
                }
            }
        }
        
    }
}
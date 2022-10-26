
package exp9;
import java.io.*;
import java.util.*;
public class ex91 {
    public static void main(String[] args) throws Exception
    {
        Scanner p = new Scanner(System.in);
        File f1 = new File("D:\\DOWNLOADS\\stds\\Sem 3\\OOPS\\Manuals\\Ex 9\\nomni.txt");
        File f2 = new File("D:\\DOWNLOADS\\stds\\Sem 3\\OOPS\\Manuals\\Ex 9\\new.txt");
        f2.createNewFile();
        FileInputStream i = new FileInputStream(f1);
        FileOutputStream o = new FileOutputStream(f2);
        //BufferedReader b = new BufferedReader(f1);
        int s,j=0;
        while((s = i.read()) != -1)
        {
            if(o.equals(" "))
            {
                j=0;
            }
            else
            {
                    o.write(s);
                    System.out.print((char)s);
            }
                    
                
        }
        i.close();
        o.close();
    }    
}

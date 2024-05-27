import java.util.*;
import java.io.*;
public class longword
{
    public static void main(String[] args)
    {
        int n;
        Scanner scan=new Scanner(System.in);
        n=scan.nextInt();
        for(int i=0;i<n;i++)
        {
            String s=scan.nextLine();
            int y=s.length();
            if(y>10)
            {
                System.out.println(s.charAt(0)+""+(y-2)+""+s.charAt(y-1));
            }
            else
            {
                System.out.println(s);
            }
        }
    }
}
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day10Binary {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int j=0; j<T; j++)
        {
            sc.nextLine();
            double n=sc.nextDouble();
            double nsave=n;
            int npow=31;
            while(Math.pow(2,npow)>n)
            {
                npow--;
            }
             // System.out.println(n);
             // System.out.println(Math.pow(2, npow));
            int npowc=npow;
            for(int i=0; i<npowc; i++)
            {
                if(n>=Math.pow(2,npow))
                {
                //System.out.println(n);
               // System.out.println(Math.pow(2, npow));
                n=n-Math.pow(2,npow);
                npow--;
                System.out.print("1");
                }
                else
                {
                    npow--;
                    System.out.print("0");
                }
            }
            if(nsave%2==0)
            {
                System.out.print("0");    
            }
            else
                System.out.print("1");
            System.out.println("");
        }
    }
}

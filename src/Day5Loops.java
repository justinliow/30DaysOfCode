import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day5Loops {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int iter=sc.nextInt();
       
        for(int j=0; j<iter; j++){
            int a=sc.nextInt();   
            int b=sc.nextInt();
            int N=sc.nextInt();
            for(int x=1; x<N+1; x++)
            {   
                int total=a; 
                for(int y=0; y<x; y++)
                {
                    total+=((Math.pow(2, y)*b));     
                }
                System.out.print(total+" ");
            }
            System.out.println("");
        
           }
        
    }
}
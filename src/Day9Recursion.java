import java.io.*;
import java.util.*;
public class Day9Recursion {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        //Take Input
        int a=sc.nextInt();
        int b=sc.nextInt();
        
        int gcd=find_gcd(a,b);
        System.out.println(gcd);
    }
   static  int find_gcd(int a,int b){
       if(a==b)
              return a;
       else 
              return find_gcd(Math.max(a,b)-Math.min(a,b),Math.min(a,b));
    }
}
 

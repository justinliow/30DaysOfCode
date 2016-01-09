import java.util.*;
import java.io.*;

class Day8Dictionaries{
   public static void main(String []argh)
   {
      Scanner in = new Scanner(System.in);
      int N=in.nextInt();
     Hashtable<String, Integer> numbers = new Hashtable<String, Integer>();
      in.nextLine();
      for(int i=0;i<N;i++)
      {  
         String name=in.nextLine();
         int phone=in.nextInt();
         numbers.put(name, phone);
         in.nextLine();
      }

      while(in.hasNext())
      {
         String s=in.nextLine();
         if(!numbers.containsKey(s))
             System.out.println("Not found");
         else
             System.out.println(s+"="+numbers.get(s));
      }
   }
}

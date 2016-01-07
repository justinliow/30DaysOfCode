

	import java.io.*;
	import java.util.*;
	import java.text.*;
	import java.math.*;
	import java.util.regex.*;

	public class Day2Arithmetic {

	    public static void main(String[] args) {
	    
	      Scanner sc = new Scanner(System.in);
	      double M = sc.nextDouble(); // original meal price
	      double T = sc.nextInt(); // tip percentage
	      double X = sc.nextInt(); // tax percentage
	      double tip=(T*M)/100;
	      double tax=(X*M)/100;
	      double total=M+tip+tax;
	      total=Math.round(total);
	      System.out.println("The final price of the meal is $"+(int)total+".");
	      // Enter your code here!
	      // Run some computations....
	      
	      // int total = (int) Math.round(/*numberToRoundHere*/);
	      
	      // ...then print!
	      
	    }
	}



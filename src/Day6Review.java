
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day6Review {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=1; i<=n; i++)
        {
            for(int j=n; j>i; j--)
            {
                System.out.print(" ");
            }
            for(int x=0; x<i; x++)
                System.out.print("#");
            System.out.println("");
        }
    }
}

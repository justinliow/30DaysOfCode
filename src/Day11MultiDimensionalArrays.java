import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day11MultiDimensionalArrays {
    public static int help(int i, int j, int[][] arr){
        return (arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+1]+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2]);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        int max=-100;
        for(int x=0; x<4; x++)
        {
            for(int y=0; y<4; y++)
            {
                int temp=help(x, y, arr);
                if (temp>max){
                    max=temp;
                }
                 
            }
            
        }
        System.out.println(max);
    }
}

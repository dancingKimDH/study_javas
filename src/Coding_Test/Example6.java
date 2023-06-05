package Coding_Test;
import java.util.Scanner;

public class Example6{
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        String[] A = nextLine();
        int[] B = A.split(" ");
        int[] C = new int[A.length];
        myObj.close();
        
        for(int i = 0; i < A.length; i = i + 1) {
            C[i] = Integer.parseInt(B[i]);
            System.out.println(B[i] + C[i]);
        }     
        
        
    }
    
}
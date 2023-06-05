package Coding_Test;

import java.util.Scanner;

public class Example5 {

    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        int N = myObj.nextInt();
        myObj.close();
        
        int[] a = new int[9];
        int[] b = new int[9];

        for (int A = 1; A <= 9; A = A + 1) {
            int result = 0;
            result = N * A;
            int c = A - 1;
            a[c] = A;
            b[c] = result;
        }
        for (int B = 0; B < a.length; B = B + 1) {
            System.out.println(N + " * " + a[B] + " = " + b[B]);
        }
        
        
    }

}

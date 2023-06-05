package Coding_Test;
import java.util.Scanner;

public class Example4 {

    public int three(int A) {
        int result = 10000 + A * 1000;
        return result; 
    }
    
    public int two(int A) {
        int result = 1000 + A * 100;
        return result; 
    }
    
    public int one(int A) {
        int result = A * 100;
        return result;
    }
    public static void main(String[] args) {
     Scanner myObj = new Scanner(System.in);
        int A = myObj.nextInt();
        int B = myObj.nextInt();
        int C = myObj.nextInt();
        int[] numbers = new int[3];
        numbers[0] = A;
        numbers[1] = B;
        numbers[2] = C;
        int D = 0;
        myObj.close();
        try {
            Example4 cal = new Example4();
            if(A == B && B == C) {
                D = cal.three(A);
            } else if (A == B && B != C) {
                D = cal.two(A);
            } else if (A == C && B != C) {
                D = cal.two(A);
            } else if (B == C && A != B) {
                D = cal.two(B);
            } else {
                int max = numbers[0];
                for(int i = 1; i < numbers.length; i = i + 1) {
                    if (numbers[i] > max) {
                        max = numbers[i];
                    }
                }
            D = max * 100;
            }
            System.out.println(D);   
            
        } catch (Exception e) {}
        

    }
    
}
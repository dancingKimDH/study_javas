package Coding_Test;

import java.util.Scanner;


public class Example6 {
    public static void main(String[] args){
    try{
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        int N = scanner.nextInt();
        int c = 0;
        int d = 0;
        while(N > c) {
            c = c + 1;
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            d = d + (a * b);
        }
        if(X == d) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        } catch (Exception e) {
        System.out.println(e.getMessage());   
    } 
        

        
    }
    
    
}

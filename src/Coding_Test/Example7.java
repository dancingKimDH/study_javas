package Coding_Test;

import java.util.Scanner;
public class Example7 {
    public static void main(String[] args){
        try{
            Scanner scanner = new Scanner(System.in);
            int T = scanner.nextInt();
            
            for(int time = 0; T > time; time = time + 1) {
                int A = scanner.nextInt();
                int B = scanner.nextInt();
                System.out.println(A + B);
            }
  
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

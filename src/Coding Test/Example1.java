import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        
        Scanner myObj = new Scanner(System.in);
        int A = 0;
        int B = 0;
        A = myObj.nextInt();
        B = myObj.nextInt();

            if (A > B) {
                System.out.println(">");
            } else if (A == B) {
                System.out.println("==");
            } else {
                System.out.println("<");
            }
    }

}
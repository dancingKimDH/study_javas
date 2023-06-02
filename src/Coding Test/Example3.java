import java.util.Scanner;
public class Example3 {
    public static void main(String[] args) {
    try{
        Scanner myObj = new Scanner(System.in);
        String sentence = myObj.nextLine();
        int C = myObj.nextInt();
        myObj.close();

        String[] numberString = sentence.split(" ");

        int[] number = new int[numberString.length];
        for(int i = 0; i < numberString.length; i = i + 1) {
            number[i] = Integer.parseInt(numberString[i]);
        }
        int durationh = 0;
        int durationm = 0;
        durationh = C / 60;
        durationm = C % 60;
        
        int resulth = 0;
        int resultm = 0;
        
        resulth = number[0] + durationh;
        resultm = number[1] + durationm;
        
        int finalh = 0;
        int finalm = 0;
        int D = 0;
        if (resultm >= 60) {
            finalm = resultm % 60;
            D = resultm / 60;
            resulth = resulth + D;
        } else if (resulth >= 24) {
            finalh = resulth - 24;
            
        } else {
            finalh = resulth;
            finalm = resultm;
        }
        System.out.println();
        System.out.println(finalh + " " + finalm);
    } catch (Exception e) {}
}


}
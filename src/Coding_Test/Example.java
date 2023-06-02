package Coding_Test;
import java.math.BigInteger;
import java.util.Scanner;
public class Example {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        
        String sentence = myObj.nextLine();
        String [] list = sentence.split(" ");
        BigInteger sum = BigInteger.ZERO;
        for (int i = 0; i < list.length; i = i + 1) {
            try {
            BigInteger number = new BigInteger(list[i]);
            sum = sum.add(number);

        } catch (NumberFormatException e) {}}

        System.out.println(sum);

    }


}

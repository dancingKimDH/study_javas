import java.util.Scanner;
public class Example {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        
        String sentence = myObj.nextLine();
        String [] list = sentence.split(" ");
        long sum = 0;
        for (int i = 0; i < list.length; i = i + 1) {
            try {
            long number = Integer.parseInt(list[i]);
            sum = sum + number;

        } catch (NumberFormatException e) {}}

        System.out.println(sum);

    }


}

import java.util.Scanner;

public class MethodWhile {
    public String gettime(int time) {
        String str = "";
        try {
            while (time <= 12) {
                str = "오전입니다.";
                break;
            }
            while (time > 12 && time <= 18) {
                str = "오후입니다.";
                break;
            }
            while (time > 18) {
                str = "밤입니다.";
                break;
            }
        } catch (Exception e) {
        }

        return str;
    }




    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int time = myObj.nextInt();
        try {
        MethodWhile gettime = new MethodWhile();
        String result = gettime.gettime(time);
        System.out.println(result);
        } catch (Exception e) {}
     finally {
        myObj.close();
    }
}

}
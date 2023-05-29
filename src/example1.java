import java.util.Scanner;
public class example1 {


    public static void main(String[] args) {
        try {
            Scanner myObj = new Scanner(System.in);
            String answer = "";

            boolean loops = true;
            while (loops) {
                System.out.println("선택에 따라 안내글을 보여드립니다.");
                System.out.println("--------작동 key--------");
                System.out.println("(E)xit: 종료");
                System.out.println("(P)oll: 설문 시작");
                System.out.println("(S)tatistic: 설문 통계");
                System.out.println();
                System.out.print("선택 입력: ");
                answer = myObj.nextLine();
                System.out.println();

                // If input S or Static, display the sentence "-------설문 통계-------"
                if (answer.equals("S") || answer.equals("Statistic")) {
                    System.out.println("-------설문 통계-------");
                } 
                // If input P or Poll, display the sentence "-------설문 시작-------" 
                else if (answer.equals("P") || answer.equals("Poll")) {
                    System.out.println("-------설문 시작-------"); 
                } 
                // If input E or Exit, display the sentence "-------설문 종료-------" 
                else if (answer.equals("E") || answer.equals("Exit")) {
                    System.out.println("-------설문 종료-------");
                }
                // If incorrect input, it returns to the beginning 
                else {
                    System.out.println("-------처음으로 돌아갑니다. 다시 입력해주세요.-------");
                    System.out.println();
                    continue;
                } break;
            }

        } catch (Exception e) {
            // TODO: handle exception
        } finally {

        }

        // return 0;
    }
}
    


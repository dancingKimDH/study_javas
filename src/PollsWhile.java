import java.util.Scanner;

public class PollsWhile {
    public static void main(String[] args) {
        try {
        Scanner myObj = new Scanner(System.in);
        String answer = "";


        System.out.println("선택에 따라 안내글을 보여드립니다. \n ----- 작동 key -----");
        System.out.println("(P)oll: 설문 시작  \n(S)tatistic: 설문 통계 \n(E)xit: 종료)");

        
        boolean loops = true;
        while (loops) {
            System.out.println("입력하세요: ");
            answer = myObj.nextLine();
            if (answer.equals("P") || answer.equals("p") || answer.equals("Poll")) {
                System.out.println("----- 설문 시작 -----");
            }
            else if (answer.equals("S") || answer.equals("s") || answer.equals("Statistic"))
                System.out.println("-----설문 통계-----");
            else if (answer.equals("E") || answer.equals("e") || answer.equals("Exit"))
                System.out.println("----- 설문 종료 -----");
            else {
                System.out.println("처음으로 돌아갑니다. 다시 입력해 주세요.");
                continue;
            }   break;


        } 
    } catch (Exception e) {} finally {}
    // return 0;
}

}

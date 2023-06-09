import java.util.Scanner;
public class CasherFor {
    public static void main(String[] args) {
        try {
            Scanner myObj = new Scanner(System.in);
            int [] shopping = new int[5]; //Array에 5개 공간 만들기
            System.out.println("장바구니엔 5가지만 넣을 수 있으며, 100원 초과는 0원 처리됩니다.\n가격을 입력해 주세요.");
            myObj.close();
            for(int first = 0; first < shopping.length; first = first + 1) {
                shopping[first] = myObj.nextInt();

                if(shopping[first] > 100) {
                    shopping[first] = 0;
                    System.out.println("100원이 초과한 상품입니다!");
                }

                else if(shopping[first] == 0) {
                    System.out.println("0원인 상품입니다. 계산을 종료합니다.");
                    break;
                } 

            }
            int sum = 0;
            for (int i = 0; i < shopping.length; i = i + 1) {
                sum = sum + shopping[i];
            }
            System.out.println("총합은 " + sum + " 입니다.");
        } catch (Exception e) {}
            finally {}

    } //return 0;

}

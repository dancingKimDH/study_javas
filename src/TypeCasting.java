public class TypeCasting {
    public static void main(String[] args) {
        double myDouble = 9.78d; //d: 변수를 double로 설정한다는 의미. 소숫점에 등록
        int myInt = (int) myDouble; // Manual casting: double to int
    
        System.out.println(myDouble);   // Outputs 9.78
        System.out.println(myInt);      // Outputs 9
        // return 0;
    }
}

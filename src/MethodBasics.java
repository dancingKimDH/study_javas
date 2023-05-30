public class MethodBasics {
    // <access_modifier> <return_(data)type> <method_name>( list_of_parameters)
    // {
    // //body
    // }
    // x에 1을 더하기
    public int F(int x) {
        int result = x + 1;
        return result;
    }

    public static void main(String[] args) {
        try {
            int y = 0;
            int x = 4;
            MethodBasics methodbasics = new MethodBasics();
            y = methodbasics.F(x); //클래스 내의 메소드를 불러옴
            // 인스턴스화 시킨 후 결과 값을 환산하도록 함
            // y = x + 1; // 변수에 + 1

            y = methodbasics.F(y);
            System.out.println(y);

        } catch (Exception e) {
            // TODO: handle exception
        }

        System.out.println();
        // return 0;
    }

}

public class MethodBasics {
    // <access_modifier> <return_type> <method_name>( list_of_parameters)
    // {
    // //body
    // }
    // x에 +1
    public int F(int x) // x = 0
    {
        int result = x + 1;
        return result;
    }
    public static void main(String[] args) {
        try {
            int x = 4;
            int y = 0;
            // y = x + 1; // 변수에 + 1
            // y = F(x);
            MethodBasics methodBasics = new MethodBasics();
            y = methodBasics.F(x);

            y = y + 1; // 변수에 + 1
            MethodBasics methodBasics_first = new MethodBasics();
            y = methodBasics_first.F(y);  // F(0)
            y = methodBasics_first.F(y);  // F(0)

        } catch (Exception e) {
            // TODO: handle exception
        }
        System.out.println();
        // return 0;
    }
}

// public class MethodBasics {
//     // <access_modifier> <return_(data)type> <method_name>( list_of_parameters)
//     // {
//     // //body
//     // }
//     // x에 1을 더하기
//     public int F(int x) {
//         int result = x + 1; // 아래 x값이 4로 할당되면서 현 클래스의
//         // x값 역시 4로 바뀜 (Call by Value) (Call by Reference는 거의 사용 x)
//         return result;
//     }

//     // public int A(int y) {
//     //     int finalresult = y + 1;
//     //     return finalresult;
//     // }

//     public static void main(String[] args) {
//         try {
//             int x = 4;
//             int y = 0;
            
//             MethodBasics methodbasics = new MethodBasics();
//             y = methodbasics.F(x); //클래스 내의 메소드를 불러옴
//             // 인스턴스화 시킨 후 결과 값을 환산하도록 함
//             // y = x + 1; // 변수에 + 1

//             MethodBasics methodBasics_first = new MethodBasics();
//             y = methodBasics_first.F(0);
//             y = methodBasics_first.F(y);
//             System.out.println(y);
//             // MethodBasics finalresults = new MethodBasics();
//             // // 변수를 Clone할 수 있도록 함
//             // y = finalresults.A(y);
//             // // 반점을 찍으면서 그 클래스 내부의 변수에 값을 할당하면서 부름
//             // // Call by value
//             // System.out.println(y);

//         } catch (Exception e) {
//             // TODO: handle exception
//         }

//         System.out.println();
//         // return 0;
//     }

// }




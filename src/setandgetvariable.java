public class Setandgetvariable {
    public static void main(String[] args) {
        int twohundred = 200;
        int thirty = 30;
        int fifty = 50;
        int ten = 10;
        int five = 5;

        int A = 0;
        int B = 0;
        int C = 0;
        int D = 0;

        A = 1;
        B = 3;
        C = 5;
        D = 7;

        if (B == 3) {
            A = ten;
        } else {
            C = five;
        }

        if (D != 9) {
            B = five;
        } else {
            B = twohundred;
        }

        if (A == 10) {
            C = fifty;
        } else {
            D = thirty;
        }

        System.out.println (A);
        System.out.println (B);
        System.out.println (C);
        System.out.println (D);

        //return 0;
    }

}

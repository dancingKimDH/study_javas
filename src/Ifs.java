public class Ifs {
    
    public String now(int time) {
        String result = "";
        try{
            if (time < 12) {
                result = "오전입니다.";
            }
            else if(time > 12 && time < 18) {
                result = "오후입니다.";
            }
            else {
                result = "밤입니다.";
            }
        } 
        catch(Exception e) {}
        return result;
    }
    
    
    public static void main(String[] args) {
        // if () {
        // // block of code to be executed if the condition is true
        // }
        // int first = 20;
        // int second = 18;

        // if (first > second) {
        //     System.out.println(first);
        // }
        // System.out.println("Hello, World!");
        // return 0;

        // 12시 이전은 오전, 18시 이전은 오후, 24시까지는 밤//

        // int time = 14;
        // if (time < 12) {
        // System.out.println("오전입니다");
        // }
        // if (time > 12 && time < 18) {
        // System.out.println("오후입니다");
        // }
        // if (time > 18 && time < 24) {
        // System.out.println("밤입니다");
        // }
        try {
            

        int time = 15;
        Ifs now = new Ifs();
        String result = now.now(time);
        System.out.println(result);
    } catch (Exception e) {
        // TODO: handle exception
    }
        // if (time < 12) {
        //     System.out.println("오전입니다");
        // } else if (time < 18) {
        //     System.out.println("오후입니다");
        // } else {
        //     System.out.println("밤입니다");
        // }

    }

}

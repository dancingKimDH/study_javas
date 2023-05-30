public class MethodSwitches {

    public String today(int day) {
        String str = "";
        try {
            switch (day) {
                case 1:
                  str = "Monday";
                  break;
                case 2:
                  str = "Tuesday";
                  break;
                case 3:
                  str = "Wednesday";
                  break;
                case 4:
                  str = "Thursday";
                  break;
              } 
        } catch (Exception e) {}
        return str;
    }
    public static void main(String[] args) {
        try {
        int day = 4;
        String str = "";
        MethodSwitches methodswitches = new MethodSwitches();
        String returnResult = methodswitches.today(day);
        // return 0;
        System.out.println(returnResult);
    } catch (Exception e) {}
    }
}

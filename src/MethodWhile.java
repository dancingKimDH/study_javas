public class MethodWhile {
    public String gettime(int time) {
        String str = "";
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
        return str;
    }
    public static void main(String[] args) {
        int time = 15;
        MethodWhile gettime = new MethodWhile();
        String result = gettime.gettime(time);
        System.out.println(result);
    }
}

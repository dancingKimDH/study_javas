import java.util.ArrayList;

public class ClassArrayList {
    public static void main(String[] args) {
        try {
            // Array 사용 시 데이터타입을 일치시켜줌
            int[] numbers = { 1, 2, 3 };
            
            ArrayList arrayList = new ArrayList();

            arrayList.add(1);
            arrayList.add(2);
            arrayList.add(3);
            // 숫자열은 size로 문자길이 등은 lenght로 하자
            arrayList.size();
            arrayList.get(2);
            // int val = arrayList.get(2);
            arrayList.set(1, 5);
            arrayList.remove(0);
            arrayList.clear();
            System.out.println();
        } catch (Exception e) {
            // TODO: handle exception
        }

    }
}

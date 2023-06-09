import java.util.HashMap;

public class ClassHashMap {
    public static void main(String[] args) {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("first", 1);
            hashMap.put("second", 2);
            hashMap.put("third", 3);
            // Debug Console에서 실행 시 결과가 Null이라고 뜨지만, Variables 창에서
            // 추가되어 있음을 볼 수 있음
            hashMap.get("third");
            // Key를 이용해서 정보를 가져올 수 있음
            hashMap.size();
            hashMap.put("second", 5);
            // 다시 put을 이용해서 변경도 가능
            hashMap.remove("second");
            // 항목 삭제
            hashMap.keySet();
            // Key를 가져오기
            hashMap.values();
            // Values를 가져오기
            hashMap.clear();
            // 초기화
            System.out.println();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}

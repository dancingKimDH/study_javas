package vehicles;

import java.util.HashMap;

public class bicycle {
    int price = 0;
    String color = "";
    HashMap<String, Object> spec;

    //constructor
    public bicycle() {
        System.out.println("Bicycle - param empty");
    }

    // parameter만 존재하는 constructor
    public bicycle(int price, String color) {
        //this: 이 클래스에서의 변수는 외부에서 이미 선언되어 사용 중임을 표시
        //현 클래스에서의 변수를 타 클래스에서도 사용할 수 있게 됨
        //또한 같은 변수의 이름을 사용해도(parameter로 사용되는 변수와 이름 동일) 작동
        //필드와(this.) 지역변수
        this.price = price;
        this.color = color;
    }

    public String toString() {
        
        String str = "price:" + this.price + ", color: " + this.color;
        return str;
    }
}

package vehicles;

public class MountainBike extends bicycle{
    int seatHeight;
    public MountainBike() {

    }
public MountainBike(int price, String color, int seatHeight) {
    this.seatHeight = seatHeight;
    super.price = price;
    super.color = color;
}

public String toString() {
    //여기서는 super 대신에 this를 쓸 수 있음. 왜냐하면 이미 변수가 넘어왔기 때문.
    //하지만 Method에서 사용할 떄에는 항상 주의해야 함.
    //bicycle에 있는 toString이라는 Method를 재정의한 것
    String str = "price :" + super.price + ", color: " + super.color 
    + ", seatHeight : " + this.seatHeight;
    return str;
}
}


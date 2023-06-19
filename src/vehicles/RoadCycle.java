package vehicles;

public class RoadCycle extends bicycle {
    String Name = "";
    public RoadCycle() {

    }
    public RoadCycle(int price, String color, String name) {
        this.Name = name;
        this.price = price;
        this.color = color;
        
    
    }

    public String toString() {
        String str = "name: " + this.Name + ", price: " + this.price + ", color: " + this.color;
        return str;
    }
    
}

package vehicles;

import java.util.HashMap;

public class RoadCycle extends Bicycle {
    int seatHight;

    public RoadCycle(){

    }
     public RoadCycle(int price, String color, int seatHight){
         this.seatHight = seatHight;
         super.price = price;
         super.color = color;
    }
    
     public String toString(){
          String str = "price :" + super.price + ", color :" + super.color
          +", seatHight" + this.seatHight;
          return str;
        
       }
}

    
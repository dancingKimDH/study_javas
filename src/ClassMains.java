import cases.ClassSecond;

public class ClassMains {


    public static void main(String[] args) {
        try {
            ClassFirsts classFirsts = new ClassFirsts(); //no parameter
            ClassFirsts classFirstswithVar = new ClassFirsts(5); //one parameter
            int second = classFirstswithVar.getSecond(); 
            ClassSecond classSecond = new ClassSecond(6);
            System.out.println();
        } catch (Exception e) {
            
            // TODO: handle exception
        }
    }
}

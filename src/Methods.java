public class Methods {

    public int add(int first, int second) {
        int result = 0;
        try {
            result = first + second;
        } catch (Exception e) {
        }
        return result;
    }

    public int minus(int first, int second) {
        int result = 0;
        try {
            result = first - second;
        } catch (Exception e) {
        } return result;
    }

    public static void main(String[] args) {
        // <access_modifier> <return_type> <method_name>( list_of_parameters)
        // {
        // //body
        // }
    Methods methods = new Methods();
    int a = 2;
    int b = 1;
    a = methods.add(a,b);
    a = methods.add(a,b);
    a = methods.add(a,b);
    a = methods.add(a,b);
    a = methods.add(a,b);
    a = methods.add(a,b);
    a = methods.add(a,b);
    a = methods.add(a,b);
    a = methods.add(a,b);
    a = methods.add(a,b);
    a = methods.add(a,b);
    a = methods.add(a,b);
    a = methods.add(a,b);
    a = methods.add(a,b);
    a = methods.add(a,b);
    a = methods.add(a,b);
    a = methods.minus(a,b);
    System.out.println(a);

    
    }

}

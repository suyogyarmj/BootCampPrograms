// Design a mobile with three attributes and one behavior, Create no arg and parameterized constructor of it.
package Sept15.OOP;

public class MobileWithConstructor {
    int screen_size = 0;
    String brand ;
    float cost = 0;

    public void show(){
        System.out.println("In show function");
    }
    // no args constructor
    public MobileWithConstructor(){
        System.out.println("Inside the no arguments constructor");
    }
    // parameterized constructor with only one 'int' type argument

    public MobileWithConstructor(int x){
        screen_size = x;
        System.out.println("Inside the 'int' type constructor");
        System.out.println(screen_size);
    }
    // parameterized constructor with 3 arguments
    public MobileWithConstructor(int x, String y, int z){
        screen_size = x;
        brand = y;
        cost = z;
        System.out.println("Inside the three args constructor");
        System.out.println(screen_size);
        System.out.println(brand);
        System.out.println(cost);
    }
    public static void main(String[] args) {
        MobileWithConstructor MyObj1 = new MobileWithConstructor();
        MobileWithConstructor MyObj2 = new MobileWithConstructor(6);
        MobileWithConstructor MyObj3 = new MobileWithConstructor(7,"Apple",10000);
    }

}

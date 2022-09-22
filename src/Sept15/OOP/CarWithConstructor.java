// Design a car with three attributes – String color, int wheels and int model. Create a constructor in such a way that
// when its object is instantiated the result should be – red 0 0 (means it gives only the value of color )
package Sept15.OOP;

public class CarWithConstructor {
    String color;
    int wheels = 0;
    int model = 0;

    public CarWithConstructor(String x){
        color = x;
        System.out.println(color);
        System.out.println(wheels);
        System.out.println(model);
    }

    public static void main(String[] args) {
        CarWithConstructor myObj1 = new CarWithConstructor("red");
       // System.out.println(myObj1);

    }
}

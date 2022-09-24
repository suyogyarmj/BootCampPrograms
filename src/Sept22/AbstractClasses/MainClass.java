package Sept22.AbstractClasses;

// Abstraction is the process of hiding the implementation and only presenting the functionality to the user
public class MainClass {
    public static void main(String[] args) {
        Child1Class myObj1 = new Child1Class();
        myObj1.print(); // print method can be accessed this way

        AbstractClass myObj2 = new Child1Class();
        myObj2.print(); // print method can also be accessed this way
        // by creating an object of the abstract class but giving it the address of the Child1Class implementing it

        // Similarly, we can access the same print method from the Child2Class
        Child2Class myObj3 = new Child2Class();
        myObj3.print();

        AbstractClass myObj4 = new Child2Class();
        myObj4.print();

        System.out.println(myObj4.AbstractInstanceVar);
    }
}
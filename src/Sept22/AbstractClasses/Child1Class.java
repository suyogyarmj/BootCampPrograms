package Sept22.AbstractClasses;

public class Child1Class extends AbstractClass {
    // Child1Class HAS to implement the abstract method declared in AbstractClass else it gives us an error
    void print(){
        System.out.println("Abstract Print method declared in AbstractClass but defined in Child1Class");
    }
}

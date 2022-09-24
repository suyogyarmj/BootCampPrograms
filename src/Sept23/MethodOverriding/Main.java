package Sept23.MethodOverriding;

public class Main {
    public static void main(String[] args) {
        ParentClass myObj1 = new ParentClass();
        myObj1.ParentMethod();
        myObj1.ParentStaticMethod();

        ChildClass1 myObj2 = new ChildClass1();
        myObj2.Child1Method();
        myObj2.ParentMethod(); // overriding parent class method using Child1 class object
        myObj2.ParentStaticMethod();

        ChildClass2 myObj3 = new ChildClass2();
        myObj3.Child2Method();
        myObj3.ParentMethod(); // overriding parent class method this time using Child2 class object
        // myObj3.Child1Method(); // this creates an error because sibling classes cannot access each other's methods

    }
}

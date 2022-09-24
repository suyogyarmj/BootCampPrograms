package Sept22.AbstractClasses;

abstract class AbstractClass { // An abstract class. They cannot be instantiated

    // Variables declared inside the class but outside the methods are called instance variables
    public String AbstractInstanceVar ;
    // Here, AbstractInstanceVar is an instance variable

    abstract void print(); // An abstract method. These can only be declared inside abstract classes
    // These methods cannot have a body
    // Its implementation will be provided in another class, in this case Child1Class

}

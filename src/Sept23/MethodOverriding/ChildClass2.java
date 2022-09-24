package Sept23.MethodOverriding;

public class ChildClass2 extends ParentClass{
    // here ChildClass1 and ChildClass2 are siblings
    // they have access to the parent class methods but don't have any access to each other's

    String Child2Variable = "Child2 Variable";

    public void Child2Method(){
        System.out.println("Inside Child2 Method");
    }
    public void ParentMethod(){ // overriding parent method
        System.out.println("Inside Child 2 Parent Method ");
    }
}

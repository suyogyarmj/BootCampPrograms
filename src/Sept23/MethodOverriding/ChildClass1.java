package Sept23.MethodOverriding;

public class ChildClass1 extends ParentClass{
    String Child1Variable = "Parent Variable";

    public void Child1Method(){
        System.out.println("Inside the Child1 Method");
    }

    public void ParentMethod(){ // this method overrides the method of same name defined in the parent class
        System.out.println("Inside Parent Method defined in the Child1 Class");
    }

    public static void ParentStaticMethod(){
        System.out.println("Inside Child 1 Parent Static Method");
    }
}

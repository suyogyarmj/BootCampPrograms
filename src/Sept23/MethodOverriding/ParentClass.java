package Sept23.MethodOverriding;

// Method Overriding is simply a phenomenon in which the method defined in the superclass is overridden by the same
// method defined in the subclass with same name and parameters
// This causes runtime polymorphism in which the method takes a different form during run time

public class ParentClass {
    String ParentVariable = "In Parent Variable";
    public void ParentMethod() {
        System.out.println("In Parent Method");
    }
    public static void ParentStaticMethod(){
        System.out.println("Parent Class Static Method");
    }
}

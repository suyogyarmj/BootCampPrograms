package Sept21.Inheritance;

// eg: ParentClass dg = new ChildClass();
// This concept is known as upcasting
// Which means when you're creating a reference of the parent class but giving it an object of the child class, the
// parent class reference only has the access to its own properties, not any properties of the child class

// Similarly, if we do ChildClass myObj = new ParentClass();
// It shows a compiler error

public class MainClass {
    public static void main(String[] args) {

        ParentClass pObj = new ParentClass(); // creating parent class object
        pObj.ParentMethod(); // accessing parent class method
        System.out.println(pObj.parentClassVariable); // accessing parent class attribute
       // pObj.ChildMethod(); parent class reference 'pObj' cannot call child method as it has no access to it

        ParentClass pObjTypeCast = new ParentClass();
       // ((ChildClass)pObjTypeCast).ChildMethod(); // we can access the child class method using the parent class reference
        // by using the type cast operator. Here it is, "((ChildClass)pObj)"

        System.out.println("********************");

        ChildClass cObj = new ChildClass(); // creating child class object
        System.out.println(cObj.childClassVariable);
        System.out.println(cObj.parentClassVariable); // child class reference 'cObj' can access parent class properties
        // Since child class inherits all the properties of the parent class
        cObj.ParentMethod();
        cObj.ChildMethod();

        System.out.println("********************");

        ParentClass pObj2 = new ChildClass(); // we create a parent class reference and assign it to the child class object
        pObj2.ParentMethod();
        // pObj2.ChildMethod(); this shows error because even though we assign child class object to the parent class reference
        // the reference 'pObj2' only has access to the parent class properties
        // this is called upcasting

        // ChildClass cObj2 = new ParentClass(); this also prints error as you cannot assign parent class object to
        // child class reference

    }
}

package Sept20.staticKeyword;

public class staticProgramPractice {
    // basically static attributes/variables/methods don't need an object to be accessed unlike regular attributes/variables/methods

    int age = 12;
    String color = "red";
    static String stat = "Static Variable"; // a static variable

    staticProgramPractice(){
        System.out.println("In the Default Constructor"); // gets called when the object is created, in this case 'myObj'
    }

    {
        System.out.println("Non static block"); // even though this block is initialized first it gets called AFTER the static block
    }

    static{
        System.out.println("This is the static block"); // the static block gets compiled first
    }

    void usingThisKeyword(int x){ // this method is simply a practice for 'this' keyword
        System.out.println("In the usingThisKeyword method");
        System.out.println(this.age);
        this.age = x; // 'this' keyword is used to directly access the attribute variables i.e. global variables
        System.out.println(age);
    }

    public static void main(String[] args) {
        System.out.println(staticProgramPractice.stat); // static variables can be directly called by the class name
        // it doesn't need any object to call it unlike non-static variables

        staticProgramPractice myObj = new staticProgramPractice(); // this calls the default constructor

        System.out.println(myObj.age); // see how non-static variables require an object to be called
        System.out.println(myObj.color); // same as line 15

        System.out.println(myObj.stat); // this still accesses the variable without any error, but it takes an extra step
        // in the compiler i.e. it changes from 'myObj.stat' to 'staticProgramPractice.stat'
        // hence this is an extra step that can be avoided simply by using the class name to access

        myObj.usingThisKeyword(77); // calling the parameterized method

        stat = "Static variable is changed"; // as you can see that static variable can be accessed without class name
        System.out.println(stat);
    }
}

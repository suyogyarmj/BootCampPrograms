package Sept23.MethodOverriding;

// method overloading is the phenomenon in which two or more methods are given the same name in order to increase program
// readability
public class MethodOverloading {
    // creating static methods so we don't have to create instances of them
    static int sum (int x, int y){
        return x+y;
    } // this sum method takes 2 parameters
    static int sum (int a, int b, int c) {
        return a + b + c;
    } // this sum method takes 3 parameters

    public static void main(String[] args) {
        System.out.println(MethodOverloading.sum(1,2));
        System.out.println(MethodOverloading.sum(1,2,3));
        // In the above two lines, when 2 arguments are passed then the sum method defined with 2 parameters is called
        // Similarly, when 3 arguments are passed the sum method defined with 3 parameters is called
    }
}

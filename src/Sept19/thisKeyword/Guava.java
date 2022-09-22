package Sept19.thisKeyword;
// basically what 'this' keyword does is it points to the instance variable or also called attribute variable
// of the class, instead of the local variable of the same name
public class Guava {
    String color; // attribute name of the object or instance variables
    int num;
    String model;

    public Guava() { // non-parameterized or default constructor
    }
    public Guava(String color, int num) {

        this.color = color; // this refers to the attribute - so here the parameters are passed to the instance variables
        this.num = num; // similarly, the value contained in the parameter 'num' is passed to the instance 'num'
    }
    public Guava (String color, int num, String model){
        this.model = model;
    }

    public void show() {
        String color = "green";
        int num =4;
        String model = "Android";
        System.out.println(this);
        System.out.println(color);
        System.out.println(this.color);
        System.out.println(num);
        System.out.println(this.num);
        System.out.println(model);
        System.out.println(this.model);
    }
    public static void main(String[] args) {
        Guava gg = new Guava();
        gg.show();
        System.out.println();
        System.out.println();
        Guava gg1 = new Guava("purple", 7);
        gg1.show();
        System.out.println();
        System.out.println();
        Guava gg2 = new Guava("peach", 8, "iPhone" );
        gg2.show();
        System.out.println("********************");
        System.out.println(gg1.color);
        System.out.println(gg2.model);
    }
}

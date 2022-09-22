package Sept19.thisKeyword;

public class thisKeywordClass {
    int p = 45; // attribute of the class or instance variable

    public void show(){
        int p = 90; // local variable
        System.out.println(p); // p gives value of the local variable i.e. 90
        System.out.println(this); // 'this' holds the address of the object being called
        System.out.println(this.p); // 'this' points to the instance variable i.e. the attribute and give 45
    }
// this keyword is used to directly refer the instance variable instead of the local variable
    public static void main(String[] args) {
        thisKeywordClass myObj1 = new thisKeywordClass();
        myObj1.show();
        System.out.println(myObj1); // 'myObj' will have the same address as the 'this' keyword
    }
}

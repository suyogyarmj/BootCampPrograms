package Sept15.OOP;
import java.util.Scanner;

public class Mobile {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        Mobile myObj = new Mobile();
        System.out.print("Please enter the user number(1 or 2): ");
        int userNumber = myScanner.nextInt();
        if (userNumber == 1){
            myObj.user1();
        }
        else if(userNumber == 2){
            myObj.user2();
        }
        else{
            System.out.println("Invalid User Number");
        }
    }
    void user1(){
        System.out.println("Price for user 1");
    }

    void user2(){
        System.out.println("Price for user 2");
    }
}

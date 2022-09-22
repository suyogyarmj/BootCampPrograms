package Sept15.OOP;

import groovy.console.ui.SystemOutputInterceptor;

public class ElephantColor {
    void color(String x){
        System.out.println("The color of the elephant is: "+x);
    }

    public static void main(String[] args){
        ElephantColor myObj = new ElephantColor();
        myObj.color("black");
        myObj.color("brown");
        myObj.color("white");
        myObj.color("yellow");
    }
}

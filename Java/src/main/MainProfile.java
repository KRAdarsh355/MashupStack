package main;

import profile.UserInput;       /*Creating user defined packages */
import greeting.GreetingDisplay;

public class MainProfile {      //Creating a class with main method
    public static void main(String args[]){
        UserInput u = new UserInput();                    //Creating objects for user-defined packages
        GreetingDisplay gd=new GreetingDisplay();               
        u.input();                  //Calling the methods from user-defined packages
        gd.greet();
    }
}

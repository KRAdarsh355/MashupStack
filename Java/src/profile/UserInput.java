package profile;

import java.util.*;     //Importing util class
public class UserInput {        //Creating a class
    public void input(){        //Creating a method input()
        Scanner s = new Scanner(System.in); //Creating an object for scanner class
        System.out.println("Please enter your name:");      
        String name=s.nextLine();       //Reading user input
    }
}

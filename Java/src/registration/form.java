package registration;

import java.util.*;  //Importing the util class
public class form{
    public void forms(){        //Creating a method
        Scanner s = new Scanner(System.in);         //Creating an object for scanner class
        System.out.println("Enter your first name:");
        String fname=s.next();              //Taking an input from user
        System.out.println("Enter your age:");
        int age=s.nextInt();            //Taking an input from user
        System.out.println("Welcome "+fname+",you are "+age+" years old.");         //Outputting the final message
    }
    }


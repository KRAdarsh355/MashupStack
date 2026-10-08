package registration;

import java.util.*;
public class form{
    public void forms(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your first name:");
        String fname=s.next();
        System.out.println("Enter your age:");
        int age=s.nextInt();
        System.out.println("Welcome "+fname+",you are "+age+" years old.");
    }
    }


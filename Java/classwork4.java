import java.util.*;

public class classwork4 {
    public static void main(String args[]){
        String username="admin";
        String password="java123";

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Username:");
        String username1=sc.nextLine();

        System.out.println("Enter Password:");
        String password1=sc.nextLine();

        if(username.equals(username1) && password.equals(password1)){
            System.out.print("Login Successful");
        }
        else{
            System.out.print("Access denied");

        }
    }
}

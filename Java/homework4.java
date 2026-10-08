import java.util.*;
public class homework4 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Username Code: 'A' for admin, 'S' for student, 'G' for guest =");
        String usercode=sc.next();

        System.out.println("Enter password: 1234 for admin, 1111 for student =");
        int pass=sc.nextInt();
        System.out.println("Enter Role ID: 1 for admin, 2 for student, 3 for guest =");
        int id=sc.nextInt();
        if(usercode.equals("A") && pass==1234 && id==1){
        System.out.println("Welcome Admin. Full access granted.");
            
        }
        else if(usercode.equals("S") && pass==1111 && id==2){
        System.out.println("Welcome Student. Limited access granted.");
        }
        else if(id==3){
        System.out.println("Welcome Guest. View-only access.");
        }
        else{
            System.out.println("Invalid credentials or role.");
        }




    }
    
}

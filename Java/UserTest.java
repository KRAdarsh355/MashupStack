// package msjava;

abstract class User{
	abstract void showMessage();
	public void displayUserType(){
		System.out.println("User type selected.");
	}
}
class AdminUser extends User{
		public void showMessage(){
			System.out.println("Welcome,Admin!");
		}
}
class GuestUser extends User{
	public void showMessage(){
		System.out.println("Welcome,Guest!");
	}
}


public class UserTest{

	public static void main(String[] args) {
		
		AdminUser a=new AdminUser();
		GuestUser g=new GuestUser();
		
		a.displayUserType();
		a.showMessage();
		g.displayUserType();
		g.showMessage();
		
	}

}

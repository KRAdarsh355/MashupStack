package msjava;
public class Bookstore {
	public static void main(String args[]) {
		int nbooks=3;
		int price=275;
		double total= nbooks*price;
		int disc=10;
		
		double discount=(double)disc/100;
		double finalprice=total-total*discount;
		System.out.println("Cost of a book ="+price
				+"\nCustomer order ="+nbooks
				+"\nTotal price ="+total
				+"\nDiscount = 10%"
				+"\nFinal price after disocunt ="+finalprice);

	}

}

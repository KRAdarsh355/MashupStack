public package msjava;

public class BillingTool {

	public static void main(String[] args) {
		String item="Soap";
		int qty=4;
		float unitPrice= 18.75f;
		float totalCost= qty*unitPrice;
		System.out.println("Item name:"+item
				+"\nQuantity = "+qty
				+"\nUnit Price = "+unitPrice
				+"\nTotal Cost = "+totalCost);
		
	}

}
 

public class Bill{
private String billNumber;
private double totalAmount;

Bill(String billNumber, double totalAmount){
this.billNumber = billNumber;
this.totalAmount = totalAmount;


}

public void displayBill(){
System.out.println("Billing Information: ");
System.out.println("Bill No. " + this.billNumber);
System.out.println("Total Amount: Rs." + this.totalAmount);}}

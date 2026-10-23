public class FoodOrder{
private String orderId;
private Customer customer;
private Bill bill;

FoodOrder(String orderId, Customer customer, String billNumber, double totalAmount){
this.orderId = orderId;
this.customer = customer;
this.bill = new Bill(billNumber, totalAmount);

}
public void displayOrder(){
System.out.println("Order Information: ");
System.out.println("Order ID: "+ this.orderId);
this.customer.displayInfo();
this.bill.displayBill();
}

}
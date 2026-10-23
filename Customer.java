public class Customer extends Person{
private String address;

Customer(String personId, String name, String address){
super(personId, name);
this.address = address;}

public void displayInfo(){
System.out.println("Customer Information: ");
super.displayInfo();
System.out.println("Address: " + address);}




}
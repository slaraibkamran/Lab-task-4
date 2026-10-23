public class DeliveryRider extends Person{
private String vehicleNumber;


DeliveryRider(String personId, String name, String vehicleNumber){
super(personId,name);
this.vehicleNumber = vehicleNumber;



}
public void displayInfo(){
System.out.println("Riders Information: ");
super.displayInfo();
System.out.println("Vehicle Number: "+ this.vehicleNumber);


}}
public class Main{
public static void main(String args[]){

Customer c1 = new Customer("101","Aly","613A");
DeliveryRider dr1 = new DeliveryRider("102", "Guby","BTS875");
DeliveryRider dr2 = new DeliveryRider("103", "Bell","THV77");
DeliveryDesk dd1 = new DeliveryDesk("Morning Shift");
FoodOrder fd1 = new FoodOrder("MS001",c1,"001", 5789);
FoodOrder fd2 = new FoodOrder("MS002",c1,"002", 7800);

dd1.addOrder(fd1);
dd1.addOrder(fd2);
dd1.addRider(dr1);
dd1.addRider(dr2);


dd1.displayDesk();




}}
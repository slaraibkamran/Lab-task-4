public class DeliveryDesk{
private String deskName;
private FoodOrder[] orders;
private DeliveryRider[] riders;
private int countOrder;
private int countRider;


DeliveryDesk(String deskName){
this.deskName = deskName;
this.orders = new FoodOrder[3];
this.riders = new DeliveryRider[2];
this.countOrder =0;
this.countRider= 0;
} 

public void addOrder(FoodOrder order){
if (countOrder < 3){
this.orders[countOrder++] = order;}

}

public void addRider(DeliveryRider rider){
if (countRider < 2){
this.riders[countRider++] = rider;}


}

public void displayDesk(){
System.out.println("Desk Name: " + this.deskName);
for(int i =0; i < countOrder; i++){
this.orders[i].displayOrder();
}
for(int i =0; i < countRider; i++){
this.riders[i].displayInfo();
}





}




}
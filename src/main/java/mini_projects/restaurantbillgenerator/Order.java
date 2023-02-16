package mini_projects.restaurantbillgenerator;

public class Order {
    public static int count = 999;
    public int orderCode;
    public Dish dish;
    public int numOfDishes;
    public double orderPrice;

    public Order(Dish dish, int numOfDishes) {
        count++;
        this.orderCode = count;
        this.dish = dish;
        this.numOfDishes = numOfDishes;

    }//yemek ve adet parametreleri ile obje olusturalim

    public void setOrderCode(int orderCode) {
        this.orderCode = orderCode;
    }//siparis fiyati hesapla

    public void setPrice() {

        this.orderPrice = this.dish.getPrice() * this.numOfDishes;//3*Adana=3*220

    }
}

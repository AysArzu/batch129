package mini_projects.restaurantbillgenerator;

public class Order {
    public int orderCode;
    public Dish dish;
    public int numOfDishes;
    public double orderPrice;

    public Order( Dish dish, int numOfDishes) {

        this.dish = dish;
        this.numOfDishes = numOfDishes;

    }
    public void setOrderCode(int orderCode){
        this.orderCode=orderCode;
    }
    public void setPrice(){

        this.orderPrice=this.dish.getPrice()*this.numOfDishes;//3*Adana=3*220

    }
}

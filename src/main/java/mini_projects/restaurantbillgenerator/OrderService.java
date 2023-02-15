package mini_projects.restaurantbillgenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OrderService {
    Scanner inp = new Scanner(System.in);
    List<Order> orderList = new ArrayList<>();


    public void createOrder(DishService dishService) {
        int dishCode = -1;
        while (dishCode != 0) {
            System.out.println("Lutfen urun kodunu giriniz: (CIKIS:0)");//100
            dishCode = inp.nextInt();
            Dish dish = dishService.findDishByCode(dishCode);//100,Adana Kebap,220//bulamazsa 0,"",0
            if (dish.getCode() > 0) {

                System.out.println("Adet giriniz");
                int num = inp.nextInt();
                Order order = new Order(dish, num);
                order.setPrice();//Ucret hesapla ve orderprice a ata
                order.setOrderCode(1000 + this.orderList.size());//1000,1001
                this.orderList.add(order);
            }
            for (Order order : this.orderList) {
                System.out.printf("Siparis kodu :%-5s  lezzet kodu:%-3s  adi:%-16s adet:%-2s\n",
                        order.orderCode, order.dish.getCode(), order.dish.getName(), order.numOfDishes);


            }
        }
    }

    public void deleteOrder() {
        boolean isValid=true;
        if (this.orderList.isEmpty()) {
            System.out.println("Siparisiniz bulunmamaktadir");
        } else {
            System.out.println("Iptal etmek istediginiz siparisin kodunu giriniz");
            int code = inp.nextInt();//1000
            for(Order order:this.orderList){
                if(order.orderCode==code){
                    this.orderList.remove(order);
                    System.out.println("Siparisiniz iptal edildi "+order.orderCode+ " "+order.dish.toString() );
                    isValid=true;
                    break;
                }else{isValid=false;

                }
            }
            if(!isValid){
                System.out.println("Siparis kodunuz gecersizdir!");
            }

        }
    }public void printBill(){
        double totalPrice=0.0;
        System.out.println("         Lezzet Fisiniz          ");
        for (Order order:this.orderList){
            System.out.printf("Lezzet kodu:%-5s adi:%-18s adet:%-5s siparis tutari:%-5s Lira\n",
                    order.dish.getCode(),order.dish.getName(),order.numOfDishes,order.orderPrice);
            totalPrice+= order.orderPrice;
        }
        System.out.println("Toplam tutar: "+totalPrice+" Lira");
        System.out.printf("Afiyet olsun...");
        this.orderList= new ArrayList<>();
    }
}

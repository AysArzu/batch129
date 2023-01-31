package advancepractice.practice13;

public class Q02_Map_Aile {
    public static void main(String[] args) {


        //Ad-Soyad-Yaş ve kardeşler listesini tek bir Map içerisinde saklayan bir kod yazınız.

              //iki map i ayri alacagiz diger map i ve list i ayri alacagiz
        Aile ayse = new Aile("Ayse", "Arzu", 23, "Fatih", "Hatice");
        System.out.println(ayse.getAileMap());//{{Ayse=Arzu}={23=[Fatih, Hatice]}}
        Aile veli = new Aile("Veli", "Han", 25, "Mehmet", "Yasemin", "Ruya");
        System.out.println(veli.getAileMap());//{{Veli=Han}={25=[Mehmet, Yasemin, Ruya]}}
        Aile Salim= new Aile("Salim","Arzu",25,"kemal");
        System.out.println(Salim.getAileMap());
    }
}

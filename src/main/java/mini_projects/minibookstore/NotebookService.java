package mini_projects.minibookstore;

import java.util.Scanner;

//2-bNotebook ile ilgili islemler
public class NotebookService implements ProductService{

    @Override
    public void processMenu() {
        Scanner inp=new Scanner(System.in);
            int choice;
            do {
                System.out.println("----------------------------");
                System.out.println("1-Defterleri listele");
                System.out.println("2-Defter ekle");
                System.out.println("3-Defter sil");
                System.out.println("4-Urun koduna  göre filtrele");
                System.out.println("0-Geri Dön");
                System.out.println("Seçiminiz:");
                choice=inp.nextInt();
                inp.nextLine();
                switch (choice){
                    case 1:
                        listProduct();
                        break;
                    case 2:
                        addProduct();
                        break;
                    case 3:
                        deleteProduct();
                        break;
                    case 4:
                        System.out.println("Urun kodu :");
                        String publisher=inp.nextLine();
                        filterProducts(publisher);
                        break;
                    case 0:
                        System.out.println("Ana menüye yönlendiriliyorsunuz...");
                        break;
                    default:
                        System.out.println("Hatalı giriş!!");
                        break;
                }

            }while (choice!=0);
    }

    @Override
    public void listProduct() {

    }

    @Override
    public void addProduct() {

    }

    @Override
    public void deleteProduct() {

    }

    @Override
    public void filterProducts(String filter) {

    }
}
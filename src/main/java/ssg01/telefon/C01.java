package ssg01.telefon;


import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;

public class C01  {



        public static LocalDate dateChecker(String param){   //param lisans yada dogum tarihi verilecek
            Scanner scanner = new Scanner(System.in);
            LocalDate date = LocalDate.now();
            int gun,ay,yil;
            System.out.println("Lutfen "+param+" tarihinizi gun / ay / yil olacak sekilde giriniz" );
            boolean isDigit = false;
            do {
                System.out.println(" gun: ");
                try {
                    gun = scanner.nextInt();
                    System.out.println(" ay : ");
                    ay = scanner.nextInt();
                    System.out.println(" gun: ");
                    yil = scanner.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Girdiginiz degerler rakam olmalidir.");
                    scanner.nextLine();
                    isDigit = true;
                    continue;
                }
                try {
                    date = LocalDate.of(yil,ay,gun);
                }catch(Exception e){
                    System.out.println(" Lutfen gecerli bir tarih giriniz.");
                    isDigit= true;
                }
            }while(isDigit);

            return date;


        }

        }


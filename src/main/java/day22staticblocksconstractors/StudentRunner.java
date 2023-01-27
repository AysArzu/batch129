package day22staticblocksconstractors;

public class StudentRunner {
    public static void main(String[] args) {

Student std1= new Student("Ayse Arzu", 12, 7,"AA127","Istanbul");
Student std2= new Student("Ebubekir Battal", 21,"EB2112");
        System.out.println(std1);//Student{name='Ayse Arzu', age=12, grade=7, stdId='AA127', address='Istanbul'}
        System.out.println(std2);//Student{name='Ebubekir Battal', age=21, grade=0, stdId='EB2112', address='null'}



    }
}

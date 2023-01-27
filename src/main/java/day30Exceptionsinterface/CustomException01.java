package day30Exceptionsinterface;

public class CustomException01 {

    public static void main(String[] args) {
        getStudentGrade(98);
        getTheNumberOfStudents(-24);


    }public  static void getStudentGrade(int grade){
        if(grade<0||grade>100){
            try {
                throw new InvalidStudentGradeException("Student grades cannot be less than zero or grater than 100");
            } catch (InvalidStudentGradeException e) {
                System.out.println(e.getMessage());
            }
        }else {
            System.out.println(grade);
        }
    }public static void getTheNumberOfStudents(int numOfStudent){
        if(numOfStudent<0){
            try {
                throw new InvalidNumberException("Student number cannot be negative");// obje oluşturduğumuz için new diyoruz
            }catch (InvalidNumberException e){
                System.err.println(e.getMessage());
            }
        }else{
            System.out.println(numOfStudent);
        }
    }
}

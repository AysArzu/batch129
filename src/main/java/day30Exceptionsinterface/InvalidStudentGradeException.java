package day30Exceptionsinterface;

public class InvalidStudentGradeException extends Exception {
    /*
    exception classların son kelimesi exception olur çoğul yazılmaz.
    1)Kendi application'imiza özel kurallar oluşturmak için kendi "Exception Class'larınızı oluşturabilirsiniz.
    2)Oluşturduğunuz "Exception Classlar i)Compile Time Exception ii)Run time Exception olabilir
    3)Compile Time Exception oluşturmak için class'ınızın parent'i "Exception Class" olmalıdır.
    4)Run Time Exception oluşturmak için class'ınızın parent'i "RunTimeException Class" olmalıdır.
    5)Kendi oluşturduğumuz Exception Class'lara "Custom Exception Class" denir.
     */
    public InvalidStudentGradeException(String message) {
        super(message);
    }
}

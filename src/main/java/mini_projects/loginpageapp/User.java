package mini_projects.loginpageapp;

public class User {
    //3-name,username,email,password
    private String name;
    private String userName;
    private String email;
    private String password;
    //4-user objesi olusturulurken ozellikler set edilsin
    public  User(String name, String userName, String email, String password){
        this.name=name;
        this.userName=userName;
        this.email=email;
        this.password=password;


    }

    public String getName() {
        return name;
    }

    public String getUserName() {
        return userName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}

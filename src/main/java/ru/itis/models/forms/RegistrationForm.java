package ru.itis.models.forms;

public class RegistrationForm {

    private String firstName;
    private String  secondName;
    private String email;
    private String country;
    private String password;

//    public RegistrationForm(){}
//
//    public RegistrationForm(String firstName, String secondName, String email, String country, String password) {
//        this.firstName = firstName;
//        this.secondName = secondName;
//        this.email = email;
//        this.country = country;
//        this.password = password;
//    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

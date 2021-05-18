package forTests;

public class Human {
    private String name;
    private String surname;
    private String telephone;


    public Human(String name, String surname, String telephone) {
        this.name = name;
        this.surname = surname;
        this.telephone = telephone;
    }


    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getTelephone() {
        return telephone;
    }
}

package Project;

import lombok.Data;

@Data
public class Magician {
    private String firstName;
    private String secondName;
    private String country;
    private String city;
    private String phoneNumber;
    private String lotNumber;

    public Magician(String firstName, String secondName, String country, String city, String phoneNumber) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.country = country;
        this.city = city;
        this.phoneNumber = phoneNumber;
    }
}

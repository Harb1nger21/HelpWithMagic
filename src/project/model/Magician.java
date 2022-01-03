package project.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

//Класс для хранения информации об участнике

@Getter
@Setter
@EqualsAndHashCode
public class Magician implements Comparable<Magician>, Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    private String firstName;
    private String secondName;
    private String country;
    private String city;
    private String phoneNumber;
    private Integer lotNumber;

    public Magician(String firstName, String secondName, String country, String city, String phoneNumber) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.country = country;
        this.city = city;
        this.phoneNumber = phoneNumber;
    }

    public String getFullName() {
        return firstName + " " + secondName;
    }

    public String getBornPlace() {
        return country + ", " + city;
    }

    @Override
    public int compareTo(Magician magician) {
        return Integer.compare(lotNumber, magician.lotNumber);
    }
}

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
    private String lotNumber;

    public Magician(String firstName, String secondName, String country, String city, String phoneNumber) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.country = country;
        this.city = city;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public int compareTo(Magician magician) {
        return lotNumber.compareTo(magician.lotNumber);
    }
}
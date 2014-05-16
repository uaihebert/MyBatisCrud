package uai.model;

import java.util.Date;

public class Customer {
    private int id;
    private Date birth;
    private String name;
    private Gender gender;
    private String socialSecurityNumber;

    public Customer() {
    }

    public Customer(Date birth, String name, Gender gender, String socialSecurityNumber) {
        this.birth = birth;
        this.name = name;
        this.gender = gender;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public Customer(int id, Date birth, String name, Gender gender, String socialSecurityNumber) {
        this.id = id;
        this.birth = birth;
        this.name = name;
        this.gender = gender;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", birth=" + birth +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                ", socialSecurityNumber='" + socialSecurityNumber + '\'' +
                '}';
    }
}
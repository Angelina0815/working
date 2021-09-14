package com.example.demo.entity;


public class customer {
    private String name;
    private int sex;
    private String nationality;
    private int birthday;
    private String address;
    private int ID;
    private int date;

    public String getName() {
        return name;
    }

    public int getSex() {
        return sex;
    }

    public String getNationality() {
        return nationality;
    }

    public int getBirthday() {
        return birthday;
    }

    public String getAddress() {
        return address;
    }

    public int getID() {
        return ID;
    }

    public int getDate() {
        return date;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public void setBirthday(int birthday) {
        this.birthday = birthday;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setDate(int date) {
        this.date = date;
    }



    @Override
    public String toString() {
        return "Customer{" +
                "name=" + name + '\'' +
                ", sex=" + sex + '\'' +
                ", nationality=" + nationality +
                ", birthday=" + birthday +
                ", address=" + address +
                ", id='" + ID + '\'' +
                ", date=" + date +
                '}';
    }
}
package com.thillel.denisov.homeworks.homeworks11;

public class Users {
    private final String name;
    private final int years;
    int age = 2020 - getYears();
    private final int yearsDay;
    private final String yearsMonth;
    private final String email;
    private final long phoneNumber;
    String secondName;
    double weight;
    int pressure;
    int stepDay;

    public String getName() {
        return name;
    }

    public int getYears() {
        return years;
    }

    public int getYearsDay() {
        return yearsDay;
    }

    public String getYearsMonth() {
        return yearsMonth;
    }

    public String getEmail() {
        return email;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public Users(String name, int years, int yearsDay, String yearsMonth, String email, long phoneNumber, String secondName, double weight, int pressure, int stepDay) {
        this.name = name;
        this.years = years;
        this.yearsDay = yearsDay;
        this.yearsMonth = yearsMonth;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.secondName = secondName;
        this.weight = weight;
        this.pressure = pressure;
        this.stepDay = stepDay;
    }


    @Override
    public String toString() {
        return "Users{" +
                "Name='" + name + '\'' +
                ", Year=" + age +
                ", Day=" + yearsDay +
                ", Month=" + yearsMonth +
                ", email='" + email + '\'' +
                ", Phone Number=" + phoneNumber +
                ", Second Name='" + secondName + '\'' +
                ", Weight=" + weight +
                ", Pressure=" + pressure +
                ", Steps Day=" + stepDay +
                '}';
    }
}

package src.main.java;

import java.math.BigDecimal;

public class Employee {

    private String name;
    private String lastName;
    private Integer age;
    private double hourlyWage;
    private Integer monthlySales;

    public Employee(String name, String lastName, Integer age, double hourlyWage, Integer monthlySales) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.hourlyWage = hourlyWage;
        this.monthlySales = monthlySales;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public double getHourlyWage() {
        return hourlyWage;
    }

    public void setHourlyWage(double hourlyWage) {
        this.hourlyWage = hourlyWage;
    }

    public Integer getMonthlySales() {
        return monthlySales;
    }

    public void setMonthlySales(Integer monthlySales) {
        this.monthlySales = monthlySales;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", hourlyWage=" + hourlyWage +
                ", monthlySales=" + monthlySales +
                '}';
    }
}
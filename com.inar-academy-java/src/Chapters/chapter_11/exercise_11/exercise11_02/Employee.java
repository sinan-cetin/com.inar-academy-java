package Chapters.chapter_11.exercise_11.exercise11_02;

import Chapters.chapter_10.exercise_10.exercise10_14.MyDate;

import java.util.Date;

public class Employee extends Person {
    private String office;
    private double salary;
    MyDate dateHired;

    public Employee() {
        this(null, null, null, null, null, 0);
    }

    public Employee(String name, String address, String phoneNumber, String email, String office, double salary) {
        super(name, address, phoneNumber, email);
        this.office = office;
        this.salary = salary;
        dateHired = new MyDate();

    }

    public String getOffice() {
        return this.office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public MyDate getDateHired() {
        return this.dateHired;
    }

    @Override
    public String toString() {
        return super.toString() + "\nOffice : " + this.office + "\nSalary : " + this.salary + "$" + "\n" + dateHired.toString();
    }
}

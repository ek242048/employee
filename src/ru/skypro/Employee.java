package ru.skypro;

public class Employee {
   private String firstName;
   private String middleName;
   private String secondName;
   private int department;
   private double salary;
   private int id;

   static int counter;

   public Employee (String firstName, String middleName, String secondName, int department, double salary) {
       this.firstName = firstName;
       this.middleName = middleName;
       this.secondName = secondName;
       this.id = counter ++ ;
       this.department = department;
       this.salary = salary;

   }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getSecondName() {
        return secondName;
    }

    public int getId() {
        return id;
    }

    public int getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Сотрудник: " + firstName + " " + middleName + " " + secondName + ", id = " + id + ", отдел " + department + ", з/п " + salary;
    }
}

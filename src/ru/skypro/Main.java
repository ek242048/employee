package ru.skypro;

public class Main {

    public static void printEmployees (Employee [] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void sumSalary (Employee [] arr) {
        double salarySum = 0;
        for (int i = 0; i < arr.length; i++) {
            salarySum += arr[i].getSalary();
        }
        System.out.println("Сумма затрат на зарплату в месяц по предприятию составила " + salarySum + " рублей");

    }

    public static void findMaxSalary (Employee [] arr) {
        double maxSalary = arr[0].getSalary();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null && arr[i].getSalary() > maxSalary) {
                maxSalary = arr[i].getSalary();
            }
        }
        System.out.println("Максимальная зарплата - " + maxSalary + " рублей");
    }

    public static void findMinSalary (Employee [] arr) {
        double minSalary = arr[0].getSalary();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null && arr[i].getSalary() < minSalary) {
                minSalary = arr[i].getSalary();
            }
        }
        System.out.println("Минимальная зарплата - " + minSalary + "рублей");
    }

    public static void findAverageSalary (Employee [] arr) {
        double salarySum = 0;
        for (int i = 0; i < arr.length; i++) {
            salarySum += arr[i].getSalary();
        }
        double averageSalary = salarySum / arr.length;
        System.out.println("Средняя зарплата - " + averageSalary + "рублей");

    }

    public static void printFIO (Employee [] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].getFirstName() + " " + arr[i].getMiddleName() + " " + arr[i].getSecondName());
        }
    }



    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        employees[0] = new Employee("Иван", "Сергеевич", "Петров", 1, 76000);
        employees[1] = new Employee("Иван", "Иванович", "Иванов", 2, 57000);
        employees[2] = new Employee("Петр", "Петрович", "Сидоров", 3, 77000);
        employees[3] = new Employee("Степан", "Михайлович", "Яковлев", 4, 46550);
        employees[4] = new Employee("Борис", "Григорьевич", "Степанов", 5, 50300);
        employees[5] = new Employee("Дмитрий", "Олегович", "Курочкин", 5, 48730);
        employees[6] = new Employee("Павел", "Алексеевич", "Мамонов", 3, 61200);
        employees[7] = new Employee("Никита", "Евгеньевич", "Сергеев", 2, 47120);
        employees[8] = new Employee("Анна", "Андреевна", "Кошкина", 1, 54890);
        employees[9] = new Employee("Мария", "Петровна", "Пугачева", 4, 49370);

        printEmployees(employees);

        sumSalary(employees);

        findMaxSalary(employees);

        findMinSalary(employees);

        findAverageSalary(employees);

        printFIO(employees);

    }




}

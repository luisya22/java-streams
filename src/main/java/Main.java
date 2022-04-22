package src.main.java;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args){
        List<Employee> employees = getEmployees();

        //Imperative Filter
        List<Employee> filteredEmployeeList = new ArrayList<>();

        for(Employee employee : employees){
            if(employee.getAge() >= 30){
                filteredEmployeeList.add(employee);
            }
        }

        System.out.println("Imperative Filter: ");
        filteredEmployeeList.forEach(System.out::println);
        System.out.println("---------------\n");

        // Filter
        filteredEmployeeList = employees.stream()
                .filter(employee -> employee.getAge() >= 30)
                .collect(Collectors.toList());

        System.out.println("Java Stream Filter: ");
        filteredEmployeeList.forEach(System.out::println);
        System.out.println("---------------\n");

        // Sort
        List<Employee> sortedEmployeeList = employees.stream()
                .sorted(Comparator.comparing(Employee::getMonthlySales))
                .collect(Collectors.toList());

        System.out.println("Java Stream Sort: ");
        sortedEmployeeList.forEach(System.out::println);
        System.out.println("---------------\n");

        // Reversed sort
        sortedEmployeeList = employees.stream()
                .sorted(Comparator.comparing(Employee::getMonthlySales).reversed())
                .collect(Collectors.toList());

        System.out.println("Java Stream Sort: ");
        sortedEmployeeList.forEach(System.out::println);
        System.out.println("---------------\n");

        // All Match
        int minimumMonthlySalesQuota = 100;
        boolean allMatch = employees.stream()
                .allMatch(employee -> employee.getMonthlySales() >=  minimumMonthlySalesQuota);

        System.out.println("Java Stream All Match: ");
        System.out.println("All the employees reached the quota: " + allMatch);
        System.out.println("---------------\n");

        // Any Match

        int ageLimit = 18;
        boolean anyMatch = employees.stream()
                .anyMatch(employee -> employee.getAge() < ageLimit);

        System.out.println("Java Stream Any Match: ");
        System.out.println("There are employees younger than the age limit: " + anyMatch);
        System.out.println("---------------\n");
    }

    private static List<Employee> getEmployees(){
        return List.of(
                new Employee("John", "Wallace", 32, 20.00, 450),
                new Employee("Stephen", "Smith", 25, 15.00,  173),
                new Employee("Williams", "Brown", 27, 25.97, 700),
                new Employee("Julia", "Garcia", 33, 24.40, 500),
                new Employee("Andrew", "Davis", 21, 14.50, 220),
                new Employee("Harris", "White", 42, 26.900, 1000),
                new Employee("John", "Wallace", 18, 23.50, 250)
        );
    }
}

package com.turleylabs.functional;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class Streams {
    public static Integer totalDoubleEvens(List<Integer> numbers) {
        Predicate<Integer> integerPredicate = i -> i % 2 == 0;
        Function<Integer, Integer> integerIntegerFunction = i -> i * 2;
        BinaryOperator<Integer> integerBinaryOperator = (runningTotal, current) -> runningTotal + current;
        return numbers.stream()
                .filter(integerPredicate)
                .map(integerIntegerFunction)
                .reduce(0, integerBinaryOperator);
    }

    public static Double totalPrices(List<Double> prices) {
        return prices.stream()
                .filter(d -> d > 20)
                .map(d -> d - ((d - 20) * 0.1))
                .reduce(0.0, (total, current) -> total+ current);
    }

    public static List<String> findMarketingNames(List<Employee> employees) {
        return employees.stream()
                .filter(e -> e.getSalary() >= 100000)
                .map(e -> e.getName())
                .sorted(Comparator.reverseOrder())
                .collect(toList());
    }

    public static Map<Integer, List<String>> groupTechnologyEmployeeNamesBySalary(List<Employee> employees) {
        // Hint: Use auto-complete to explore static functions available in Collectors
        return employees.stream()
                .filter(e -> e.getDepartment().equals(Department.Technology))
                .collect(groupingBy(e -> e.getSalary(),
                        mapping(e -> e.getName(), toList())));
    }

    public static Map<Department, Double> getAverageSalariesByDepartment(List<Employee> employees) {
        // Use auto-complete to explore static functions available in Collectors
        return employees.stream()
                .collect(groupingBy(Employee::getDepartment,
                        Collectors.averagingDouble(Employee::getSalary)));
    }

    public static int getHighestSalaryOfKNames(List<Employee> employees) {
        return -1;
    }

    public static Iterable<Integer> determineSortedUniqueSalaries(List<Employee> employees) {
        return null;
    }

}

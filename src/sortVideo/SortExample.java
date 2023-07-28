package sortVideo;

import java.util.*;

public class SortExample {

    public static void main(String[] args) {
        System.out.println("this i");

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 78, 99, 123, 2131);
        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee("Apple", "12345", 1));
        employeeList.add(new Employee("xdsaad", "31233", 2));
        employeeList.add(new Employee("Cherry", "32421", 3));
        employeeList.add(new Employee("Sex", "1231414", 4));

        Collections.sort(employeeList, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getName().compareTo(o2.getName());
            }
        }.thenComparing(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o2.getEmpId().compareTo(o1.getEmpId());
            }
        }));

        System.out.println(employeeList.toString());

    }
}

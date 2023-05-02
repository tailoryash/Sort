import com.yash.sortmodule.employee.Employee;
import com.yash.sortmodule.sortImple.MyComparator;

import java.util.ArrayList;
import java.util.Collections;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> empList = new ArrayList<>();
        empList.add(new Employee(104, "Parth Solanki", "Java"));
        empList.add(new Employee(101, "Yash Tailor", ".NET"));
        empList.add(new Employee(103, "Arpit Panchal", "CLOUD"));
        empList.add(new Employee(102, "Hardeek Bhatia", "MEAN"));

        // Sorting based on Comparable implementation logic
        Collections.sort(empList);
        System.out.println("Sorting based on Comparable implementation logic \n" + empList);

        // Sorting based on Comparator implementation logic
        empList.sort(new MyComparator());
        System.out.println("Sorting based on Comparator implementation logic \n" + empList);

        // Sorting using Lambda expression
        empList.sort((a, b) -> {
            return b.dept.compareTo(a.dept);
        });
        System.out.println("Sorting based on Lambda Expression \n" + empList);
    }
}
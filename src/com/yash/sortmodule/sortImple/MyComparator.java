package com.yash.sortmodule.sortImple;

import com.yash.sortmodule.employee.Employee;

import java.util.Comparator;

public class MyComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o2.empId - o1.empId;
    }
}

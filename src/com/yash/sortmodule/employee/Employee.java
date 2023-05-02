package com.yash.sortmodule.employee;

public class Employee implements Comparable<Employee> {
    public int empId;
    public String empName;
    public String dept;

    public Employee(int empId, String empName, String dept) {
        this.empId = empId;
        this.empName = empName;
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Employee{" + "empId=" + empId + ", empName='" + empName + '\'' + ", dept='" + dept + '\'' + '}' + "\n";
    }

    @Override
    public int compareTo(Employee o) {
        return this.empName.compareTo(o.empName);
    }

}


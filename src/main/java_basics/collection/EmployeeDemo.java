package java_basics.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

class EmployeeDemo {

    public static void main(String[] args) {

        HashSet<Employee> hashSet = new HashSet<Employee>();

        hashSet.add(new Employee("John", 1000, "office"));
        hashSet.add(new Employee("Paul", 3450, "site"));
        hashSet.add(new Employee("Mick", 5000, "main"));
        hashSet.add(new Employee("Angel", 2450, "it"));

        ArrayList<Employee> arrayList = new ArrayList<Employee>(hashSet);

        Collections.sort(arrayList);

        for (Employee emp: arrayList) {
            System.out.println(emp);
        }

    }

}

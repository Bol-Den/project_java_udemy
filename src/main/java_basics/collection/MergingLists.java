package java_basics.collection;

import java.util.ArrayList;

class MergingLists {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(23);
        numbers.add(15);
        numbers.add(109);
        numbers.add(45);
        numbers.add(88);

        boolean hasValue = numbers.isEmpty();

        System.out.println("numbers: " + numbers);
        System.out.println("is empty: " + hasValue);

        ArrayList<Integer> newNumbers = new ArrayList<>();
        newNumbers.add(11);
        newNumbers.add(34);
        newNumbers.add(15);
        newNumbers.add(45);

        System.out.println("newNumbers: " + newNumbers);

//        numbers.addAll(newNumbers);
//        System.out.println("merge numbers and newNumbers: " + numbers);

//        numbers.removeAll(newNumbers);
//        System.out.println("numbers after removeAll: " + numbers);

        numbers.clear();
        hasValue = numbers.isEmpty();
        System.out.println("numbers cleared: " + numbers);
        System.out.println("is empty: " + hasValue);

    }

}

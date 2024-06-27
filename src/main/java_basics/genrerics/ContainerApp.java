package java_basics.genrerics;

import java.util.*;

class ContainerApp {

    public static void main(String[] args) {
        Container<String, Integer> container = new Container<>("A", 10) ;
        Container<String, String> container2 = new Container<>("A", "B") ;

        container.printItems();
        container2.printItems();

        Set<String> mySet1 = new HashSet<>();
        mySet1.add("one");
        mySet1.add("apple");
        mySet1.add("computer");

        Set<String> mySet2 = new HashSet<>();
        mySet2.add("one");
        mySet2.add("two");
        mySet2.add("monitor");

        Set<String> resultSet = union(mySet1, mySet2);
        System.out.println(resultSet);

        Iterator<String> itr = resultSet.iterator();
        while (itr.hasNext()) {
            // not working if use raw version of iterator i.e Iterator without type
            String var = itr.next();
//            System.out.println(itr.next());
            System.out.println(var);
        }

        List<Integer> myList1 = new ArrayList<>();
        myList1.add(10);
        myList1.add(15);
        myList1.add(11);

        List<Integer> myList2 = new ArrayList<>();
        myList2.add(3);
        myList2.add(6);
        myList2.add(9);

        List<Integer> addtionResult = addition(myList1, myList2);
        System.out.println(addtionResult);

    }

    //// generic method
    public static <E> Set<E> union(Set<E> set1, Set<E> set2){
        Set<E> result = new HashSet<>(set1);
        result.addAll(set2);
        return result;
    }

    //// generic method second
    public static <E> List<E> addition(List<E> val1, List<E> val2){
        List<E> result = new ArrayList<>(val1);
        result.addAll(val2);
        return result;
    }


}

package java_basics.genrerics;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

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
        System.out.println( resultSet);

        Iterator<String> itr = resultSet.iterator();
        while (itr.hasNext()){
            // not working if use raw version of iterator i.e Iterator without type
            String var = itr.next();
//            System.out.println(itr.next());
            System.out.println(var);

        }

    }

    //// generic method
    public static <E> Set<E> union(Set<E> set1, Set<E> set2){
        Set<E> result = new HashSet<>(set1);
        result.addAll(set2);
        return result;
    }

}

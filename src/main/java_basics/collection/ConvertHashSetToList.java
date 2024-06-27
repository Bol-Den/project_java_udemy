package java_basics.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

class ConvertHashSetToList {

    public static void main(String[] args) {

//        HashSet<Integer> hashSet = new HashSet<>();
//        hashSet.add(10);
//        hashSet.add(23);
//        hashSet.add(15);
//        hashSet.add(109);
//        hashSet.add(45);
//        hashSet.add(88);
//        hashSet.add(88);
//
//        /// converting to from HashSet to List
//        ArrayList<Integer> list = new ArrayList<>(hashSet);
//
//        Collections.sort(list);
//        System.out.println(list);


        HashSet<AnimalV2> animals = new HashSet<>();

        animals.add(new AnimalV2("Cow", 5));
        animals.add(new AnimalV2("Chicken", 1));
        animals.add(new AnimalV2("Fish", 5));
        animals.add(new AnimalV2("Bull", 3));
        animals.add(new AnimalV2("Dog", 15));

        ArrayList<AnimalV2> animalsList = new ArrayList<>(animals);
        Collections.sort(animalsList);
        System.out.println(animalsList);

    }

}

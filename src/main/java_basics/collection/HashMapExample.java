package java_basics.collection;

import java.util.HashMap;
import java.util.Map;

class HashMapExample {

    public static void main(String[] args) {

        HashMap<String, String> dictionary = new HashMap<>();

        dictionary.put("Brave", "ready to face danger");
        dictionary.put("Brilliant", "exceptionally clever");
        dictionary.put("Joy", "a feeling of great pleasure");
        dictionary.put("Confident", "state of being certain");

        //// printing dictionary values
        for (String word: dictionary.keySet()){
            System.out.println(dictionary.get(word));
        }

        System.out.println(" ");

        //// printing dictionary values
        for (String val: dictionary.values()){
            System.out.println(val);
        }

        System.out.println(" ");

        //// printing dictionary key and values
        for (Map.Entry<String, String> items : dictionary.entrySet()){
            System.out.println("printing key and values");
            System.out.println(items);

//            System.out.println("printing key");
            System.out.println(items.getKey());

//            System.out.println("printing values");
            System.out.println(items.getValue());
        }

    }

}

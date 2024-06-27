package java_basics.collection;

import java.util.Objects;

class AnimalV2 implements Comparable<AnimalV2>{

   private String name;
   private int age;

    public AnimalV2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", age=" + age
                ;
    }

    @Override
    public int compareTo(AnimalV2 o) {
        if (this.age < o.age) {
            return -1;
        } else if (this.age > o.age) {
            return 1;
        }
        return 0;
    }

}

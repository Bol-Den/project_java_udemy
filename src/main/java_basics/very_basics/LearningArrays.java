package java_basics.very_basics;

class LearningArrays {

    public static void main(String[] args) {

         int[] values = new int[100];

         values[0] = 567;
         values[10] = 100;

         System.out.println(values[11]); // values that wasn't assigned int array by default returns zero

         String[] words = new String[]{"This","is", "my", "name"};
         System.out.println(words[2]);

         words = new String[10];
         System.out.println(words[2]);

    }
}

package java_basics.very_basics;

class ControlFlow {

    public static void main(String[] args) {

        boolean hungry = true;
        if (hungry){
            System.out.println("I'm hungry");
        } else {
            System.out.println("Not hungry");
        }

        int hungerRating = 5;
        if (!(hungerRating < 6)) {
            System.out.println("not much hungry");
        } else {
            System.out.println("very hungry");
        }

        int monthNumber = 6;
        String monthName;

        switch(monthNumber) {
            case 1 -> monthName = "Jan";
            case 2 -> monthName = "Feb";
            case 3 -> monthName = "Mar";
            case 4 -> monthName = "Apr";
            case 5 -> monthName = "May";
            case 6 -> monthName = "Jun";
            default -> monthName = "Unknown";
        }

        System.out.println(monthName);
    }
}

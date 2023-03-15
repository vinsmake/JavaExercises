public class Condicionales {
    public static void main(String[] args) {
        System.out.println("This is a conditional practice");

        int age = 17;
        int adult = 1;

        String ageAnswer = "";
        String adultAnswer = "";

        if (age >= 18) { // start of the condition (if)
            System.out.println("can");
            ageAnswer = "can";
        } else {
            if (adult >= 1) { // they can pass if there's an adult
                System.out.println("there's an adult");
                adultAnswer = "because you are with an adult";
                ageAnswer = "can";
            } else { // otherwise they cannot pass
                System.out.println("can't");
                ageAnswer = "can't";
            }
            System.out.println("you " + ageAnswer + " pass " + adultAnswer); // prints if they can or not pass
        } // if end
    };
}

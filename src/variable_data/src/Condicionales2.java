public class Condicionales2 {
    public static void main(String[] args) {
        System.out.println("This is a conditional practice");

        int age = 17;
        int adult = 0;
        boolean pair = adult >= 1; //if adult >=1, then true;

        String ageAnswer;

        if (age >= 18 || pair) { // start of the condition (if)
            ageAnswer = "can";
            } else { // otherwise they cannot pass
                ageAnswer = "can't";
            }
            System.out.println("you " + ageAnswer + " pass"); // prints if they can or not pass
        } // if end

        
    };

public class MultiplicationTable {
    public static void main(String[] args) {
        for (int multiplying = 1; multiplying <= 10; multiplying++) {
            for (int multiplier = 1; multiplier <=10; multiplier++) {
                System.out.print("[" + multiplying + " x " + multiplier + " = " + multiplying*multiplier + "]");
                System.out.print("  ");
            }
            System.out.println();
        }
    }
}
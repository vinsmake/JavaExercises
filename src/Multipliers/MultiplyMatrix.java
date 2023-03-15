public class MultiplyMatrix {
    public static void main(String[] args) {
        for (int row = 0; row <=10; row++){
            for (int collumn = 0; collumn <=10; collumn++) {
                if (collumn > row) {
                    break;
                }
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

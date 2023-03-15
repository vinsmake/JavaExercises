public class WhileExample {
    public static void main(String[] args) {
        int counter = 0;
        int total = 0;
        while(counter <10) {
            System.out.println(counter);
            counter ++;
            total = total + counter;
            System.out.println("el total es de " + total);
        }
    }
}

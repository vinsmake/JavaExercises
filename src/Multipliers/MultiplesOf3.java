public class MultiplesOf3 {
    public static void main(String[] args) {
        //EXERCISE: Usa un bucle for para imprimir todos los múltiplos de 3, entre 1 y 100.
        int result;
        int multiplier = 3; //this si the number of the multiplier desired.
        for (int i = 0; i <=100; i++){
            result = i*multiplier; //need to do this to know if the answer is below 100
            if (result >= 100){ //this breaks if the result is below 100
                break;
            }
            System.out.println(i + " x " + multiplier + " = " + result);
        }

        for (int i = multiplier; i < 100; i += multiplier ){
            System.out.println(i/multiplier + " x " + multiplier + " = " + i); //this simplify the bucle by using a divition
        }
    }
}

//simple answer
/* for (int i = 3; i < 100; i += 3 ){
    System.out.println(i); */
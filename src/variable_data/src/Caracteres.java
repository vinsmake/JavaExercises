public class Caracteres {
    public static void main(String[] args) {
        //prints the character a
        char caracter = 'a';
        System.out.println(caracter);

        //prints the character number 64, which is @
        char caracter64 = 64;
        System.out.println(caracter64);

        //prints the character 65 which is A, need to cast the char to compile, because character 64 right now is an @, which mean this is (@+a) and can't compile.
        char caracter65 = (char)(caracter64 + 1);
        System.out.println(caracter65);

    }
}

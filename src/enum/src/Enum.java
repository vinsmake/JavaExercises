import enums.Dia;

public class Enum {
    public static void main(String[] args) {
        for (Dia diaSemana: Dia.values()) {
            System.out.println("El dia de la semana es " + diaSemana);
        }
    Dia domingoVariable = Dia.domingo;
    System.out.println(domingoVariable);
    System.out.println(domingoVariable.name());
    System.out.println(domingoVariable.ordinal());
    System.out.println(domingoVariable.toString());
    }
}

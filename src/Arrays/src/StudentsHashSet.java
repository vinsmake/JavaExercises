import java.util.HashSet;
import java.util.Set;

public class StudentsHashSet {
    public static void main(String[] args) {

        //here we create a Set
        Set<String> studentsSet = new HashSet<>();
        studentsSet.add("Enrique Plascencia");
        studentsSet.add("Luis Isaac");
        studentsSet.add("Saul Paez");
        studentsSet.add("Joel Sigala");
        studentsSet.add("Alan Ortega");

        //The set shows randomly because sets are not sorted in some way, is just a container with a lot of data in disorder.
        for (String student: studentsSet) {
            System.out.println(student);
        }


        //if true, the set contains a "Enrique Plascencia inside"
        boolean enrique = studentsSet.contains("Enrique Plascencia");
        System.out.println(enrique);
    }
}

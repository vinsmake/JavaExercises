public class StudentsDiferentWays {
    public static void main(String[] args) {
        Student student1 = new Student("Enrique", 1);
        Student student2 = new Student("Alan", 2);
        Student student3 = new Student("Amanda", 3);
        Student student4 = new Student("Saul", 4);
        Student student5 = new Student("Joel", 5);

        Course javaCourse = new Course("Java", 60);

        javaCourse.addStudent(student1);
        javaCourse.addStudent(student2);
        javaCourse.addStudent(student3);
        javaCourse.addStudent(student4);
        javaCourse.addStudent(student5);

        javaCourse.getStudentsList().forEach(Student -> System.out.println(Student));

    }
}
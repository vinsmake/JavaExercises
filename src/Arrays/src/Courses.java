import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Courses {

    public static void main(String[] args) {


        //courses declaration
        Course course1 = new Course("Geometria", 20);
        Course course2 = new Course("Fisica", 10);
        Course course3 = new Course("Quimica", 20);
        Course course4 = new Course("Historia", 50);


        //array of courses
        ArrayList<Course> coursesArray = new ArrayList<>();
        coursesArray.add(course1);
        coursesArray.add(course2);
        coursesArray.add(course3);
        coursesArray.add(course4);
        System.out.println("directrly from array" + coursesArray);//this give us the names because we overrided the default class "toString()" in Course.java

        //stream
        List<Course> coursesList = coursesArray.stream().filter(course -> !course.getName().equalsIgnoreCase("PHP")).sorted(Comparator.comparing(Course::getName).reversed()).collect(Collectors.toList());
        System.out.println("from stream" + coursesList);



    }//main
}

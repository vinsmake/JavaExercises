import java.util.ArrayList;


public class CourseJava {

    public static void main(String[] args) {


        //course construction
        Course course1 = new Course("Java", 20);

        //creating and adding a lesson
        course1.addLesson(new Lesson("Object Oriented"));
        course1.addLesson(new Lesson("Array"));
        course1.addLesson(new Lesson("Collections"));
        course1.addLesson(new Lesson("Stream"));





        //array of courses
        ArrayList<Course> coursesList = new ArrayList<>();
        coursesList.add(course1);
        //this acces to thje courseList/0(of the list)/uses the getter of lesson list
        System.out.println(coursesList.get(0).getLessonList());


    }//main
}

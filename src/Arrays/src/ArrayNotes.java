import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayNotes {

    public static void main(String[] args) {
        

    String var1 = "Tomatoes";
    String var2 = "Onions";
    String var3 = "Potatoes";
    String var4 = "Garlic";

    ArrayList<String> myArray = new ArrayList<>();

    myArray.add(var1);
    myArray.add(var2);
    myArray.add(var3);
    myArray.add(var4);
    myArray.add("Apple");
    myArray.add("Orange");

    System.out.println(myArray); //prints array
    System.out.println(myArray.size()); //prints size
    System.out.println(myArray.get(2)); //prints potatoes


    for (String ingredient : myArray) {
        System.out.println("for " + ingredient);
    }; //prints all


    myArray.forEach(ingredient -> {
        System.out.println("forEach " + ingredient);
    }); //prints all


    myArray.sort(Comparator.naturalOrder()); //sorts the array
    System.out.println(myArray);
    myArray.sort(Comparator.reverseOrder()); //sorts the array in reverse
    System.out.println(myArray);


    Collections.sort(myArray); //sorts the array with collections
    System.out.println(myArray);

    Collections.sort(myArray, Collections.reverseOrder()); //sorts the array in reverse with collections
    System.out.println(myArray);
    


    //streams the array (to strem)
    List<String> ingredients = myArray.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList()); 
    System.out.println(ingredients);



    //arrays of objects
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
    //using stream we ignore PHP and add the array to a collection.
/*     List<Course> coursesList = coursesArray.stream().filter(course -> !course.getName().equalsIgnoreCase("PHP")).sorted(Comparator.comparing(Course::getName).reversed()).collect(Collectors.toList());
    System.out.println("from stream" + coursesList); */

    //Collections.sort(coursesArray, Comparator.comparing(Course::getName));


    //getting the total time with array
    int time = 0;
    //for every course in coursesArray{action}
    for(Course course: coursesArray){
        time = time + course.getDuration();
    }
    System.out.println("the total duration is: " + time);

    //getting the total time with stream
    //acces to the array, streams, map the course getDuration, and sums all of them
    System.out.println("the total duration is: " + coursesArray.stream().mapToInt(Course::getDuration).sum());


    //getting the max valor of duration
    System.out.println("the longest course last : " + coursesArray.stream().mapToInt(Course::getDuration).max().getAsInt());

    //usin filters to get data ignoring some course
    System.out.println("the total duration without counting historia is: " + coursesArray.stream().filter(course -> !course.getName().equalsIgnoreCase("Historia")).mapToInt(Course::getDuration).sum());

    System.out.println("the longest course without counting historia last : " + coursesArray.stream().filter(course -> !course.getName().equalsIgnoreCase("Historia")).mapToInt(Course::getDuration).max().getAsInt());




    }
}
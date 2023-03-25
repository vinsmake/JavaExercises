

import java.util.ArrayList;
import java.util.List;

public class Course {

    private String name;
    private int duration;
    private List<Lesson> lessonList = new ArrayList<>();
    private List<Student> studentsList = new ArrayList<>();


    //constructor///////////////////////////////
    public Course(String name, int duration){
        this.name = name;
        this.duration = duration;
    }


    public Course(String name, int duration, List<Lesson> lessonList){
        this.name = name;
        this.duration = duration;
        this.lessonList = lessonList;
    }


    //getters and setters /////////////////////////
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDuration() {
        return this.duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public List<Lesson> getLessonList() {
        return this.lessonList;
    }

    public void setLessonList(List<Lesson> lessonList) {
        this.lessonList = lessonList;
    }


    public List<Student> getStudentsList() {
        return this.studentsList;
    }

    public void setStudentsList(List<Student> studentsList) {
        this.studentsList = studentsList;
    }


    //methods
    //to add lessons to the list
    public void addLesson(Lesson lesson){
        this.lessonList.add(lesson);
    }

    public void addStudent(Student student){
        this.studentsList.add(student);
    }



    //utils
    //Here we override the method which is in default in all clases
    @Override
    public String toString(){
        return this.name;
    }

}
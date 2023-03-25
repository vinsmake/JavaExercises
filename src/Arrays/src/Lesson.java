

public class Lesson {

    private String name;


    //constructor///////////////////////////////
    public Lesson(String name){
        this.name = name;
    }


    //getters and setters /////////////////////////
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //utils
    //Here we override the method which is in default in all clases
    @Override
    public String toString(){
        return this.name;
    }

}
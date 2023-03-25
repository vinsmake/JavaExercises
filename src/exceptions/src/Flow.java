public class Flow {

    public static void main(String[] args) {
        System.out.println("Init main method");
        method1();
        System.out.println("End main method");
    }


    public static void method1() throws MyException{
        System.out.println("Init method 1");


        try {
        method2(); 
        }catch(MyException me){
            me.printStackTrace();
        }


        System.out.println("End method 1");
    }


    public static void method2() {


        System.out.println("Init method 2");


        for(int i = 1; i <= 5; i++){
            throw new MyException("MyExeption was throwed");
        }


        System.out.println("End method 2");
    }
}

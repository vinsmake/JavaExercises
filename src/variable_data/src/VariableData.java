public class VariableData {
    public static void main(String[] varibleDataString) {
        System.out.println("Here starts my variable data project");
        // starts the age variable with the valor of 23
        int age = 23;
        // prints what is on the ()
        System.out.println(age);
        //you can use math with the variables
        age = age+1;
        //also can use math when print
        System.out.println("My age is " + age);
        //starts the salary variable with valor od 10.24, double allows to use the double of memory so you can use decimal. It's necesary to declare the decimal to use it, otherwise, it will not be used.
        double salary;
        salary = 10.24;
        System.out.println("My salary is " + age*salary);
        //rounds the valor forcing to be int
        System.out.println("My salary is " + (int)age*(int)salary);

//here starts the primitive data types
//       byte byteNumber = 127; //8bits(-128 / 127)
//        short shortNumber = 32767; //16bit(-32768 / 32767)
//        int intNumber = 2147483647; //32bits(-2147483648 / 2147483647)
//        long longNumber = 12345678910L; //64bits(-9223372036854775808 / 9223372036854775807) need to have L at the end

        double valor1 = 0.1;
        double valor2 = 0.2;
        double total = valor1 + valor2;
        System.out.println(total);

        float floatValor = 3.14f; //need to have f at the end
        System.out.println(floatValor);
    }
}

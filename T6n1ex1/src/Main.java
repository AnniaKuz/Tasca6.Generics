/**
 * Three objects of the same type.
 * Verify that the arguments can be put in any position when the constructor is called
 */


public class Main {
    public static void main(String[] args) {
        //NoGenericMethods<Integer> numbers = new NoGenericMethods<>(30,10,20);

        NoGenericMethods<String, Integer, Boolean> something = new NoGenericMethods<>("Hello", 10, true);
        NoGenericMethods<Integer,String, Boolean> something1 = new NoGenericMethods<>( 10,"Hello", true);
        NoGenericMethods<Boolean,Integer,String> something2 = new NoGenericMethods<>( true,10,"Hello");

        printNoGenericMethods(something,something1, something2);
    }

    public static void printNoGenericMethods(NoGenericMethods something, NoGenericMethods something1,
                                             NoGenericMethods something2){
        System.out.println(something + "\n" + something1 + "\n" + something2);

    }
}

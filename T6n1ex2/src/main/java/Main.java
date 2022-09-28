public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Name", "Last Name",10);

        GenericMethods<Person, String, Integer> myGenericMethod1 =
                new GenericMethods<>(person1, "This is a person", 100);
        GenericMethods<String, Integer, Person> myGenericMethod2 =
                new GenericMethods<>("Hello", 100, person1);

        callGenericMethod(myGenericMethod1,myGenericMethod2);

    }

    public static void callGenericMethod(GenericMethods myGenericMethod1,
                                         GenericMethods myGenericMethod2){
        myGenericMethod1.printParameters();
        myGenericMethod2.printParameters();

    }
}

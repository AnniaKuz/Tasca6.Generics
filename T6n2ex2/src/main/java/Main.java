import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {

        Person person1 = new Person("My Name", "My Last Name", 10);
        ArrayList<Object> myList = new ArrayList<>();
        myList.add(1);
        myList.add("2");
        myList.add(person1);

        GenericMethods<Integer, String, Person> generic1 = new GenericMethods<>(myList);
        System.out.println(generic1.toString());

    }
}







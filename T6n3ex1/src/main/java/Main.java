/**
 * To do this exercise we need one interface " Telephone" and three classes: Smartphone, Generic and Main.
 * Telephone has one method call().
 *
 * Smartphone has to implement the method call() and also takePhoto()
 *
 * Generic class has to have two generic methods.
 * The 1st has to receive a type of argument restricted to interface Telephone.
 * The 2nd  has to receive an argument restricted to class Smartphone.
 *
 * From these two methods call the methods of Telephone and Smarthphone
 *
 * In the main() create an object Smartphone and pass it to the generic methods of the class Generic
 *
 *Can the method limited to interface Telphone of the class Generic call the method takePhoto()??
 */

public class Main {
    public static void main(String[] args) {
        Smartphone myPhone = new Smartphone();
        Generic<Smartphone> genericSmart = new Generic<>();
        genericSmart.invokeSmartphone(myPhone);
        genericSmart.invokePhone(myPhone);


        Telephone myTelephone = new Smartphone();
        Generic<Telephone> genericPhone = new Generic<>();
        genericPhone.invokeSmartphone(myTelephone);
        genericPhone.invokePhone(myTelephone);

        Telephone myTelephone1 = () -> {

        };
        /**
         * This method doesn't work because it requires class type Smartphone and not interface Telephone
         */
        //genericSmart.invokeSmartphone(myTelephone1);
        genericPhone.invokePhone(myTelephone1);



    }

}

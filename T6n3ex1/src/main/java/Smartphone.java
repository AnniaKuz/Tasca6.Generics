public class Smartphone implements Telephone{
    public Smartphone() {
    }

    @Override
    public void call() {
        System.out.println("The telephone is calling");
    }

    public void takePhoto(){
        System.out.println("The telephone is taking a picture");
    }
}

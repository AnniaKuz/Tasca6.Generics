
public class Generic <N>{
    public  void invokeSmartphone(N arg){
        ((Smartphone)arg).call();
        ((Smartphone)arg).takePhoto();
    }
    public  void invokePhone(N arg){
        ((Telephone)arg).call();

        /**
         * This method doesn't work because interface Telephone doesn't have it
         */
        //((Telephone)arg).takePhoto();
    }
}

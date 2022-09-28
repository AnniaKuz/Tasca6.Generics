public class GenericMethods <A, B> {
    private A a;
    private B b;
    private Integer c;


    public GenericMethods(A a, B b, Integer c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void printParameters(){
        System.out.println("_GenericMethods_\n"+" 1st parameter: "+ a +"\n 2nd parameter: " + b + "\n 3rd parameter: " +c);
    }
}


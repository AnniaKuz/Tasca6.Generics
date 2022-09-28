public class GenericMethods <A, B, C> {
private A a;
private B b;
private C c;

    public GenericMethods(A a, B b, C c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void printParameters(){
        System.out.println("_GenericMethods_\n"+" 1st parameter: "+ a +"\n 2nd parameter: " + b + "\n 3rd parameter: " +c);
    }
}

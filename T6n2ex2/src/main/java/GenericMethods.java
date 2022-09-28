
import java.util.ArrayList;

public class GenericMethods <A,B,C> {
    private A a;
    B b;
    C c;


    public GenericMethods(ArrayList<?> listA) {
        this.a = (A)listA.get(0);
        this.b = (B)listA.get(1);
        this.c = (C)listA.get(2);
    }

    @Override
    public String toString() {
        return "GenericMethods{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}

public class NoGenericMethods <T, Y, U> {
    private T a;
    private Y b;
    private U c;

    @Override
    public String toString() {
        return "NoGenericMethods{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }

    public T getA() {
        return a;
    }

    public void setA(T a) {
        this.a = a;
    }

    public Y getB() {
        return b;
    }

    public void setB(Y b) {
        this.b = b;
    }

    public U getC() {
        return c;
    }

    public void setC(U c) {
        this.c = c;
    }

    public NoGenericMethods(T a, Y b, U c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }


}


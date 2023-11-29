package lambda;

public class B007 {
    public static void main(String[] args) {
        doIt(a -> a * a);
    }

    private static void doIt(MyFunctionalInterface mfi) {
        int b = mfi.runSomething(5);
        System.out.println(b);
    }
}

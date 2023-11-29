package lambda;

public class B005 {
    public static void main(String[] args) {
        MyFunctionalInterface mfi = a -> a + a;

        int b = mfi.runSomething(5);

        System.out.println(b);
    }
}

@FunctionalInterface
interface MyFunctionalInterface {
    int runSomething(int count);
}

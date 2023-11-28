package designpattern.singleton;

public class Client {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        System.out.println(instance1 == instance2 ? "싱글톤이다" : "싱글톤아니다"); // 싱글톤이다

    }
}

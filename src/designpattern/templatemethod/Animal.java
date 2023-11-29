package designpattern.templatemethod;

public abstract class Animal {
    // template method
    public void playWithOwner() {
        System.out.println("귀염둥이 이리온");
        play();
        runSomething();
        System.out.println("잘했어");
    }

    // abstract method
    abstract void play();

    // hook method
    void runSomething() {
        System.out.println("꼬리 살랑 살랑");
    }
}

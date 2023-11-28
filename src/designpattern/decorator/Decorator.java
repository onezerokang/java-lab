package designpattern.decorator;

public class Decorator implements IService{
    IService service;

    @Override
    public String runSomething() {
        System.out.println("클라이언트에게 반환값을 조작 후 전달");
        service = new Service();
        return "정말" + service.runSomething();
    }
}

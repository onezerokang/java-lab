package copy.deepcopy.factory;

public class DeepCopy {
    public static void main(String[] args) {
        Person p1 = new Person("민수", 20);
        Person p2 = new Person(p1);
        Person p3 = Person.copy(p1);

        // p1, p2, p3 변수는 모두 다른 Person 객체를 가리킨다.
        System.out.println("p1 = " + p1);
        System.out.println("p2 = " + p2);
        System.out.println("p3 = " + p3);

    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 복사 생성자
    public Person(Person person) {
        this.name = person.getName();
        this.age = person.getAge();
    }

    // 복사 팩터리
    public static Person copy(Person person) {
        return new Person(person);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

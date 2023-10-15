package copy.shallowcopy;

public class ShallowCopy {
    public static void main(String[] args) {
        Person p1 = new Person("민수", 20);
        Person p2 = p1;

        // 두 주소는 같은 값이 출력된다.
        System.out.println("p1의 주소값 = " + p1);
        System.out.println("p2의 주소값 = " + p2);

        p2.setName("철수");
        System.out.println("p1의 이름 = " + p1.getName()); // 철수
        System.out.println("p2의 이름 = " + p2.getName()); // 철수

    }
}


class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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

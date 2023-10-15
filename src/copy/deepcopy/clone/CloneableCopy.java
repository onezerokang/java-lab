package copy.deepcopy.clone;

public class CloneableCopy {
    public static void main(String[] args) {
        Person p1 = new Person("민수", 20);
        Person p2 = null;

        try {
            p2 = (Person) p1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        System.out.println("p1 = " + p1);
        System.out.println("p2 = " + p2);
    }
}

class Person implements Cloneable {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
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

package 反射获取构造方法_2.Constructor创建对象_3;

public class Student {
    private String name;
    private int age;

    public Student() {
        System.out.println("公共空参数构造方法被创建");
    }

    public Student(String name, int age) {
        System.out.println("公共带参数构造方法被创建");
        this.name = name;
        this.age = age;
    }

    private Student(String name) {
        System.out.println("私有带参数构造方法被创建");
        this.name = name;
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

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

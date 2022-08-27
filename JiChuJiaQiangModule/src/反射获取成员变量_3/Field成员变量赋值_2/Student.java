package 反射获取成员变量_3.Field成员变量赋值_2;

public class Student {

    public String name;

    public int age;

    public String gender;

    private int money = 300;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", money=" + money +
                '}';
    }
}

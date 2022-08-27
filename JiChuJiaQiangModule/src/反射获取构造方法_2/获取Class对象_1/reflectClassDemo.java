package 反射获取构造方法_2.获取Class对象_1;

public class reflectClassDemo {
    public static void main(String[] args) throws ClassNotFoundException {

        //1.Class类中的静态方法forName("全类名")
        //全类名:包名 + 类名
        Class clazz1 = Class.forName("反射获取构造方法_2.获取Class对象_1.Student");
        System.out.println(clazz1);

        //2.通过class属性来获取
        Class clazz2 = Student.class;
        System.out.println(clazz2);

        //3.利用对象的getClass方法来获取class对象
        //getClass方法是定义在Object类中.
        Student s = new Student();
        Class clazz3 = s.getClass();
        System.out.println(clazz3);

    }
}

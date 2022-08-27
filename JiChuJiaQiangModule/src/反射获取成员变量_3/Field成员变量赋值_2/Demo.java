package 反射获取成员变量_3.Field成员变量赋值_2;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class Demo {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //Method1();

        //获取Class对象
        Class clazz = Class.forName("反射获取成员变量_3.Field成员变量赋值_2.Student");
        //获取私有成员变量对象
        Field money = clazz.getDeclaredField("money");
        money.setAccessible(true);
        //获取构造方法对象
        Constructor constructor = clazz.getConstructor();
        //创建Student类对象
        Student s = (Student) constructor.newInstance();
        //利用Field类中的get获取成员变量的值
        Object o = money.get(s);
        System.out.println(o);

    }

    private static void Method1() throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        //创建Class对象
        Class clazz = Class.forName("反射获取成员变量_3.Field成员变量赋值_2.Student");
        //获取公共成员变量对象
        Field name = clazz.getField("name");
        //创建公共空参构造方法对象
        Constructor constructor = clazz.getConstructor();
        //利用空参创建Student对象
        Student s = (Student) constructor.newInstance();
        //给成员变量赋值
        name.set(s, "张三");
        System.out.println(s);
    }
}

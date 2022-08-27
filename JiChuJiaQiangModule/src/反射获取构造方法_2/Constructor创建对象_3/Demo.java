package 反射获取构造方法_2.Constructor创建对象_3;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Demo {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //Method1();

        //Method2();

    }

    private static void Method2() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        Class clazz2 = Class.forName("反射获取构造方法_2.Constructor创建对象_3.Student");
        Constructor declaredConstructor = clazz2.getDeclaredConstructor(String.class);
        /*被private修饰的成员,不能直接使用的
        如果用反射强行获取并使用,需要临时取消访问检查*/
        declaredConstructor.setAccessible(true);
        Student s = (Student) declaredConstructor.newInstance("张飞");
        System.out.println(s);
    }

    private static void Method1() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        //获取Class对象
        Class clazz = Class.forName("反射获取构造方法_2.Constructor创建对象_3.Student");
        //获取构造方法对象
        Constructor constructor = clazz.getConstructor(String.class, int.class);
        //创建Student对象
        Student s = (Student) constructor.newInstance("呆头鹅", 22);
        System.out.println(s);
    }
}
/*T newInstance(Object...initargs) 根据指定的构造方法创建对象
setAccessible(boolean flag) 设置为true,表示取消访问检查*/
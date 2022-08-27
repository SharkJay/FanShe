package 反射获取构造方法_2.获取Constructor对象_2;

import java.lang.reflect.Constructor;

public class constructorDemo {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException {
        //Method1();
        //Method2();

        //Method3();
        Method4();

    }

    private static void Method4() throws ClassNotFoundException, NoSuchMethodException {
    /*Constructor<T> getDeclaredConstructor​(Class<?>... parameterTypes)
    返回一个 Constructor对象，该对象反映由此 Class对象表示的类或接口的指定构造函数。 */
        Class clazz = Class.forName("反射获取构造方法_2.获取Constructor对象_2.Student");
        Constructor declaredConstructor = clazz.getDeclaredConstructor(String.class);
        System.out.println(declaredConstructor);

        Constructor declaredConstructor1 = clazz.getDeclaredConstructor(String.class, int.class);
        System.out.println(declaredConstructor1);
    }

    private static void Method3() throws ClassNotFoundException, NoSuchMethodException {
        //Constructor<T> getConstructor​(Class<?>... parameterTypes) 返回一个 Constructor对象，
        // 该对象反映由该 Class对象表示的类的指定公共构造函数
        Class clazz = Class.forName("反射获取构造方法_2.获取Constructor对象_2.Student");
        Constructor constructor = clazz.getConstructor();
        System.out.println(constructor);

        Constructor constructor1 = clazz.getConstructor(String.class,int.class);
        System.out.println(constructor1);
    }

    private static void Method2() throws ClassNotFoundException {
        /*Constructor<?>[] getDeclaredConstructors​() 返回反映由该 Class对象表示的类声明的所有构造函数的 Constructor对象的数组。 */
        Class clazz = Class.forName("反射获取构造方法_2.获取Constructor对象_2.Student");
        Constructor[] declaredConstructors = clazz.getDeclaredConstructors();
        for (Constructor declaredConstructor : declaredConstructors) {
            System.out.println(declaredConstructor);
        }
    }

    private static void Method1() throws ClassNotFoundException {
        //Constructor<?>[] getConstructors​()
        // 返回一个包含 Constructor对象的数组， Constructor对象反映了由该 Class对象表示的类的所有公共构造函数。
        Class clazz = Class.forName("反射获取构造方法_2.获取Constructor对象_2.Student");
        Constructor[] constructors = clazz.getConstructors();
        //遍历数组
        for (Constructor c : constructors) {
            System.out.println(c);
        }
    }
}

package 反射获取成员变量_3.获取Field对象_1;

import java.lang.reflect.Field;

public class Demo {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException {
        //Method1();
        //Method2();
        Method4();

    }

    private static void Method4() throws ClassNotFoundException, NoSuchFieldException {
        //Method3();
        Class clazz = Class.forName("反射获取成员变量_3.获取Field对象_1.Student");
        Field money = clazz.getDeclaredField("money");
        System.out.println(money);
    }

    private static void Method3() throws ClassNotFoundException, NoSuchFieldException {
        Class clazz = Class.forName("反射获取成员变量_3.获取Field对象_1.Student");
        Field age = clazz.getField("age");
        System.out.println(age);
    }

    private static void Method2() throws ClassNotFoundException {
        //Field[] getDeclaredFields() 返回所有成员变量对象的数组
        Class clazz = Class.forName("反射获取成员变量_3.获取Field对象_1.Student");
        Field[] declaredFields = clazz.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }
    }

    private static void Method1() throws ClassNotFoundException {
        //Field[] getFields() 返回所有公共成员变量对象的数组
        Class clazz = Class.forName("反射获取成员变量_3.获取Field对象_1.Student");
        Field[] fields = clazz.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }
    }
}

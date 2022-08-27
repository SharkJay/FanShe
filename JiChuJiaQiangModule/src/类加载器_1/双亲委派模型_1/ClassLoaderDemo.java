package 类加载器_1.双亲委派模型_1;

public class ClassLoaderDemo {
    public static void main(String[] args) {
        /*Bootstrap class loader：虚拟机的内置类加载器，通常表示为null ，并且没有父null
        Platform class loader：平台类加载器,负责加载JDK中一些特殊的模块
        System class loader：系统类加载器,负责加载用户类路径上所指定的类库*/

        //static ClassLoader getSystemClassLoader​() 返回用于委派的系统类加载器。
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();

        //ClassLoader getParent​() 返回父类加载器进行委派。 
        ClassLoader platformClassLoader = systemClassLoader.getParent();

        //启动类加载器
        ClassLoader parent = platformClassLoader.getParent();

        System.out.println(systemClassLoader);
        System.out.println(platformClassLoader);
        System.out.println(parent);
    }
}

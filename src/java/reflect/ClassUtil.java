package java.reflect;

import java.lang.reflect.Method;

public class ClassUtil {
    public static Class<?> getObjClass(Object object) {
        Class aClass = object.getClass();
        return aClass;
    }

    /**
     * 获取所有对象的所有方法,包括继承而来,修饰符只能是public
     * @param object
     * @return
     */
    public static Method[] getObjPublicMethod(Object object) {
        Class aClass = object.getClass();
        Method[] methods = aClass.getMethods();;
        return methods;
    }

    /**
     * 获取所有对象的所有方法,不包括继承而来,任意修饰符
     * @param object
     * @return
     */
    public static Method[] getOwnObjAllMethod(Object object){
        Class aClass = object.getClass();
        Method[] methods = aClass.getDeclaredMethods();
        return methods;
    }
}

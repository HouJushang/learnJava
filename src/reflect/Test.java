package reflect;

import reflect.demoClass.Animal;
import reflect.demoClass.Dog;

import java.lang.reflect.Method;

public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Method[] dogMethod = ClassUtil.getObjPublicMethod(dog);
        Method[] dogMethod2 = ClassUtil.getObjPublicMethod(dog);

    }
}

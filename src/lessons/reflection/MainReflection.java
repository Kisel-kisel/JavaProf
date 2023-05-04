package lessons.reflection;

import lessons.lesson5.Person;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class MainReflection {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {


        Person person = new Person();
        Class clas = person.getClass();
        System.out.println(clas.getName());
//        Constructor[] constructors = clas.getConstructors();
//        System.out.println(Arrays.toString(constructors));
        Method[] method = clas.getMethods();
        for (Method method1 : method) {
            System.out.println(method);
        }
        System.out.println("1111");

        Method setMethod = clas.getMethod("setYears", int.class);
        System.out.println(setMethod);
        setMethod.invoke(person, 10);
        System.out.println(person);


    }
}

package lessons.generics;

import homeWorks.homeWork11.Person;

public class MainGeneric {
    public static void main(String[] args) {
        TestGeneric<String> stringTestGeneric = new TestGeneric<>("1234");
        TestGeneric<Integer> integerTestGeneric = new TestGeneric<>(1234);

        stringTestGeneric.print();
        integerTestGeneric.print();

    }
}

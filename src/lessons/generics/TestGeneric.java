package lessons.generics;

import java.util.ArrayList;
import java.util.List;

public class TestGeneric<T> {

    private T value;

    public TestGeneric(T value) {
        this.value = value;
    }

    public void print(){
        System.out.println(value);
    }
}

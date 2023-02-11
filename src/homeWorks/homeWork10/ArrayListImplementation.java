package homeWorks.homeWork10;

import java.util.Arrays;

public class ArrayListImplementation {
    int[] array;
    private int size;
    public ArrayListImplementation(int capacity){//количество
        this.array = new int[capacity];
        size = 0;
    }
    public  void add (int element){
        if(array.length == size){
            grow();
        }
        array[size] = element;
        size++;
    }

    private void grow(){
        int newSize = array.length * 2;
        int[] newArray = new int[newSize];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }
    public int size (){
        return size;
    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }

    public void print(){
        String arrayList = "[";

        for (int i = 0; i < size; i++) {
            arrayList += array[i];
            if (i != size -1){
                arrayList += ", ";
            }
        }
        arrayList += "]";
    }

    public void remove(int index){
        array[index] = index;
        int[] newArrayRemove = new int[array.length];
        int[] newArrayRemove1 = new int[array[index]];
        int[] newArrayRemove2 = new int[array.length - index];
        for (int i = 0; i < array[index]; i++) {
            newArrayRemove1[i] = array[i];
        }
//        System.out.println(Arrays.toString(newArrayRemove1));


        for (int i = index + 1; i < array.length; i++) {
            newArrayRemove2[i-index-1] = array[i];
        }

//        System.out.println(Arrays.toString(newArrayRemove2));

        for (int i = 0; i <newArrayRemove1.length ; i++) {
            newArrayRemove[i] = newArrayRemove1[i];
        }

//        System.out.println(Arrays.toString(newArrayRemove));

        for (int i = newArrayRemove1.length; i < array.length; i++) {
            newArrayRemove[i] = newArrayRemove2[i- newArrayRemove1.length];
        }

//        System.out.println(Arrays.toString(newArrayRemove));

        array = newArrayRemove;

    }

    public void add(int index, int element){

        array[index] = index;
        int[] newArrayAdd = new int[array.length];
        int[] newArrayAdd1 = new int[array[index]];
        int[] newArrayAdd2 = new int[array.length - index];
        int[] newArrayAdd3 = new int[1];

        for (int i = 0; i < array[index]; i++) {
            newArrayAdd1[i] = array[i];
        }
//        System.out.println(Arrays.toString(newArrayAdd1));

        for (int i = 0; i < newArrayAdd3.length; i++) {
            newArrayAdd3[i] = element;
        }
//        System.out.println(Arrays.toString(newArrayAdd3));


        for (int i = index + 1; i < array.length; i++) {
            newArrayAdd2[i-index-1] = array[i];
        }

//        System.out.println(Arrays.toString(newArrayAdd2));



        for (int i = 0; i <newArrayAdd1.length ; i++) {
            newArrayAdd[i] = newArrayAdd1[i];
        }

//        System.out.println(Arrays.toString(newArrayAdd));

        for (int i = index; i < index + 1 ; i++) {
            newArrayAdd[i] = newArrayAdd3[i-index];
        }

//        System.out.println(Arrays.toString(newArrayAdd));

        for (int i = newArrayAdd1.length+1; i < array.length; i++) {
            newArrayAdd[i] = newArrayAdd2[i- newArrayAdd1.length-1];
        }

//        System.out.println(Arrays.toString(newArrayAdd));

        array = newArrayAdd;

    }
}


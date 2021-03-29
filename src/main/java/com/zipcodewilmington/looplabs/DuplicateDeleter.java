package com.zipcodewilmington.looplabs;

import java.util.Arrays;

/**
 * Created by leon on 1/25/18.
 */
public abstract class DuplicateDeleter<T> implements DuplicateDeleterInterface<T> {
    protected T[] array;

    public DuplicateDeleter(T[] intArray) {
        this.array = intArray;
    }

    abstract public T[] removeDuplicates(int maxNumberOfDuplications);
    abstract public T[] removeDuplicatesExactly(int exactNumberOfDuplications);

    public int newLength(int num) {
        int counter = 0;
        int newLength = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[j].equals(array[i])) {
                    counter++;
                }
            }
            if (counter < num) {
                newLength++;
            }
            counter = 0;
        }
        return newLength;
    }

    public T[] makeNewArr(int newLength, int num) {
        T[] output = Arrays.copyOf(array, newLength);
        int counter = 0;
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[j].equals(array[i])) {
                    counter++;
                }
            }
            if (counter < num) {
                output[index] = array[i];
                index++;
            }
            counter = 0;
        }
        return output;
    }

    public Integer newLengthExact(int num) {
        int counter = 0;
        int newLength = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[j].equals(array[i])) {
                    counter++;
                }
            }
            if (counter != num) {
                newLength++;
            }
            counter = 0;
        }
        return newLength;
    }

    public T[] makeNewExactArray(int newLength, int num) {
        T[] output = Arrays.copyOf(array, newLength);
        int counter = 0;
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[j].equals(array[i])) {
                    counter++;
                }
            }
            if (counter != num) {
                output[index] = array[i];
                index++;
            }
            counter = 0;
        }
        return output;
    }
}

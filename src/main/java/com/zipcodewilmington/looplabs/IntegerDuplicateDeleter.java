package com.zipcodewilmington.looplabs;

/**
 * Created by leon on 1/29/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer> {
    public IntegerDuplicateDeleter(Integer[] intArray) {
        super(intArray);
    }

    @Override
    public Integer[] removeDuplicates(int maxNumberOfDuplications) {
        int newLength = newLength(maxNumberOfDuplications);
        return makeNewArr(newLength, maxNumberOfDuplications);
    }


    @Override
    public Integer[] removeDuplicatesExactly(int maxNumberOfDuplications) {
        Integer newLength = newLengthExact(maxNumberOfDuplications);
        return makeNewExactArray(newLength, maxNumberOfDuplications);
    }

    public int newLength(int num) {
        int counter = 0;
        int newLength = 0;
        for (int i = 0; i < super.array.length; i++) {
            for (int j = 0; j < super.array.length; j++) {
                if (super.array[j].equals(super.array[i])) {
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

    public Integer[] makeNewArr(int newLength, int num) {
        Integer[] output = new Integer[newLength];
        int counter = 0;
        int index = 0;
        for (int i = 0; i < super.array.length; i++) {
            for (int j = 0; j < super.array.length; j++) {
                if (super.array[j].equals(super.array[i])) {
                    counter++;
                }
            }
            if (counter < num) {
                output[index] = super.array[i];
                index++;
            }
            counter = 0;
        }
        return output;
    }

    public Integer newLengthExact(int num) {
        int counter = 0;
        int newLength = 0;
        for (int i = 0; i < super.array.length; i++) {
            for (int j = 0; j < super.array.length; j++) {
                if (super.array[j].equals(super.array[i])) {
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

    public Integer[] makeNewExactArray(int newLength, int num) {
        Integer[] output = new Integer[newLength];
        int counter = 0;
        int index = 0;
        for (int i = 0; i < super.array.length; i++) {
            for (int j = 0; j < super.array.length; j++) {
                if (super.array[j].equals(super.array[i])) {
                    counter++;
                }
            }
            if (counter != num) {
                output[index] = super.array[i];
                index++;
            }
            counter = 0;
        }
        return output;
    }
}

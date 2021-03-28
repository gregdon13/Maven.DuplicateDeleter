package com.zipcodewilmington.looplabs;

/**
 * Created by leon on 1/28/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class StringDuplicateDeleter extends DuplicateDeleter<String> {
    public StringDuplicateDeleter(String[] input) {
        super(input);
    }

    @Override
    public String[] removeDuplicates(int maxNumberOfDuplications) {
        Integer newLength = newLength(maxNumberOfDuplications);
        return makeNewArr(newLength, maxNumberOfDuplications);
    }

    @Override
    public String[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        Integer newLength = newLengthExactly(exactNumberOfDuplications);
        return makeExactArr(newLength, exactNumberOfDuplications);
    }

    public Integer newLength (int num) {
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

    public String[] makeNewArr (int newLength, int num) {
        String[] output = new String[newLength];
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

    public Integer newLengthExactly (int num1) {
        int counter = 0;
        int newLength = 0;
        for (int i = 0; i < super.array.length; i++) {
            for (int j = 0; j < super.array.length; j++) {
                if (super.array[j].equals(super.array[i])) {
                    counter++;
                }
            }
            if (counter != num1) {
                newLength++;
            }
            counter = 0;
        }
        return newLength;
    }

    public String[] makeExactArr (int newLength, int num1) {
        String[] output = new String[newLength];
        int counter = 0;
        int index = 0;
        for (int i = 0; i < super.array.length; i++) {
            for (int j = 0; j < super.array.length; j++) {
                if (super.array[j].equals(super.array[i])) {
                    counter++;
                }
            }
            if (counter != num1) {
                output[index] = super.array[i];
                index++;
            }
            counter = 0;
        }
        return output;
    }
}

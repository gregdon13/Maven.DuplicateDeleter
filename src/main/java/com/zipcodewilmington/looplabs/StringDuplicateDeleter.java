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
        int counter = 0;
        int newLength = 0;
        for (int i = 0; i < super.array.length; i++) {
            for (int j = 0; j < super.array.length; j++) {
                if (super.array[j].equals(super.array[i])) {
                    counter++;
                }
            }
            if (counter < maxNumberOfDuplications) {
                newLength++;
            }
            counter = 0;
        }
        String[] output = new String[newLength];
        int index = 0;
        for (int i = 0; i < super.array.length; i++) {
            for (int j = 0; j < super.array.length; j++) {
                if (super.array[j].equals(super.array[i])) {
                    counter++;
                }
            }
            if (counter < maxNumberOfDuplications) {
                output[index] = super.array[i];
                index++;
            }
            counter = 0;
        }
        return output;
    }

    @Override
    public String[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        int counter = 0;
        int newLength = 0;
        for (int i = 0; i < super.array.length; i++) {
            for (int j = 0; j < super.array.length; j++) {
                if (super.array[j].equals(super.array[i])) {
                    counter++;
                }
            }
            if (counter != exactNumberOfDuplications) {
                newLength++;
            }
            counter = 0;
        }
        String[] output = new String[newLength];
        int index = 0;
        for (int i = 0; i < super.array.length; i++) {
            for (int j = 0; j < super.array.length; j++) {
                if (super.array[j].equals(super.array[i])) {
                    counter++;
                }
            }
            if (counter != exactNumberOfDuplications) {
                output[index] = super.array[i];
                index++;
            }
            counter = 0;
        }
        return output;
    }
}

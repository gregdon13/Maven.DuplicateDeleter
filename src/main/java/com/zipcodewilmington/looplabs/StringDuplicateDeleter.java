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
        Integer newLength = newLengthExact(exactNumberOfDuplications);
        return makeNewExactArray(newLength, exactNumberOfDuplications);
    }
}

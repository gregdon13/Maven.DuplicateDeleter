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
}

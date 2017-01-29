package com.hackerrank.test.tutorial;

import java.util.Arrays;

/**
 * Created by jackalhan on 1/28/17.
 */
public class _Min_Heap {

    //Equivalent to PriorityQueue<E> in Java implementation
    private int capacity = 10;
    private int size = 0;

    int[] items = new int[capacity];

    private int getLeftChildIndex(int index) {
        return index * 2 + 1;
    }

    private int getRightChildIndex(int index) {
        return index * 2 + 2;
    }

    private int getParentIndex(int index) {
        return index - 1 / 2;
    }

    private boolean hasLeftChild(int index) {
        return getLeftChildIndex(index) < size;
    }

    private boolean hasRightChild(int index) {
        return getRightChildIndex(index) < size;
    }

    private boolean hasParent(int index) {
        return getParentIndex(index) < size;
    }

    private int leftChiild(int index) {
        return items[getLeftChildIndex(index)];
    }

    private int rightChild(int index) {
        return items[getRightChildIndex(index)];
    }

    private int parent(int index) {
        return items[getParentIndex(index)];
    }

    private void swap(int index1, int index2) {
        int tmp = parent(index2);
        items[index1] = items[index2];
        items[index2] = tmp;
    }

    //increase heap size
    private void ensureExtraCapacity() {
        if (size == capacity) {
            items = Arrays.copyOf(items, capacity * 2);
            capacity *= 2;
        }
    }

    //return top element of the heap / tree
    public int peek() {
        if (size == 0) throw new IllegalStateException();
        return items[0];
    }

    // remove min element from array and display it
    // very first element is replaced with the last element of array. So first element is removed.
    // array size is decreased by 1.
    // so array (heap) is not perfectly sorted according to heap tree rule.
    // to sort array, heapifyDown takes a place.
    public int poll() {
        if (size == 0) throw new IllegalStateException();
        int item = items[0];
        items[0] = items[size - 1];
        size--;
        heapifyDown();
        return item;
    }

    // add item to the heap / array
    // first we need to be sure that whether capacity is enough or not to add new item : ensureExtraCapacity
    // add a new item to the last element of array;
    // than increase array size : size++;
    // to finalize it, we need to sort the heap in order to move to last item in to the correct position : heapifyUp();
    private void add(int item) {
        ensureExtraCapacity();
        items[size] = item;
        size++;
        heapifyUp();
    }

    // start with the last element of array
    // loop to swap each element as long as current element has a parent, and this parent is larger than current element
    // walk up by changing current index with the index of its parent. so that it can jump the upward node to continue its looping.
    private void heapifyUp() {
        int index = size - 1;
        while (hasParent(index) && parent(index) > items[index]) {
            swap(getParentIndex(index), index);
            index = getParentIndex(index);
        }
    }

    // start with the very begining element of array
    // loop to swap each element as long as current element has a leftchild, and this leftchild is smaller than current element
    // walk down by changing current index with the index of its left child. so that it can jump the downward node to continue its looping.
    private void heapifyDown() {
        int index = 0;
        while (hasLeftChild(index)) {

            int smallerChildIndex = getLeftChildIndex(index);
            if (hasRightChild(index) && rightChild(index) < leftChiild(index)) {
                smallerChildIndex = getRightChildIndex(index);
            }

            if (items[index] < items[smallerChildIndex]) {
                break;
            } else {
                swap(index, smallerChildIndex);
                index = smallerChildIndex;
            }
        }


    }


}

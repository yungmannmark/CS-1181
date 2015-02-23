/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objects;

import java.util.Scanner;

/**
 *
 * @author Mark
 * @param <T>
 */
public class Permutation<T> {

    Scanner userInput = new Scanner(System.in);

    //Stores original data
    T[] myArray;

    /**
     * No argument constructor
     * <p>
     * PreCondition: None
     * <p>
     * PostCondition: None
     */
    public Permutation() {
    }

    /**
     * Size constructor, initializing myArray to passed size and populating from
     * user input.
     * <p>
     * PreCondition: Must be passed a size (int)
     * <p>
     * PostCondition: myArray is initialized and populated to capacity
     *
     * @param size The size myArray should be initialized to
     */
    public Permutation(int size) {

        //Initializes array to passed size
        myArray = (T[]) new Object[size];

        //Seperate dialogue for first element
        System.out.print("Enter the first element: ");
        myArray[0] = (T) userInput.next();

        for (int i = 1; i < myArray.length; i++) {

            //Default dialogue for middle elements
            if (i != (myArray.length - 1)) {
                System.out.print("Enter the next element: ");
                myArray[i] = (T) userInput.next();
            } //End if statement
            //Seperate dialogue for last element
            else if (i == (myArray.length - 1)) {
                System.out.print("Enter the last element: ");
                myArray[i] = (T) userInput.next();
            } //End else if statement

        } //End for loop

    } //End size constructor

    /**
     * Generic array constructor, populating myArray from passed array.
     * <p>
     * PreCondition: Must be passed an array
     * <p>
     * PostCondition: myArray is populated with contents of passed array
     *
     * @param passedArray The array myArray should be populated from
     */
    public Permutation(T[] passedArray) {

        //Initializes myArray size to size of passed array
        myArray = (T[]) new Object[passedArray.length];

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = passedArray[i];
        } //End for statement

    } //End Generic array constructor

    /**
     * Generic array constructor, populating myArray from passed array.
     * <p>
     * PreCondition: Must be passed an array
     * <p>
     * PostCondition: myArray is populated with contents of passed array
     *
     * @param passedPermutation The Permutation myArray should be populated from
     */
    public Permutation(Permutation passedPermutation) {

        T[] passedArray = (T[]) passedPermutation.getMyArray();

        //Initializes myArray size to size of passed array
        myArray = (T[]) new Object[passedArray.length];

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = passedArray[i];
        } //End for statement

    } //End Generic array constructor

    //Currently not functioning
    public int calculatePermutations() {
        int elementCount = myArray.length;
        int factorial = 0;

        for (int i = elementCount; i > 0; i--) {
            factorial += elementCount * (elementCount - 1);
        }

        System.out.println(factorial);

        return factorial;
    }

    public Permutation[] permutator(int i, int n) {
        Permutation[] arrayOfPermutations = new Permutation[1];

        arrayOfPermutations[0] = swapper(0, 1);

        return arrayOfPermutations;
    }

    public Permutation swapper(int i, int n) {
        Permutation swappedPerm = new Permutation(myArray);

        T elementTemp;

        elementTemp = (T) swappedPerm.getMyArray()[i];

        swappedPerm.getMyArray()[i] = (T) swappedPerm.getMyArray()[n];

        swappedPerm.getMyArray()[n] = elementTemp;

        return swappedPerm;
    }

    public T[] getMyArray() {
        return myArray;
    }

    public T[] cloneMyArray() {

        T[] clonedArray = (T[]) new Object[myArray.length];

        for (int i = 0; i < myArray.length; i++) {
            clonedArray[i] = myArray[i];
        } //End for statement

        return clonedArray;

    }

    public String toString(T[] passedArray) {

        String toReturn = "[";

        for (int i = 0; i < passedArray.length; i++) {

            if (i == 0) {
                toReturn += passedArray[i] + ",";
            } //End if
            else if (i < passedArray.length - 1) {
                toReturn += " " + passedArray[i] + ",";
            } //End else if
            else if (i == passedArray.length - 1) {
                toReturn += " " + passedArray[i] + "]";
            } //End else if

        } //End for loop

        return toReturn;

    } //End toString

    @Override
    public String toString() {

        String toReturn = "[";

        for (int i = 0; i < myArray.length; i++) {

            if (i == 0) {
                toReturn += myArray[i] + ",";
            } //End if
            else if (i < myArray.length - 1) {
                toReturn += " " + myArray[i] + ",";
            } //End else if
            else if (i == myArray.length - 1) {
                toReturn += " " + myArray[i] + "]";
            } //End else if

        } //End for loop

        return toReturn;

    } //End toString

} //End class

import java.util.Arrays;

public class RemoveElement {
    //main method
    public static void main(String[] args) {
        //initializing the array
        int[] array = {15, 25, 34, 41, 56, 75, 22, 81, 99};
        System.out.println("Original Array : " + Arrays.toString(array));
        //Remove the fifth element (index-5,value-75)of the array
        int removeIndex = 5;
        //iterating through the array to remove the element
        for (int i = removeIndex; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        //we cannot alter the size of an array,after the removal, the last and second last element
        // in the array will exit twice
        System.out.println("After removing the second element: " + Arrays.toString(array));
    }
}

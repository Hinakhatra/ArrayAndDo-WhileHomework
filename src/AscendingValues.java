import java.util.Arrays;

public class AscendingValues {
    //main method
    public static void main(String[] args) {
        //initializing array of integer values
        int[]array = new int[]{5,47,84,21,75,12,102,38};
        //sort the array in ascending order using sort()method of the Arrays class
        Arrays.sort(array);
        System.out.println("Elements of array sorted in ascending order");
        // using the for loop
        for (int i = 0;i<array.length;i++)
        {
            //print the sorted array
            System.out.print(array[i]+" ,");
        }
    }
}

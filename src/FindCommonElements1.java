import java.util.Arrays;

public class FindCommonElements1 {
    //main method
    public static void main(String[] args) {
        //create Array 1
        String[] array1 = {"Apple", "Banana", "Pineapple", "Cherry", "Kiwi"};
        //create Array 2
        String[] array2 = {"Cherry", "Berry", "Mango", "Pineapple", "Strawberry", "Kiwi", "Pear", "Plum"};
        //print Array 1
        System.out.println("Array 1: " + Arrays.toString(array1));
        //print Array 2
        System.out.println("Array 2: " + Arrays.toString(array2));

        System.out.println("Common Elements: ");
        //for loop syntax
        for (int i = 0; i < array1.length; i++) {
            //nested for loop syntax
            for (int j = 0; j < array2.length; j++) {
                //if condition
                if (array1[i] == array2[j]) {
                    //print for common elements
                    System.out.print(array1[i] + " ,");
                }
            }
        }


    }
}

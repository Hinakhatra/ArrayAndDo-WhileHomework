import java.util.Arrays;

public class EqualityOf2Arrays {
    //Main method
    public static void main(String[] args) {
        //initializing the arrays to be compared
        int[] a = new int[]{20, 40, 60, 80, 100};
        int[] b = new int[]{20, 40, 60, 80, 100};

        // Arrays.equals(a, b) METHOD is used to check

        if (Arrays.equals(a,b)) //condition to check whether the result is true or false
        {  //if the two arrays have same length and contain the same elements in the same order
           // program will print Arrays are equal
            System.out.println("Arrays are equal");//print the result

        } else
        {  //if the arrays are not equal,the program will print Arrays are not equal
            System.out.println("Arrays are not equal");//print the result
        }
    }
}
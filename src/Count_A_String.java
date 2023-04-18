import java.util.Scanner;

public class Count_A_String {
    //main method
    public static void main(String[] args) {
        char searchChar = 'a';   //Declare and Initialize the variable
        int count = 0,i=0;           //Declare and Initialize the variable count to 0
        Scanner scanner =new Scanner(System.in); //create scanner object
        System.out.println("Please Enter a String to Count Character 'a' = ");//Taking user input
        String string = scanner.nextLine();  //create obj for string variable using scanner

        while ( i<string.length()) //while loop syntax
        {
            //if condition
            if (string.charAt(i) == searchChar) {
                count++;
            }
            i++;
        }
        //print total a in given string
        System.out.println("The total no of Character 'a' is: " +count);

    }

}

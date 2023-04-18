import java.util.Scanner;

public class MultiplicationTable {
    //main method
    public static void main(String[] args) {
        //create scanner object
        Scanner scanner =new Scanner(System.in);
        //Taking input from user
     System.out.println("Enter any number to print table for that number");
    int n = scanner.nextInt();  //create obj for n variable using scanner
    int i=1; //initialization
        //do while loop syntax
    do {
        //it will print the table for given num from 1 to 12 with format "nxi=(n*i)"
        System.out.println (n+" x "+i+" = "+(n*i));
        i++;
    }
    //A while loop is used to print the multiplication table for given num.
    // The loop will continue until the value of i reaches 12
    while (i<=12);
    }
    }


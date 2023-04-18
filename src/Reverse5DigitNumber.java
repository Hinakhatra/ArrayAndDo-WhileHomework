import java.util.Scanner;

public class Reverse5DigitNumber {
    //main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//create scanner class object
        //Array syntax
        int [] array = new  int[5];
       //Taking user input
        System.out.println("Enter 5-digit number the number that you want to reverse:");
        int num = scanner.nextInt();//declare num variable using scanner
        System.out.println("5-Digit Number: "+"\n"+num);//print user input
       //for loop syntax
        for (int i = 0; i < array.length;i++){
            array[i] = num%10;
            num=num/10;
        }
        System.out.println("Reversed number: ");
        for (int i = 0; i< array.length;i++){
            System.out.print(array[i]);  //print reverse number
        }

    }
}

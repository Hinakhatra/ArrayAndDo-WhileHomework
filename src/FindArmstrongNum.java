import java.util.Scanner;

public class FindArmstrongNum {
    //main method
    public static void main(String[] args) {
        int num,originalnum,remainder,result = 0, n = 0;
        //create scanner object
        Scanner scanner = new Scanner(System.in);
        //Take input from the user
        System.out.println("Enter the Number");
        //Create an instance of the Scanner class
        num = scanner.nextInt();
        originalnum = num;
        //counting the number of digits
        do {
            n++;
            num /= 10;
        }while (num!=0);
        num = originalnum;
        //calculating the result using do-while loop
        do {
            remainder = num % 10;
            result += Math.pow(remainder,n);//using In-Build Method
            num /= 10;
        }while (num != 0);
       //check if the result is equal to the original num
        if (result == originalnum){
            System.out.println(originalnum + "is an Armstrong number");
        }else
        System.out.println(originalnum + "is not an Armstrong number");

    }
}

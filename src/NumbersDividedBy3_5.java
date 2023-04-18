public class NumbersDividedBy3_5 {
    //main method
    public static void main(String[] args) {
        int[] num = new int[100];//Declare an array to store numbers from 1 to 100
        int index = 0; // Initialize the index variable to 0
        //for loop syntax
        for (int i = 1; i <= 100; i++) {
            num[index] = i;
            index++;

        }
        System.out.println("Numbers Divided by 3: ");
        index = 0; //Reset the index variable to 0
        do {
            if (num[index] % 3 == 0) {
                //print numbers from 1to 100 which is divided by 3
                System.out.print(num[index] + " ");
            }
            index++;
        } while (index < 100);
        System.out.println("\nNumbers Divided by 5: ");
        index = 0;//Reset the index variable to 0
        do {
            if (num[index] % 5 == 0) {
                //print numbers from 1to 100 which is divided by 5
                System.out.print(num[index] + " ");
            }
            index++;
        }while (index<100);
    }
}




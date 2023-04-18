public class Transpose_Matrix {
    //main method
    public static void main(String[] args) {
        //create 2-D array
        int[][]matrix = {{1,2,3},{4,5,6},{7,8,9}};
        //create variable  for rows and column using Array In build method
        int rows = matrix.length;
        int columns = matrix[0].length;
        //Assigning the value of rows and column
        int[][] transpose = new int[columns][rows];

        //Transpose logic using nested loops
        for (int i = 0; i<rows; i++) {
            for (int j = 0; j < columns; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        //print the original matrix
        System.out.println("Original Matrix: ");
        for (int i =0; i<rows;i++){
            for (int j= 0;j<columns;j++) {
                System.out.print(matrix[i][j] + " ");
            }

            System.out.println();
        }
        //print the Transposed matrix
        System.out.println("Transposed Matrix: ");
        for (int i = 0;i<columns; i++){
            for (int j = 0;j<rows;j++){
                System.out.print(transpose[i][j] +" ");
            }
            System.out.println();
        }


    }


}

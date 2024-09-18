import java.util.Scanner;  // Import the Scanner class

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
        System.out.println("Enter number: ");
        int number = scanner.nextInt();

        int factorial=1;

        for(int i=1;i<=number;i++) {

            factorial*=i;
        }
        System.out.println("factorial of number "+number+" is "+factorial);
        // Factorial of a number
            */
        //Addition of two matrices

        System.out.println("Enter the size of the matrix: ");
        int size = scanner.nextInt();
        System.out.println("Enter the elements of the 1st matrix: ");
        int[][] matrix1 = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix1[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Enter the elements of the 2nd matrix: ");
        int[][] matrix2 = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix2[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Addition of two matrices ");
            for (int i = 0; i < size; i++) {
                    for (int j = 0; j < size; j++) {
                        System.out.print(matrix1[i][j] + matrix2[i][j]+" ");
                    }
                    System.out.println("");
            }




    }
}
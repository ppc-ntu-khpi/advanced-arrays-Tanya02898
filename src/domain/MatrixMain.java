package domain;
import java.util.Scanner;
/**
 * Клас MatrixMain містить метод main для запуску програми.
 */
public class MatrixMain {
    /**
     * Головний метод програми. Запускається при старті програми.
     *
     * @param args Аргументи командного рядка (не використовуються в цій програмі).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть кількість рядків: ");
        int rows = scanner.nextInt();
        System.out.print("Введіть кількість стовпців: ");
        int cols = scanner.nextInt();
        int[][] matrix = MatrixCalculation.generateRandomMatrix(rows, cols);
        int sum = MatrixCalculation.calculateSum(matrix);
        MatrixOutput.printResult(matrix, sum);
    }
}
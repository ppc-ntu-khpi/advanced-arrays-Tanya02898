package domain;
import java.util.Random;
/**
 * Клас MatrixCalculation містить методи для обчислення суми елементів матриці та генерації випадкової матриці.
 */
public class MatrixCalculation {
    private MatrixCalculation() {}
    /**
     * Обчислює суму елементів матриці.
     *
     * @param matrix Матриця, суму елементів якої необхідно обчислити.
     * @return Сума елементів матриці.
     */
    public static int calculateSum(int[][] matrix) {
        int sum = 0;
        for (int[] row : matrix) {
            for (int el : row) {
                sum += el;
            }
        }
        return sum;
    }
    /**
     * Генерує випадкову матрицю з заданою кількістю рядків і стовпців.
     *
     * @param rows Кількість рядків матриці.
     * @param cols Кількість стовпців матриці.
     * @return Випадкова матриця з вказаною кількістю рядків і стовпців.
     */
    public static int[][] generateRandomMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        Random rand = new Random();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = rand.nextInt(30) + 1;
            }
        }
        return matrix;
    }
}
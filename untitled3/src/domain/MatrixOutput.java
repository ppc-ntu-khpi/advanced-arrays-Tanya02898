package domain;
/**
 * Клас MatrixOutput містить метод для виведення матриці та її суми на екран.
 */
public class MatrixOutput {
    private MatrixOutput() {}
    /**
     * Виводить матрицю та її суму на екран.
     *
     * @param matrix Матриця для виведення.
     * @param sum    Сума елементів матриці.
     */
    public static void printResult(int[][] matrix, int sum) {
        System.out.println("Матриця:");
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
        System.out.println("Сума елементів матриці: " + sum);
    }
}
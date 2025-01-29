public class main {

    public class RowColumnSum {
        public static void main(String[] args) {
            int[][] matrix = {
                    {1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9}
            };

            int rows = matrix.length;
            int cols = matrix[0].length;

            // Calculate row sums
            System.out.println("Row sums:");
            for (int i = 0; i < rows; i++) {
                int rowSum = 0;
                for (int j = 0; j < cols; j++) {
                    rowSum += matrix[i][j];
                }
                System.out.println("Row " + (i + 1) + ": " + rowSum);
            }

            // Calculate column sums
            System.out.println("\nColumn sums:");
            for (int j = 0; j < cols; j++) {
                int colSum = 0;
                for (int i = 0; i < rows; i++) {
                    colSum += matrix[i][j];
                }
                System.out.println("Column " + (j + 1) + ": " + colSum);
            }
        }
    }








}

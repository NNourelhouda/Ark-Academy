package org.arkAcademy.week2.Day9;

public class Ch7 {
        public static void printMatrix(int[][] matrix) {
            for (int[] row : matrix) {
                for (int element : row) {
                    System.out.print(element + " ");
                }
                System.out.println();
            }
        }

        public static int calculateMatrixSum(int[][] matrix) {
            int sum = 0;
            for (int[] row : matrix) {
                for (int element : row) {
                    sum += element;
                }
            }
            return sum;
        }

        public static int[][] transposeMatrix(int[][] matrix) {
            int rows = matrix.length;
            int cols = matrix[0].length;
            int[][] transposedMatrix = new int[cols][rows];

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    transposedMatrix[j][i] = matrix[i][j];
                }
            }

            return transposedMatrix;
        }

        public static void main(String[] args) {
            int[][] matrix = {
                    {1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9}
            };

            System.out.println("Original Matrix:");
            printMatrix(matrix);

            int sum = calculateMatrixSum(matrix);
            System.out.println("Sum of all elements in the matrix: " + sum);

            int[][] transposedMatrix = transposeMatrix(matrix);
            System.out.println("Transposed Matrix:");
            printMatrix(transposedMatrix);
        }
    }


void main() {
//    int[][] matrix = new int[3][4];
//    printMatrix(matrix);
//    int[][] matrix2 = {
//            {1, 2, 3, 4},
//            {5, 6, 7, 8},
//            {9, 10, 11, 12}
//    };
//    printMatrix(matrix2);
    Matrix m1 = new Matrix(2, 3);
    System.out.println("Матрица по умолчанию");
    System.out.println(m1);

    int[][] matrix2 = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
    };
    Matrix m2 = new Matrix(matrix2);
    System.out.println("Матрица по массиву");
    System.out.println(m2);

    m1.fillRandom(-10, 10);
    System.out.println("Матрица случайная");
    System.out.println(m1);
    Matrix m3 = new Matrix(2, 3);
    m3.fillRandom(-10, 10);
    System.out.println("Матрица случайная вторая");
    System.out.println(m3);

    Matrix sum = m1.add(m3);
    System.out.println("Сумма матриц");
    System.out.println(sum);

    Matrix errorSum = m1.add(m2);
    System.out.println("Ошибка суммы матриц");
    System.out.println(errorSum);

    Matrix sumWithNumber = m1.add(10);
    System.out.println("\nСумма матрицы и числа");
    System.out.println(sumWithNumber);

    Matrix identity = Matrix.identity(5);
    System.out.println("Единичная матрица");
    System.out.println(identity);

    int[] row = m1.getRow(0);
    System.out.println("Строка матрицы");
    System.out.println(Arrays.toString(row));

    IntArray row1 = new IntArray(row);
    System.out.println("Строка матрицы через IntArray");
    System.out.println(row1);
}
void printMatrix(int[][] matrix){
    for (int i = 0; i < matrix.length; i++){
        for (int j = 0; j < matrix[i].length; j++){
            System.out.print(matrix[i][j] + " ");
        }
        System.out.println();
    }
}
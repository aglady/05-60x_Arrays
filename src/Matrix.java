import java.util.Random;

public class Matrix {
    private int[][] data;
    private int rows;
    private int cols;
    private static Random r = new Random(0);

    public Matrix(int rows, int cols){
        this.rows = rows;
        this.cols = cols;
        data = new int[rows][cols];
    }

    public Matrix(int[][] data){
        rows = data.length;
        cols = data[0].length;
        this.data = new int[rows][cols];
//        this(data.length, data[0].length);
        for (int i = 0; i < rows; i++){
            for (int j = 0; j <cols; j++){
                this.data[i][j] = data[i][j];
            }
        }
    }

    public Matrix(Matrix other){
        this(other.data);
    }

    public int get(int row, int col){
        return data[row][col];
    }

    public void set(int row, int col, int value){
        data[row][col] = value;
    }

    public int getRows(){
        return rows;
    }

    public int getCols(){
        return cols;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                sb.append(String.format("%4d", data[i][j]));
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public void fillRandom(int left, int right){
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                data[i][j] = r.nextInt(left, right + 1);
            }
        }
    }

    public Matrix add(Matrix other){
        if (rows != other.rows || cols != other.cols){
            return null;
        }
        Matrix result = new Matrix(rows, cols);
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                result.data[i][j] = data[i][j] + other.data[i][j];
            }
        }
        return result;
    }

    public Matrix add(int value){
        Matrix result = new Matrix(rows, cols);
        for (int i = 0; i <rows; i++){
            for (int j = 0; j < cols; j++){
                result.data[i][j] = data[i][j] + value;
            }
        }
        return result;
    }

    public static Matrix identity(int size){
        Matrix result = new Matrix(size, size);
        for (int i = 0; i < size; i++){
            result.data[i][i] = 1;
        }
        return result;
    }

    public int[] getRow(int row){
        int[] result = new int[cols];
        for (int j = 0; j < cols; j++){
            result[j] = data[row][j];
        }
        return result;
    }
}

import java.util.Arrays;
import java.util.Random;

public class IntArray {
    private int[] array;

    public int get(int index){
        return array[index];
    }

    public void set(int index, int value){
        array[index] = value;
    }

    public IntArray(int size){
        array = new int[size];
        fillRandom();
    }

    public IntArray(IntArray intArray){
        this.array = Arrays.copyOf(intArray.array, intArray.array.length);
    }

    private void fillRandom(){
        Random r = new Random(0);
        for (int i = 0; i < array.length; i++){
            array[i] = r.nextInt(-10, 11);
        }
    }

    public String toString() {
        //return  Arrays.toString(array);
        StringBuilder sb = new StringBuilder("[" + array[0]);
        for (int i = 1; i < array.length; i++){
            sb.append(", " + array[i]);
        }
        sb.append("]");
        return sb.toString();
    }

    public int length(){
        return array.length;
    }

    public void print() {
        for (int x : array) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}

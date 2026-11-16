public class Sorts {
    private static long comparisons = 0;
    private static long swaps = 0;

    public static void resetStats(){
        comparisons = 0;
        swaps = 0;
    }

    public static void printStats(){
        System.out.println(
                "Сравнений: " + comparisons
                + ", перестановок: " + swaps);
    }

    public static int[] sorted(int... values){
        int[] result = new int[values.length];
        for (int i = 0; i < result.length; i++){
            result[i] = values[i];
        }
        sort(result);
        return result;
    }

    public static void sort(int[] array, int low, int high){
        if (array == null || high - low < 1) return;
        quickSort3Way(array, low, high);
    }

    public static void sort(int[] array){
        sort(array, 0, array.length - 1);
    }

    private static void quickSort3Way(int[] array, int low, int high) {
        if (low >= high) return;

        int pivot = array[low + (int) (Math.random() * (high - low + 1))];
        int lt = low;
        int gt = high;
        int i = low;

        while (i <= gt) {
            comparisons++;
            if (array[i] < pivot) {
                swap(array, i, lt);
                i++;
                lt++;
            } else {
                comparisons++;
                if (array[i] > pivot) {
                    swap(array, i, gt);
                    gt--;
                } else {
                    i++;
                }
            }
        }
        quickSort3Way(array, low, lt - 1);
        quickSort3Way(array, gt + 1, high);
    }

    private static void swap(int[] array, int i, int j){
        swaps++;
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void sort(double[] array){
        if (array == null || array.length < 2) return;
        quickSort3Way(array, 0, array.length - 1);
    }

    private static void quickSort3Way(double[] array, int low, int high) {
        if (low >= high) return;

        double pivot = array[low + (int) (Math.random() * (high - low + 1))];
        int lt = low;
        int gt = high;
        int i = low;

        while (i <= gt) {
            comparisons++;
            if (array[i] < pivot) {
                swap(array, i, lt);
                i++;
                lt++;
            } else{
                comparisons++;
                if (array[i] > pivot) {
                    swap(array, i, gt);
                    gt--;
                } else {
                    i++;
                }
            }
        }
        quickSort3Way(array, low, lt - 1);
        quickSort3Way(array, gt + 1, high);
    }

    private static void swap(double[] array, int i, int j){
        swaps++;
        double temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}

public class SortedIntArray {
    private IntArray array;

    public SortedIntArray(IntArray array){
        this.array = array;
        sort();
    }

    private void sort(){
        if (array == null || array.length() < 2) return;
        quickSort3Way(0, array.length() - 1);
    }

    private void quickSort3Way(int low, int high) {
        if (low >= high) return;

        int pivot = array.get(low + (int) (Math.random() * (high - low + 1)));
        int lt = low;
        int gt = high;
        int i = low;

        while (i <= gt) {
            if (array.get(i) < pivot) {
                swap(i, lt);
                i++;
                lt++;
            } else if (array.get(i) > pivot) {
                swap(i, gt);
                gt--;
            } else {
                i++;
            }
        }
        quickSort3Way(low, lt - 1);
        quickSort3Way(gt + 1, high);
    }

    private void swap(int i, int j){
        int temp = array.get(i);
        array.set(i, array.get(j));
        array.set(j, temp);
    }


    public String toString() {
        return array.toString();
    }
}

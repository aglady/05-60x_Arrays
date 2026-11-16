void main() {
    int size = 10;
    IntArray array = new IntArray(size);
    System.out.println(array);
    SortedIntArray sortedArray = new SortedIntArray(array);
    System.out.println(sortedArray);
    System.out.println(array);
    sortedArray.set(0, 100);
    System.out.println(sortedArray);

    System.out.println("\nПоиск элемента");
    System.out.println("indexOf(5) в IntArray: " + array.indexOf(5));
    System.out.println("indexOf(5) в SortedIntArray: " + sortedArray.indexOf(5));
    System.out.println("indexOf(1000) в SortedIntArray: " + sortedArray.indexOf(1000));

    System.out.println("\nСортировка обычного целочисленного массива");
    int[] array1 = {5, 2, 8, 1, 9, 3};
    System.out.println(Arrays.toString(array1));
    Sorts.resetStats();
    Sorts.sort(array1);
    System.out.println(Arrays.toString(array1));
    Sorts.printStats();

    System.out.println("\nСортировка обычного вещественного массива");
    double[] array2 = {3.14, 2.71, 1.41, 1.73};
    System.out.println(Arrays.toString(array2));
    Sorts.resetStats();
    Sorts.sort(array2);
    System.out.println(Arrays.toString(array2));
    Sorts.printStats();

    System.out.println("\nСортировка части массива");
    int[] array3 = {5, 2, 8, 1, 9, 3};
    System.out.println(Arrays.toString(array3));
    Sorts.resetStats();
    Sorts.sort(array3, 1, 4);
    System.out.println(Arrays.toString(array3));
    Sorts.printStats();

    System.out.println("\n=== Varargs ===");
    int[] sorted1 = Sorts.sorted(5, 2, 8, 1, 9, 3);
    System.out.println("sorted(5, 2, 8, 1, 9, 3): "
                        + Arrays.toString(sorted1));
    int[] sorted2 = Sorts.sorted(3, 1);
    System.out.println("sorted(3, 1): "
                        + Arrays.toString(sorted2));
    int[] sorted3 = Sorts.sorted();
    System.out.println("sorted(): "
                        + Arrays.toString(sorted3));
}
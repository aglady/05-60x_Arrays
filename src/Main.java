void main() {
    int size = 10;
    IntArray array = new IntArray(size);
    System.out.println(array);
    SortedIntArray sortedArray = new SortedIntArray(array);
    System.out.println(sortedArray);
    System.out.println(array);
    sortedArray.set(0, 100);
    System.out.println(sortedArray);
}
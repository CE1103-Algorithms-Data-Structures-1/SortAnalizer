package sort.algorithms;

public class SelectionSort {

    public void sort(int[] array) {
        int numOfAccess = 0;
        int minIndex;
        for (int i = 0; i < array.length; i++) {
            minIndex = i;
            for (int j = i+1; j <array.length; j++) {
                if (array[j] < array[minIndex])
                    minIndex = j;
            }
            numOfAccess += 3;
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;

            System.out.print("Paso " + (i+1) + ":   ");
            for (int k=0; k < array.length; k++) {
                System.out.print(array[k] + "   ");
            }
            System.out.println("");
        }
        System.out.println("Number of swaps : " +numOfAccess);
    }

    public static void main(String[] args) {
        SelectionSort test = new SelectionSort();
        int[] array = {6,409,342,653,8694,3143,7345,4};
        test.sort(array);
    }
}

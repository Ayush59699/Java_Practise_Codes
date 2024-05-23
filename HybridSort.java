public class HybridSort {
    
    private static final int THRESHOLD = 10; // Threshold for switching to Merge Sort

    public static void main(String[] args) {
        int[] array = {38, 27, 43, 3, 9, 82, 10};
        
        System.out.println("Original Array:");
        printArray(array);
        
        hybridSort(array, 0, array.length - 1);
        
        System.out.println("Sorted Array:");
        printArray(array);
    }

    public static void hybridSort(int[] array, int left, int right) {
        if (left < right) {
            if (right - left < THRESHOLD) {
                // If the size of the partition is below the threshold, use Merge Sort
                mergeSort(array, left, right);
            } else {
                // Otherwise, use Quick Sort
                int pivotIndex = partition(array, left, right);
                hybridSort(array, left, pivotIndex - 1);
                hybridSort(array, pivotIndex + 1, right);
            }
        }
    }

    private static int partition(int[] array, int left, int right) {
        int pivot = array[right];
        int i = left - 1;

        for (int j = left; j < right; j++) {
            if (array[j] < pivot) {
                i++;
                swap(array, i, j);
            }
        }
        swap(array, i + 1, right);
        return i + 1;
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private static void mergeSort(int[] array, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;

            mergeSort(array, left, middle);
            mergeSort(array, middle + 1, right);

            merge(array, left, middle, right);
        }
    }

    private static void merge(int[] array, int left, int middle, int right) {
        int n1 = middle - left + 1;
        int n2 = right - middle;

        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        System.arraycopy(array, left, leftArray, 0, n1);
        System.arraycopy(array, middle + 1, rightArray, 0, n2);

        int i = 0, j = 0;
        int k = left;
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                array[k] = leftArray[i];
                i++;
            } else {
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            array[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < n2) {
            array[k] = rightArray[j];
            j++;
            k++;
        }
    }

    private static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}


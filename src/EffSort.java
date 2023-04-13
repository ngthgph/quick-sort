public class EffSort {
    int[] a;
    int n;

    EffSort() {}
    EffSort(int[] b) {
        n = b.length;
        a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = b[i];
    }

    void display() {
        for(int j : a)
            System.out.print(" " + j);
        System.out.println();
    }

    void swap(int[] a, int i, int k) {
        int temp = a[i];
        a[i] = a[k];
        a[k] = temp;
    }

    int partition(int low, int up) {
        int i = low;
        for(int j = low; j < up; j++)
            if(a[j] <= a[up])
                swap(a, i++, j);
        swap(a, i, up);
        return i;
    }

    void quickSort(int low, int up) {
        if(low < up) {
            int pivot = partition(low, up);
            quickSort(low, pivot - 1);
            quickSort(pivot + 1, up);
        }
    }

    void quickSort() {
        quickSort(0, n-1);
    }
}

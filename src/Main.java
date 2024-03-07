import java.util.Random;

public class Main {
    public static void main(String[] args) {
    //Реализовать пузырьковую сортировку отдельным методом - 1
        //Реализовать сортировку вставками отдельным методом - 2
        //*Реализовать быструю сортировку из учебника отдельным методом - 3*
        //Написать метод по заполнению массива с заданным кол-вом элементов - 4
        //Реализовать возможность отследить время работы метода - 5
        //Засечь время каждой сортировки для 100 1000 и 10000 эл-тов массива - 6
        //*Построить сравнительный график (как видит автор) - 7*
        int[] a;
        int n = 5;
        a = new int [n];
        }

    public static void bubbleSort(int[] a)
    {
        for (int i = a.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (a[j] > a[j + 1]) {
                    int q = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = q;
                }
            }
        }
    }
    // 1
    public static void insertionSort(int[] a)
    {
        for (int i = 1; i < a.length; i++) {
            int currElem = a[i];
            int prevKey = i - 1;
            while (prevKey >= 0 && a[prevKey] > currElem) {
                a[prevKey + 1] = a[prevKey];
                prevKey--;
            }
            a[prevKey+1] = currElem;
        }
    }
    //2
    public static void quickSort(int[] a, int low, int high)
    {
        if (a.length == 0) return;
        if (low >= high) return;
        int middle = low + (high - low) / 2;
        int op = a[middle];
        int i = low, j = high;
        while (i <= j) {
            while (a[i] < op) {
                i++;
            }
            while (a[j] > op) {
                j--;
            }                if (i <= j) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
                j--;
            }
        }
        if (low < j) quickSort(a, low, j);
        if (high > i) quickSort(a, i, high);
    }
    //3
    public static void rend(int[] a, int n)
    {
        a = new int [n];
        for (int i = 0; i < a.length; i++) {
            Random rnd = new Random();
            int number = rnd.nextInt(1000);
        }
    }


}

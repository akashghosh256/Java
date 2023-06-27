import java.util.*;

class Heap_Sort{
static void Heapify(int[] arr, int n , int index) {

    int right = 2 * index + 2;
    int left = 2 * index + 1;
    int largestNode = index  ;
  

    if (left < n  && arr[left] > arr[largestNode]) {
        largestNode = left ;
    }

    if (right < n && arr[right] > arr[largestNode]) {
        largestNode = right  ;
    }
    int temp;
    if (largestNode != index) {
        temp=arr[index];
        arr[index]=arr[largestNode];
        arr[largestNode]=temp;
        Heapify(arr, n, largestNode)  ;
    }
}
static void createHeap(int[] arr, int n) {

    int start = (n / 2) - 1 ;

    for (int index = start ; index >= 0; index--) {
        Heapify(arr, n, index)  ;
    }
}
static void printHeap(int[] arr, int n) {

    for (int i = 0; i < n; i++) {
        System.out.print(arr[i]+" ")  ;
    }
    System.out.println();
}
public static void main(String args[]) {

    int arr[] = {1, 3, 5, 4, 6, 13, 10, 9, 8, 15, 17} ;

    int n = arr.length   ;

    createHeap(arr, n)  ;
    System.out.println("Heap in form of Array:-")  ;
    printHeap(arr, n)  ;
}
}
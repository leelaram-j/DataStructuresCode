package arrays;

public class ElementFindSortedArrayBinarySearch {
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50,60,70,80,90,100,110};
        int position = binarySearch(111,arr,0,arr.length-1);
        System.out.println(position);
    }
    public static int binarySearch(int number,int arr[],int start,int end) {
        int mid =0;
        if(start > end) {
            return -1;
        }
        mid = (start + end) /2;
        if(arr[mid] > number) {
            return binarySearch(number, arr, start, mid-1);
        }
        else if(arr[mid] < number) {
            return binarySearch(number, arr, mid+1, end);
        }
        else if(arr[mid] == number)
            return mid;
        return mid;
    }
}

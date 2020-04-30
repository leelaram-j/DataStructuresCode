package arrays;

public class SingleDimensionalArray {
    int arr[] = null;

    public SingleDimensionalArray(int sizeOfArray) {
        arr = new int[sizeOfArray];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.MIN_VALUE;
        }
    }
    public void traverseArray() {
        try {
            for(int i=0;i<arr.length;i++) {
                System.out.print(arr[i] + " ");
            }
        } catch(Exception e ) {
            System.out.println("Array no longer exists");
        }
    }

    public void insert(int location, int valueToBeInserted) {
        try {
            if(arr[location] == Integer.MIN_VALUE) {
                arr[location] = valueToBeInserted;
                System.out.println(("Successfully inserted "+ valueToBeInserted + " at location: "+location));
            } else {
                System.out.println("this cell is already occupied by another value");
            }
        } catch(Exception e) {
            System.out.println("Exception is "+ e);
        }
    }

    public void accessingCell(int cellNumber) {
        try {
            System.out.println(arr[cellNumber]);
        } catch(Exception e) {
            System.out.println("Exception is "+e);
        }
    }

    public void searchArray(int valueToSearch) {
        for(int i= 0;i<arr.length;i++) {
            if(arr[i] == valueToSearch) {
                System.out.println("Value found");
                System.out.println("index of " + valueToSearch + " is " + i);
                return;
            }
        }
        System.out.println(valueToSearch + " is not found");
    }

    public void sdeleteValueFromArray(int arrayLocation) {
        try {
            arr[arrayLocation] = Integer.MIN_VALUE;
        } catch (Exception e) {
            System.out.println("Exception while deleting value: " + e);
        }
    }
}

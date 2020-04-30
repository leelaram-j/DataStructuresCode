package arrays;

public class SingleDimensionalArrayMain {
    public static void main(String[] args) {
        SingleDimensionalArray sd = new SingleDimensionalArray(10);
        sd.traverseArray();
        sd.insert(0,24);
        sd.insert(1,25);
        sd.insert(2,25);
        sd.insert(3,26);
        sd.insert(4,27);
        sd.insert(5,28);
        sd.insert(6,29);
        sd.insert(7,30);
        sd.insert(8,21);
        sd.insert(9,32);
        sd.insert(1,33);
        sd.insert(12,34);
        sd.traverseArray();
        sd.accessingCell(9);
        sd.accessingCell(12);
        sd.searchArray(32);
        sd.searchArray(45);
        System.out.println("Before deleting");
        sd.traverseArray();
        sd.sdeleteValueFromArray(4);
        System.out.println("After deleting");
        sd.traverseArray();



    }
}

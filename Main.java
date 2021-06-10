import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the size of the binary search tree: ");
        int size = scan.nextInt();
        BST bst = new BST();

        for(int i=0; i<size; i++){
            int val = scan.nextInt();
            bst.addNode(val);
        }
        System.out.println("Sum of last level is " + bst.deepestLeavesSum(bst.getRoot()));
    }


}



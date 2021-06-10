public class TreeNode {
    int val; //fields of tree node
    TreeNode left;
    TreeNode right;

    TreeNode() {} //constructor

    TreeNode(int val) { this.val = val; } //constructor

    TreeNode(int val, TreeNode left, TreeNode right) { //constructor
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
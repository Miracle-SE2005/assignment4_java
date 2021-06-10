import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BST {
    private TreeNode root; //field of bst

    BST(){ //constructor of bst
        this.root = null;
    }

    public void addNode(int val){
        TreeNode next = new TreeNode(val); //new node to add
        TreeNode current = this.root; //current node
        TreeNode previous = null; //previous node

        if(this.root == null){ //if root is null, then there is no any node. So root will be new node
            this.root = next;
            return;
        }

        while (current != null){ //traverse through bst
            previous = current;
            if(val > current.val){ //if new node val is greater than current node, then go to right subtree
                current = current.right;
            } else if (val<current.val) { //if less then go to left subtree
                current = current.left;
            }
        }

        if(val> previous.val){ //if val is greater than prev node val, then add as right child
            previous.right = next;
        } else { //if less then as left child
            previous.left = next;
        }
    }

    public int deepestLeavesSum(TreeNode root) {//we will use bfs traversal method.
        int res = 0; //variable for storing result
        Queue<TreeNode> treeNodeQueue = new LinkedList(); //queue
        treeNodeQueue.add(root);//add to queue root node

        while(!treeNodeQueue.isEmpty()){ //calculate sum for each level
            res = 0; //for this purpose reset res at each new level of bst
            int start = treeNodeQueue.size()-1; //start index
            for(int i=start; i>=0; i--){//iterate through
                TreeNode current = treeNodeQueue.poll();//current node
                TreeNode left = current.left; //left child
                TreeNode right = current.right; //right child
                res+=current.val;//add current node to our res

                if(left != null) treeNodeQueue.add(left); //if there is a left child, then add it to queue
                if(right != null) treeNodeQueue.add(right); //if there is a right child, then add it to queue
            }

        }

        return res;//return our res for last level
    }

    public TreeNode getRoot() { //getter because root is private
        return root;
    }

}

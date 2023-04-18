import java.util.*;
public class BinaryTree_Code{
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }

    }

    // calculate the height of the tree

    public static int height(Node root){
        if(root == null){
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh,rh)+1;
    }

    // calculate the number of nodes
    public static int count(Node root){
        if(root == null){
            return 0;
        }
        int lcount = count(root.left);
        int rcount = count(root.right);
        return lcount+rcount+1;
    }

    // calculate the sum of all nodes in a tree
    public static int sum(Node root){
        if(root == null){
            return 0;
        }
        int leftsum = sum(root.left);
        int rightsum = sum(root.right);
        int treesum = leftsum+rightsum+root.data;

        return treesum;
    }

    // diameter of a tree 

    public static int diameter(Node root){
        if(root == null){
            return 0;
        }
        int leftheight = height(root.left);
        int rightheight = height(root.right);
        int leftdiam = diameter(root.left);
        int rightdiam = diameter(root.right);

        int selfdiam = leftheight+rightheight+1;

        return Math.max(selfdiam, Math.max(leftdiam,rightdiam));
    }

    // subtree of a tree
    public static boolean isIdentical(Node node, Node subroot){
        if(node == null && subroot == null){
            return true;
        }
        else if(node == null || subroot == null || node.data != subroot.data){
            return false;
        }
        if(!isIdentical(node.left,subroot.left)){
            return false;
        }
        if(!isIdentical(node.right,subroot.right)){
            return false;
        }
        return true;
    }
    public static boolean isSubtree(Node root, Node subroot){
        if(root == null){
            return false;
        }
        if(root.data == subroot.data){
            if(isIdentical(root,subroot)){
                return true;
            }
        }
        return isSubtree(root.left,subroot) || isSubtree(root.right,subroot);
    }

    // Kth level of a tree code
    public static void Klevel(Node root,int level,int K){
        if(root == null){
            return;
        }
        if(level == K){
            System.out.print(root.data + " ");
            return;
        }
        Klevel(root.left,level+1,K);
        Klevel(root.right,level+1,K);
    }

    public static void main(String args[]){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        // Node subroot = new Node(2);
        // subroot.left = new Node(4);
        // subroot.right = new Node(5);

        // System.out.println(isSubtree(root,subroot));
        Klevel(root,1,3);
    }
}
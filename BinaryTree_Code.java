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

    // Lowest common ancestor
    public static Node LCA(Node root,int n1, int n2){
        if(root == null || root.data == n1 || root.data == n2){
            return root;
        }

        Node leftLCA = LCA(root.left,n1,n2);
        Node rightLCA = LCA(root.right,n1,n2);

        if(rightLCA== null){
            return leftLCA;
        }
        if(leftLCA == null){
            return rightLCA;
        }
        // if leftLCA & rightLC != null --> return root
        return root;
    }

    // Kth ancestor of a node
    public static int Kancestor(Node root, int k, int n){
        if(root == null){
            return -1;
        }
        if(root.data == n){
            return 0;
        }
        int left = Kancestor(root.left,k,n);
        int right = Kancestor(root.right,k,n);

        if(left == -1 && right ==-1){
            return -1;
        }

        int ans = Math.max(left,right);
        if(ans+1 == k){
            return root.data;
        }
        

        return ans;


    } 

    // Transform to sum tree
    public static int sumtree(Node root){
        if(root == null){
            return 0;
        }
        int leftsum = sumtree(root.left);
        int rightsum = sumtree(root.right);

        int data = root.data;

        int newleft = root.left == null ? 0:root.left.data;
        int newright = root.right == null ? 0:root.right.data;

        root.data = newleft+leftsum+newright+rightsum;

        return data;
    }
    public static void preorder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data+ " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String args[]){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        sumtree(root);
        preorder(root);

        // Node subroot = new Node(2);
        // subroot.left = new Node(4);
        // subroot.right = new Node(5);

        // System.out.println(isSubtree(root,subroot));
        // Klevel(root,1,3);
    }
}
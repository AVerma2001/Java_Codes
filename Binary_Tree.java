import java.util.*;
public class Binary_Tree{
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class BinaryTree{
        static int idx = -1;
        public static Node buildTree(int nodes[]){ // this functions returns the root node of the tree
            idx++;
            if(nodes[idx] == -1){
                return null; // null node does not has any left or right

            }
            // else create a new node
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;

            
            

        }
        // preorder traversal
        public static void preorder(Node root){
            if(root == null){
                //System.out.print("-1"+" ");
                return;
            }
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
        }

        // inorder traversal
        public static void inorder(Node root){
            if(root == null){
                //System.out.print("-1"+" ");
                return;
            }
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }

        // postorder traversal
        public static void postorder(Node root){
            if(root == null){
                //System.out.print("-1"+" ");
                return;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data+" ");
        }
    }
    public static void main(String args[]){
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

        // creating the binary tree
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        // System.out.println("root is:"+ root.data);
        tree.postorder(root);
    }
}
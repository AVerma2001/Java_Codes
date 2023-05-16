import java.util.*;
public class BST{
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
    public static Node insert(Node root, int val){
        if(root == null){ // if root is null add new node with value
            root = new Node(val);
            return root;
        }
        if(root.data>val){
            // left subtree
            root.left = insert(root.left,val);
        }
        else{
            // right subtree
            root.right = insert(root.right,val);
        }
        return root;

    }
    public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);

    }

    // Search in BST
    public static boolean search(Node root, int key){ // O(H)
        if(root == null){
            return false;
        }
        if(root.data == key){
            return true;
        }
        if(root.data<key){
            return search(root.right,key);
        }
        else{
            return search(root.left,key);
        }
    }

    // deleting a node in the BST
    public static Node delete(Node root,int val){
        if(root.data>val){
            root.left = delete(root.left,val);
        }
        else if(root.data<val){
            root.right = delete(root.right,val);
        }
        else{

            // root data == val
            //case 1 - leaf node
            if(root.left == null && root.right == null){
                return null;
            }
            // single child
            if(root.left == null){
                return root.right;
            }
            else if(root.right == null){
                return root.left;
            }
            // both child- return inorder succesor
            Node IS = findinorderpred(root.left);
            root.data = IS.data;
            delete(root.left,IS.data);

        }
        return root;
    }
    // Inorder sucessor
    public static Node findinordersucc(Node root){
        while(root.left != null){
            root = root.left;
        }
        return root;
    }
    // inorder predeccesor
    public static Node findinorderpred(Node root){
        while(root.right != null){
            root = root.right;
        }
        return root;
    }
    // print path from root to leaf node
    // function to print arraylist
    public static void printPath(ArrayList<Integer> path){
        for(int i=0;i<path.size();i++){
            System.out.print(path.get(i)+"->");
        }
        System.out.println("N"); // null
    }
    public static void root2leaf(Node root,ArrayList<Integer> path){
        if(root == null){
            return;
        }
        path.add(root.data);
        if(root.left == null && root.right == null){
            printPath(path);
        }
        root2leaf(root.left,path);
        root2leaf(root.right,path);
        path.remove(path.size()-1);
    } 

    // Validate BST --- BST is right or not
    public static boolean isValid(Node root, Node min, Node max){
        if(root == null){
            return true; // BST with no root is valid
        }
        if(min != null && root.data<=min.data){
            return false;
        }
        else if(max != null && root.data>=max.data){
            return false;
        }
        return isValid(root.left,min,root) && isValid(root.right,root,max);
    }

    // Mirror a BST
    public static Node mirrorBST(Node root){ // O(n)
        if(root == null){
            return null;
        }
         // calling mirror for left subtree and right subtree recursively
        Node leftMirror = mirrorBST(root.left);
        Node rightMirror = mirrorBST(root.right);

        // swapping the subtrees
        root.left = rightMirror;
        root.right = leftMirror;

        return root;

    }

    // preorder traversal
    public static void preorder(Node root){
        if(root == null){
            return ;
        }
        System.out.print(root.data+ " ");
        preorder(root.left);
        preorder(root.right);
    }

    // building balanced BST from sorteed array
    public static Node createBST(int arr[],int start,int end){
        int mid = (start+end)/2;
        Node root = new Node(arr[mid]);
        if(start>end){
            return null;
        }
        root.left = createBST(arr,start,mid-1);
        root.right = createBST(arr,mid+1,end);

        return root;

    }


    public static void main(String args[]){
        // int values[] = {8,5,20,1,4,6,10,11,14};

        int arr[] = {3,5,6,8,10,11,12};

        // Node root = new Node(8);
        // root.left = new Node(5);
        // root.right = new Node(10);
        // root.left.left = new Node(3);
        // root.left.right = new Node(6);
        // root.right.right = new Node(11);

        // root = mirrorBST(root);

        Node root = createBST(arr,0,arr.length-1);
        preorder(root);
        
        // ArrayList<Integer> path = new ArrayList<>();
        // inserting values in the function from values
        // for(int i=0;i<values.length;i++){
        //     root = insert(root,values[i]);
        // }
        // inorder(root);
        // System.out.println();

        // if(isValid(root,null,null)){
        //     System.out.println("valid");
        // }
        // else{
        //     System.out.println("not valid");
        // }

        // System.out.println(search(root,8));
        // root = delete(root,1);
        // System.out.println();
        // inorder(root);

        // root2leaf(root,path);

    }

}
public class BST {
    
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
        }
    }

    public static Node insert(Node root,int val){
        if(root == null){
            root = new Node(val);
            return root;
        }


        if(root.data > val){
            root.left =  insert(root.left , val);
        }else{
            root.right = insert(root.right, val);
        }

        return root;


    }

    public static boolean Search(Node root,int key){
        if(root == null){
            return false;
        }

        if(root.data == key){
            return true;
        }

        if(root.data > key){
            return Search(root.left ,key) ;
        }else{
            return Search(root.right , key);
        }
    }


    public static void inorder(Node root){
        if(root == null){
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static Node delete(Node root,int value){
        if(root.data < value){
            root.right = delete(root.right, value);
        }
        else if(root.data > value){
            root.left = delete(root.left ,value);
        }
        else{
            //case 1 - leaf Node
            if(root.left==null && root.right==null){
                return null;
            }

            //case 2 - single Child
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }


            //case 3 - both child

            Node IS = findInorderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
            
        }
        return root;
    }


    public static Node findInorderSuccessor(Node root){
        while (root.left != null) {
            root = root.left;

        }

        return root;
    }

    public static void main(String[] args) {
        int value[] = {8,5,3,1,4,6,10,11,14};
        Node root = null;

        for(int i=0;i<value.length;i++){
            root = insert(root,value[i]);
        }

        inorder(root);

        // System.out.println(Search(root, 2));

        System.out.println();


        root = delete(root, 10);
        inorder(root);
        

    }
}
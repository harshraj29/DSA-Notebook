import java.sql.Array;
import java.util.ArrayList;

import org.w3c.dom.Node;

public class lca {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        static int idx = -1;

        public static Node buildTree(int nodes[]) {
            idx++;
            if (idx >= nodes.length || nodes[idx] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }


        public static boolean getPath(Node root,int n ,ArrayList<Node> path){
            if(root==null)return false;

            path.add(root);

            if(root.data == n){
                return true;
            }

            boolean foundLeft = getPath(root.left, n, path);
            boolean foundRight = getPath(root.right, n, path);

            if(foundLeft || foundRight){
                return true;
            }

            path.remove(path.size() - 1);
            return false;
        }



      public static Node lca(Node root,int n1,int n2){
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();

        getPath(root, n1 , path1);
        getPath(root, n2 , path2);

        int i =0;
        for(;i<path1.size() && i<path2.size();i++){
            if(path1.get(i) != path2.get(i)){
                break;
                }
        }

        Node lca = path1.get(i - 1);
        return lca;
      }
    }



    public static void main(String[] args) {
         int Nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(Nodes);

    }
}

import java.util.*;

public interface Subtree {

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

        public boolean isIdentical(Node root, Node subRoot) {
            if (root == null && subRoot == null) {
                return true;
            } else if (root == null || subRoot == null || root.data != subRoot.data) {
                return false;
            }

            if (!isIdentical(root.left, subRoot.left)) {
                return false;
            }
            if (!isIdentical(root.right, subRoot.right)) {
                return false;
            }

            return true;
        }

        public boolean isSubtree(Node root, Node subRoot) {
            if (root == null) {
                return false;
            }

            if (isIdentical(root, subRoot)) {
                return true;
            }

            boolean leftAns = isSubtree(root.left, subRoot);
            boolean rightAns = isSubtree(root.right, subRoot);

            return leftAns || rightAns;
        }
    }

    public static void main(String[] args) {
        int Nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(Nodes);

        int subNodes[] = {2, 4, -1, -1, 5, -1, -1};
        Node subRoot = tree.buildTree(subNodes);

        System.out.println(tree.isSubtree(root, subRoot));
    }
}

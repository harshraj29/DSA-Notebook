import java.util.*;

class Node {
    int data;
    int depth;
    Node left, right;

    Node(int value, int d) {
        data = value;
        depth = d;
        left = right = null;
    }
}

class Main {
    Node root;

    Main() {
        root = null;
    }

    void insert(int value, int depth) {
        root = insertRec(root, value, depth);
    }

    Node insertRec(Node root, int value, int depth) {
        if (root == null)
            return new Node(value, depth);

        if (value < root.data)
            root.left = insertRec(root.left, value, depth + 1);
        else if (value > root.data)
            root.right = insertRec(root.right, value, depth + 1);

        return root;
    }

    static class Pair {
        int hd;
        Node node;

        public Pair(int hd, Node node) {
            this.node = node;
            this.hd = hd;
        }
    }

    void topView() {
        Queue<Pair> q = new ArrayDeque<>();
        Map<Integer, Integer> map = new TreeMap<>();
        q.add(new Pair(0, root));

        while (!q.isEmpty()) {
            Pair cur = q.poll();

            if (!map.containsKey(cur.hd)) {
                map.put(cur.hd, cur.node.data);
            }

            if (cur.node.left != null) {
                q.add(new Pair(cur.hd - 1, cur.node.left));
            }
            if (cur.node.right != null) {
                q.add(new Pair(cur.hd + 1, cur.node.right));
            }
        }

        for (int val : map.values()) {
            System.out.print(val + " ");
        }

    }

    void bottomView() {
        if (root == null)
            return;
    
        Queue<Pair> q = new LinkedList<>();
        Map<Integer, Integer> map = new TreeMap<>();
        q.add(new Pair(0, root));
    
        while (!q.isEmpty()) {
            Pair cur = q.poll();
            map.put(cur.hd, cur.node.data);
    
            if (cur.node.left != null) {
                q.add(new Pair(cur.hd - 1, cur.node.left));
            }
            if (cur.node.right != null) {
                q.add(new Pair(cur.hd + 1, cur.node.right));
            }
        }
    
        for (int val : map.values()) {
            System.out.print(val + " ");
        }
    }

    void lefthelper(Node root,ArrayList<Integer> ans,int level){
        if(root == null){
            return;
        }
        if (level == ans.size()) {
        ans.add(root.data);
    }
        
    lefthelper(root.left,ans,level+1);
    lefthelper(root.right,ans,level+1);
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

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        Main tree = new Main();
        for (int i = 0; i < n; i++) {
            int value = scanner.nextInt();
            int depth = scanner.nextInt();
            tree.insert(value, depth);
        }

        tree.topView();
        // tree.bottomView();

        scanner.close();
    }
}

class Graph {
    private Map<Integer, List<Integer>> adjList;

    public Graph() {
        adjList = new HashMap<>();
    }

    public void addEdge(int u, int v) {
        adjList.computeIfAbsent(u, k -> new ArrayList<>()).add(v);
    }

    public void dfs(int start) {
        boolean[] visited = new boolean[adjList.size()];
        dfsUtil(start, visited);
    }

    private void dfsUtil(int v, boolean[] visited) {
        visited[v] = true;
        System.out.print(v + " ");

        List<Integer> neighbors = adjList.getOrDefault(v, Collections.emptyList());
        for (int neighbor : neighbors) {
            if (!visited[neighbor]) {
                dfsUtil(neighbor, visited);
            }
        }
    }

    public void bfs(int start) {
        boolean[] visited = new boolean[adjList.size()];
        Queue<Integer> queue = new LinkedList<>();

        visited[start] = true;
        queue.offer(start);

        while (!queue.isEmpty()) {
            int current = queue.poll();
            System.out.print(current + " ");

            List<Integer> neighbors = adjList.getOrDefault(current, Collections.emptyList());
            for (int neighbor : neighbors) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.offer(neighbor);
                }
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.addEdge(0, 1);

        System.out.print("DFS starting from vertex 2: ");
        graph.dfs(2);
        System.out.println();
    }
}

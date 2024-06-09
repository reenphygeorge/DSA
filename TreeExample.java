import java.util.*;

class Node {
    int data;
    Node left;
    Node right;
    public Node(int data) {
        this.data = data;
    }
}

class Pair {
    int hd; // Horizontal Distance
    Node node;
    public Pair(int hd, Node node) {
        this.hd = hd;
        this.node = node;
    }
}

public class TreeExample {
    public static void preorder(Node node) {
        if(node == null) {
            return;
        }
        System.out.println(node.data);
        preorder(node.left);
        preorder(node.right);
    }

    public static void postorder(Node node) {
        if(node == null) {
            return;
        }
        postorder(node.left);
        postorder(node.right);
        System.out.println(node.data);
    }

    public static void inorder(Node node) {
        if(node == null) {
            return;
        }
        postorder(node.left);
        System.out.println(node.data);
        postorder(node.right);
    }
    public static void bfs(Node node) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);
        while(!queue.isEmpty()) {
            Node top = queue.poll(); // Peeks and removes it from queue
            Node left = top.left;
            Node right = top.right;
            if(left != null)
                queue.add(left);
            if(right != null)
                queue.add(right);
            System.out.println(top.data);
        }
    }

    public static void iterativePreorder(Node node) {
        Stack<Node> stack = new Stack<>();
        stack.push(node);
        while(!stack.isEmpty()) {
            Node top = stack.pop();
            if(top.right != null)
                stack.push(top.right);
            if(top.left != null)
                stack.push(top.left);
            System.out.print(top.data+" ");
        }
    }

    public static void iterativeInorder(Node node) {
        Stack<Node> stack = new Stack<>();
        while(true) {
            if(node != null) {
                stack.push(node);
                node = node.left;
            }
            else {
                if(stack.isEmpty()) break;
                node = stack.pop();
                System.out.print(node.data + " ");
                node = node.right;
            }
        }
    }

    public static void iterativePostorder(Node node) {
        Stack<Node> stack1 = new Stack<>();
        Stack<Node> stack2 = new Stack<>();
        stack1.push(node);
        while(!stack1.isEmpty()) {
            Node top = stack1.pop();
            stack2.push(top);
            if (top.left != null)
                stack1.push(top.left);
            if (top.right != null)
                stack1.push(top.right);
        }
        while(!stack2.isEmpty()) {
            System.out.print(stack2.pop().data+" ");
        }
    }

    static int diameter = 0;
    public static int height(Node node) {
        if(node == null)
            return 0;
        diameter = Math.max(diameter,height(node.left)+height(node.right)+1);
        return Math.max(height(node.left),height(node.right))+1;
    }

    public static int size(Node node) {
        if(node == null)
            return 0;
        return size(node.left) + size(node.right) + 1;
    }

    public static int maximum(Node node) {
        if(node == null)
            return Integer.MIN_VALUE;
        int max1 = Math.max(node.data,maximum(node.left));
        return Math.max(max1,maximum(node.right));
    }

    public static int minimum(Node node) {
        if(node == null)
            return Integer.MAX_VALUE;
        int min1 = Math.min(node.data,minimum(node.left));
        return Math.min(min1,minimum(node.right));
    }

    public static void printView(Node root, String view) {
        HashMap<Integer, Node> map = new HashMap<>();
        if(view.equals("left"))
            leftView(root,map,0);
        else if (view.equals("right"))
            rightView(root,map,0);
        for(Node node: map.values()) {
            System.out.print(node.data+" ");
        }
    }
    public static void leftView(Node node, HashMap<Integer, Node> map,int level) {
        if(node == null)
            return;
        if(!map.containsKey(level))
            map.put(level,node);
        leftView(node.left,map,level+1);
        leftView(node.right,map,level+1);
    }

    public static void rightView(Node node, HashMap<Integer, Node> map, int level) {
        if(node == null)
            return;
        if(!map.containsKey(level))
            map.put(level,node);
        rightView(node.right,map,level+1);
        rightView(node.left,map,level+1);
    }

    public static void topView(Node root) {
        Queue<Pair> queue = new LinkedList<>();
        TreeMap<Integer,Node> map = new TreeMap<>();
        queue.add(new Pair(0,root));
        while(!queue.isEmpty()) {
            Pair curr = queue.poll();
            if(!map.containsKey(curr.hd))
                map.put(curr.hd, curr.node);
            if(curr.node.left != null)
                queue.add(new Pair(curr.hd-1,curr.node.left));
            if(curr.node.right != null)
                queue.add(new Pair(curr.hd+1,curr.node.right));
        }
        for(Node node: map.values()) {
            System.out.print(node.data+" ");
        }
    }

    public static void bottomView(Node root) {
        Queue<Pair> queue = new LinkedList<>();
        TreeMap<Integer,Node> map = new TreeMap<>();
        queue.add(new Pair(0,root));
        while(!queue.isEmpty()) {
            Pair curr = queue.poll();
            map.put(curr.hd, curr.node);
            if(curr.node.left != null)
                queue.add(new Pair(curr.hd-1,curr.node.left));
            if(curr.node.right != null)
                queue.add(new Pair(curr.hd+1,curr.node.right));
        }
        for(Node node: map.values()) {
            System.out.print(node.data+" ");
        }
    }

    static Node prev = null, head = null;
    public static Node convertToDLL(Node node) {
        if(node == null) return null;
        convertToDLL(node.left);
        if(prev == null)
            head = node;
        else {
            node.left = prev;
            prev.right = node;
        }
        prev = node;
        convertToDLL(node.right);
        return head;
    }

    public static void displayDLL(Node head) {
        while(head != null) {
            System.out.print(head.data + " ");
            head = head.right;
        }
    }

    public static Node leastCommonAncestor(Node root, int n1, int n2) {
        if(root == null) return null;
        if(root.data == n1 || root.data == n2) return root;

        Node left = leastCommonAncestor(root.left,n1,n2);
        Node right = leastCommonAncestor(root.right,n1,n2);

        if(left == null) return right;
        if(right == null) return left;

        return root;
    }

    public static boolean searchBST(Node root, int x) {
        if(root == null) return false;
        if(root.data == x) return true;
        if(root.data > x) return searchBST(root.left,x);
        return searchBST(root.right,x);
    }

    public static Node insertBST(Node root, int x) {
        if(root == null) return new Node(x);
        if(x<root.data) root.left = insertBST(root.left,x);
        else root.right = insertBST(root.right,x);
        return root;
    }

    public static void insertBSTIterative(Node root, int x) {
        Node newNode = new Node(x);
        Node cur = root, parent = null;
        while(cur != null) {
            parent = cur;
            if(x<cur.data) cur = cur.left;
            else if(x>cur.data) cur = cur.right;
        }
        if(parent == null) parent = newNode;
        if(x < parent.data) parent.left = newNode;
        else parent.right = newNode;
    }

    public static Node deleteBST(Node root, int key) {
        if(root == null) return null;
        if(key < root.data)
            root.left = deleteBST(root.left,key);
        else if(key > root.data)
            root.right = deleteBST(root.right,key);
        else {
            if(root.left == null)
                return root.right;
            else if(root.right == null)
                return root.left;
            root.data = minValue(root.right);
            root.right = deleteBST(root.right,root.data);
        }
        return root;
    }

    public static int minValue(Node node) {
        int val = node.data;
        while(node.left != null) {
            node = node.left;
            val = node.data;
        }
        return val;
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(10);
        root.right = new Node(25);
        root.left.left = new Node(5);
        root.left.right = new Node(13);
        root.left.left.left = new Node(3);
        root.left.left.right = new Node(7);
        root.right.left = new Node(20);
        root.right.right = new Node(30);
        root.right.right.left = new Node(27);
        root.right.right.right = new Node(35);
        root.right.right.right.right = new Node(40);
//        preorder(root);
//        postorder(root);
//        inorder(root);
//        height(root);
//        System.out.print(diameter);
//        Node head = convertToDLL(root);
//        displayDLL(head);
//        Node least = leastCommonAncestor(root,25,1);
//        System.out.print(least.data);
        insertBSTIterative(root,31);
//        System.out.print(value);
    }
}

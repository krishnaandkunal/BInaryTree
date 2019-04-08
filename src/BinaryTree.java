class Node{
    private int data;
    private Node left;
    private Node right;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }
}
public class BinaryTree {
    public static Node insert(int data){
        Node n = new Node();
        n.setData(data);
        return n;
    }

    public static void inOrderDisplay(Node root){
        if(root==null){
            return;
        }
        inOrderDisplay(root.getLeft());
        System.out.println(root.getData());
        inOrderDisplay(root.getRight());
    }

    public static void main(String[] args) {
        Node root = insert(10);
        root.setLeft(insert(20));
        root.setRight(insert(30));
        root.getLeft().setLeft(insert(40));
        root.getLeft().setRight(insert(50));
        root.getRight().setLeft(insert(60));
        root.getRight().setRight(insert(70));
        inOrderDisplay(root);
    }
}

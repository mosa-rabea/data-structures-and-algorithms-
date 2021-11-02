package trees;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree <T>{
    Node<T> root;
    ArrayList<T> preOrderList = new ArrayList<>();
    ArrayList<T> inOrderList = new ArrayList<>();
    ArrayList<T> postOrderList = new ArrayList<>();

    public BinaryTree() {

    }

    public BinaryTree(T value) {
        this.root = new Node<>(value);
    }
    public ArrayList<T> preOrder(Node<T> root){
        if(root != null){
            this.preOrderList.add(root.value);
            if (root.leftChild != null){
                preOrder(root.leftChild);
            }
            if (root.rightChild != null) {
                preOrder(root.rightChild);
            }}
        return this.preOrderList;
    }

    public ArrayList<T> inOrder(Node<T> root){
        if(root != null){
            if (root.leftChild != null){
                inOrder(root.leftChild);
            }
            this.inOrderList.add(root.value);
            if (root.rightChild != null) {
                inOrder(root.rightChild);
            }
        }
        return this.inOrderList;
    }

    public ArrayList<T> postOrder(Node<T> root){
        if(root != null){
            if (root.leftChild != null){
                postOrder(root.leftChild);
            }
            if (root.rightChild != null) {
                postOrder(root.rightChild);
            }
            this.postOrderList.add(root.value);
        }
        return this.postOrderList;
    }


    public  ArrayList<Integer> breadthFirst(BinaryTree<Integer> tree) {
        ArrayList<Integer> values =new ArrayList<Integer>();
        Queue<Node> breadthFirst = new LinkedList<>();
        if (tree.root != null) {
            breadthFirst.add(tree.root);
            while (!breadthFirst.isEmpty()) {
                Node node = breadthFirst.remove();
                values.add((Integer)node.value);
                if (node.leftChild != null) {
                    breadthFirst.add(node.leftChild);
                }
                if (node.rightChild != null) {
                    breadthFirst.add(node.rightChild);
                }
            }
        }
        return values;
    }

    public Integer maximum(){
        Integer max = 0;
        ArrayList<T> list = preOrder(this.root);
        for (T t : list) {
            if (max < (Integer) t) {
                max = (Integer) t;
            }
        }
        return max;
    }





}

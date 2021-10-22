package linked.list;

public class LinkedList<T> {
    Node<T> head;

    public LinkedList() {
        this.head = null;
    }

    public void insert(T value) {
        Node node = new Node(value);
        node.next = head;
        head = node;
    }

    boolean includes(T value) {
        Node current = head;
        while (current.next != null) {
            if (current.value.equals(value)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    @Override
    public String toString() {
        Node current = head;
        String result = "";
        while (current != null) {
            result += "{ " + current.value + " } -> ";
            current = current.next;
        }
        result += "NULL";
        return result;
    }
}
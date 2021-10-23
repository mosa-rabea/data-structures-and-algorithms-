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

    public  void append(T value){

        Node pointer = head;
        Node newNode =new Node(value);



        if (head==null){
            head = newNode;
        }else {
            while (pointer.next != null) {
                pointer = pointer.next;
            }
        }
        pointer.next = newNode;
    }

    public  void insertBefore(T value,T newValue){

        if (head.value == value) {
            this.insert(newValue);

        }
        else{
            Node pointer = head;
            while (pointer.next!=null) {
                if (pointer.next.value==value) {
                    Node newNode = new Node((newValue));
                    newNode.next = pointer.next;
                    pointer.next = newNode;
                    return;
                }
                pointer= pointer.next;

            }

        }

    }
    public void insertAfter(T value,T newValue) {

        Node newNode = new Node(newValue);
        Node pointer = head;

        while (pointer!=null) {
            if (pointer.value==value) {
                newNode.next = pointer.next;
                pointer.next = newNode;
            }

            pointer = pointer.next;
        }

    }
}
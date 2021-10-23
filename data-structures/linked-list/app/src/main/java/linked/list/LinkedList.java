package linked.list;

public class LinkedList<T> {
    Node<T> head;

    public LinkedList() {
        this.head = null;
    }

    public void insert(T value) {
        Node<T> node = new Node<>(value);
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
        Node<T> newNode =new Node<>(value);



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
                    Node<T> newNode = new Node<>((newValue));
                    newNode.next = pointer.next;
                    pointer.next = newNode;
                    return;
                }
                pointer= pointer.next;

            }

        }

    }
    public void insertAfter(T value,T newValue) {

        Node<T> newNode = new Node<>(newValue);
        Node pointer = head;

        while (pointer!=null) {
            if (pointer.value==value) {
                newNode.next = pointer.next;
                pointer.next = newNode;
            }

            pointer = pointer.next;
        }

    }
    public String kthFromEnd(int newValue) {

        if (head == null) return "Exception";

        Node current = head;
        int count = 0;
        while (current.next != null) {
            current = current.next;
            count++;
        }

        if (newValue > count || newValue < 0) {
            return "Exception";
        } else {
            current = head;
            for (int i = 0; i <= count-newValue; i++) {
                if (i == count-newValue) {
                    return "{"+current.value+"}";
                }
                current = current.next;
            }
        }
        return "Exception";
    }

    public LinkedList zipList(LinkedList firstList, LinkedList secondList) {
        LinkedList linkedList = new LinkedList();
        Node current1 = firstList.head;
        Node current2 = secondList.head;

        while (current1 != null || current2 != null) {
            if (current1 != null && current2 != null) {
                linkedList.append(current1.getValue());
                linkedList.append(current2.getValue());

                current1 = current1.next;
                current2 = current2.next;
            } else if (current1 == null) {
                linkedList.append(current2.getValue());
                current2 = current2.next;
            } else if (current2 == null) {
                linkedList.append(current1.getValue());
                current1 = current1.next;
            }
        }
        return linkedList;
    }

}
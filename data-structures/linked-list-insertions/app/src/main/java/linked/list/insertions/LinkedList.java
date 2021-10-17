package linked.list.insertions;
import java.util.ArrayList;
public class LinkedList {
    Node head;

    public void insert(int num){
        Node addedNode = new Node(num);
        if (head != null) {
            addedNode.next = head;
        }
        head=addedNode;
    }

    public boolean includes(int value){
        Node current = head;
        while (current != null){
            if (current.value == value){
                return true;
            }
            current= current.next;
        }
        return false;
    }

    public String toString(){
        String printResult = "";
        Node current = head;
        while (current != null){
            printResult+= "{"+current.value+"} -> ";
            current= current.next;
        }
        printResult+="NULL";
        return printResult;
    }

    // lab 6 insertions

    public void append(int num){
        Node newNode = new Node(num);
        if (head != null) {
            Node current = head;
            while (current.next!= null){
                current=current.next;
            }
            current.next = newNode;
        }else{
            head=newNode;
        }
    }

    public void insertBefore(int num , int newNum){
        Node current = head;
        Node newNode = new Node(newNum);
        while(current.next != null && current.next.value != num && current.value != num){
            current= current.next;
        }
        if(current == head) {
            insert(newNum);
        }else if(current.next != null){
            newNode.next = current.next;
            current.next= newNode;
        }
    }

    public void insertAfter(int num , int newNum){
        Node newNode = new Node(newNum);
        Node current = head;


        while(current.next != null && current.value != num){
            current= current.next;
        }

        if (current.value == num){
            newNode.next = current.next;
            current.next = newNode;
        }

    }

    public int kthFromEnd (int k) {
        ArrayList<Integer> nodesValue = new ArrayList<>();
        int value=0;
        Node current = head;

        while (current != null){
            nodesValue.add(current.value);
            current= current.next;
        }
        try {
            value =(nodesValue.get((nodesValue.size()-1) - k));

        } catch (Exception e) {
            e.printStackTrace();
        }
        return value;

    }

}

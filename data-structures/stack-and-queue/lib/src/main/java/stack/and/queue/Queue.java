package stack.and.queue;

class Queue<T> {
    Node front;
    Node rear;
    int size;

    public Queue() {
        this.front = null;
        this.rear = null;
        this.size =0;

    }



    public void enqueue(T value) throws Exception {
        Node newNode = new Node(value);
        size++;
        if (empty()) {
            front = newNode;
        } else {

            rear.next = newNode;

        }
        rear = newNode;

    }

    public String dequeue() throws Exception {
        size--;
        Node temp = front;
        if (empty()) {
            throw new Exception("Is empty");
        }
        front = front.next;
        temp.next = null;
        return (String) temp.getValue();


    }
    public String peek() throws Exception {
        if (empty()) {
            throw new Exception("Is empty");
        } else {
            return (String) rear.getValue();
        }
    }

    @Override
    public String toString(){
        Node pointer = this.front;
        if (pointer==null){
            return "Is empty";
        }
        String str = "";
        while (pointer!= null) {
            str = str + "{"+pointer.value+"}->";
            pointer =pointer.next;
        }
        str = str + "NUll";
        return str;
    }
    public boolean empty() {
        if (front == null || rear == null) {
            return true;
        }

        return false;
    }

}
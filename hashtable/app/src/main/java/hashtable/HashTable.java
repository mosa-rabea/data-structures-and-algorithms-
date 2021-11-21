package hashtable;


public class HashTable <T>{
    Node<T>[] arrayOfNodes;
    int arraySize;


    public HashTable(int arraySize){
        this.arraySize = arraySize;
        this.arrayOfNodes = new Node[this.arraySize];
        for (Node node : arrayOfNodes) {
            node = new Node();
        }
    }


    public int hash(T key){
        int asInteger=0;
        if (key instanceof String){
            for(char latter : ((String) key).toCharArray()){
                asInteger += (int) latter;
            }
        }else{
            asInteger = (Integer)key;
        }

        return asInteger % arraySize;
    }





    public void add(T key , T value){

        int item =  hash(key);
        Node<T> newNode = new Node<T>(value,key);
        if (arrayOfNodes[item] == null){
            arrayOfNodes[item] = newNode;
        }else if (arrayOfNodes[item].next == null){
            arrayOfNodes[item].next = newNode;
        }else{
            newNode.next = arrayOfNodes[item].next;
            arrayOfNodes[item].next = newNode;
        }
    }


    public String get(T key){
        int index = hash(key);
        String returnData=null;
        if(arrayOfNodes[index] == null){
            returnData= "Not existed";
            
        }else{
            Node<T> current = arrayOfNodes[index];

            while(current != null){
                if (current.key == key){
                    returnData= (String)current.value;
                    break;
                }else{
                    current = current.next;
                }

            }
        }
        return returnData;
    }


    public boolean contains(T key){
        int item = hash(key);
        boolean returnValue = false;

        if (arrayOfNodes[item] != null){
            Node<T> current = arrayOfNodes[item];


            while (current != null){
                if (current.key == key){
                    returnValue=true;
                    break;
                }else{
                    current = current.next;
                }
            }
        }
        return returnValue;
    }

}

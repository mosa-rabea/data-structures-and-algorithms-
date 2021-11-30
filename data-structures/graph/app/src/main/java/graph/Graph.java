package graph;


import java.util.*;

public class Graph<T> {
    Map<Node<T>, List<Node<T>>> graph = new HashMap<>();
    List<Node<T>> preOrder = new ArrayList<>();

    public Graph() {
    }


    public Node<T> addNode(T value){
        Node<T> newNode = new Node<T>(value);
        graph.put(newNode, new ArrayList<>());

        return newNode;
    }



    public void addEdge(Node<T> source , Node<T> destination , boolean undirected){
        graph.get(source).add(destination);

        if (undirected){
            graph.get(destination).add(source);
        }
    }



    public void addEdge(Node<T> source , Node<T> destination, int weight , boolean undirected){
        Node<T> nodeOneWithWeight = new Node<>(source.value,weight);
        Node<T> nodeTwoWithWeight = new Node<>(destination.value,weight);

        graph.get(source).add(nodeTwoWithWeight);
        if (undirected){
            graph.get(destination).add(nodeOneWithWeight);
        }
    }


    public List<Node<T>> getNeighbors(Node<T> node){
        return graph.get(node);
    }


    public Set<Node<T>> getNodes(){

        Set<Node<T>> visited = new HashSet<>();

        if (! graph.isEmpty()) {
            graph.forEach((key, value) -> {
                visited.add(key);
            });
            return visited;
        }else{
            return null;
        }
    }




//    ALGORITHM BreadthFirst(vertex)
//    DECLARE nodes <-- new List()
//    DECLARE breadth <-- new Queue()
//    DECLARE visited <-- new Set()
//
//    breadth.Enqueue(vertex)
//            visited.Add(vertex)
//
//            while (breadth is not empty)
//    DECLARE front <-- breadth.Dequeue()
//            nodes.Add(front)
//
//            for each child in front.Children
//            if(child is not visited)
//            visited.Add(child)
//            breadth.Enqueue(child)
//
//            return nodes;

    public List<Node<T>> breadthFirst(Node<T> root){
        List<Node<T>> list = new ArrayList<>();
        Set<Node<T>> visited = new HashSet<>();
        List<Node<T>> queue = new ArrayList<>();

        queue.add(root);
        visited.add(root);

        while(!queue.isEmpty()){
            Node<T> front = queue.get(0);
            queue.remove(0);
            list.add(front);

            for (int i = 0; i < graph.get(front).size(); i++) {
                if (! visited.contains(graph.get(front).get(i))){
                    visited.add(graph.get(front).get(i));
                    queue.add(graph.get(front).get(i));
                }
            }

        }
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i).value+"    ");
        }
        return list;
    }


    public List<Node<T>> depthFirst(Node<T> root) {
        this.preOrder.add(root);
        System.out.print(root.value + "    ");

        if (!graph.get(root).isEmpty()) {
            for (int i = 0; i < graph.get(root).size(); i++) {
                if (!preOrder.contains(graph.get(root).get(i))) {
                    depthFirst(graph.get(root).get(i));
                }
            }
        }
        return preOrder;
    }

    public int getSize(){
        return graph.size();
    }

}

package graph;


import java.util.*;

public class Graph<T> {
    Map<Node<T>, List<Node<T>>> graph = new HashMap<>();


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




    public int getSize(){
        return graph.size();
    }

}

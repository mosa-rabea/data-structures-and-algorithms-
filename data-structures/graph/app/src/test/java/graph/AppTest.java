/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package graph;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");



//        Node can be successfully added to the graph
        Graph<String> graphTest = new Graph<>();
        Node<String> testNode = graphTest.addNode("A");

        assertTrue(graphTest.graph.containsKey(testNode));



//        An edge can be successfully added to the graph
        Node<String> secondNode = graphTest.addNode("B");
        graphTest.addEdge(testNode,secondNode,true);

        assertEquals(secondNode , graphTest.getNeighbors(testNode).get(0));




//        A collection of all nodes can be properly retrieved from the graph
        Set<Node<String>> allNodesTest = new HashSet<>();
        allNodesTest.add(testNode);
        allNodesTest.add(secondNode);

        assertEquals(allNodesTest, graphTest.getNodes());




//        All appropriate neighbors can be retrieved from the graph

        List<Node<String>> neighborsTest = new ArrayList<>();
        neighborsTest.add(secondNode);

        assertEquals(neighborsTest , graphTest.getNeighbors(testNode));




//        Neighbors are returned with the weight between nodes included

        Node<String> weightNode = graphTest.addNode("C");
        graphTest.addEdge(secondNode,weightNode,5,true);


        assertEquals(5 , graphTest.getNeighbors(weightNode).get(0).weight);
        assertEquals(5 , graphTest.getNeighbors(secondNode).get(1).weight);



//        The proper size is returned, representing the number of nodes in the graph
        assertEquals(3,graphTest.getSize());



//        A graph with only one node and edge can be properly returned
        Graph<String> newGraph = new Graph<>();
        Node<String> oneNode = newGraph.addNode("A");

        Set<Node<String>> result5 = new HashSet<>();
        result5.add(oneNode);


        assertEquals(result5, newGraph.getNodes());



//        An empty graph properly returns null
        Graph<String> emptyGraph = new Graph<>();

        assertNull(emptyGraph.getNodes());

    }

    @Test void breadthFirstTest(){
        Graph<String> breadthFirstTest1 = new Graph<>();
        Node a = breadthFirstTest1.addNode("A");
        Node b =  breadthFirstTest1.addNode("b");
        Node c = breadthFirstTest1.addNode("c");
        Node d = breadthFirstTest1.addNode("d");

        breadthFirstTest1.addEdge(a,b,true);
        breadthFirstTest1.addEdge(b,c,true);
        breadthFirstTest1.addEdge(c,d,true);
        breadthFirstTest1.addEdge(b,d,true);

        List<Node<String>> result = new ArrayList<>();
        result.add(a);

        result.add(b);
        result.add(c);
        result.add(d);


        assertEquals(result,breadthFirstTest1.breadthFirst(a));

    }

    @Test void depthFirstTest(){
        Graph<String> graph = new Graph<>();

        Node a = graph.addNode("A");
        Node b =  graph.addNode("B");
        Node c = graph.addNode("C");
        Node d = graph.addNode("D");
        Node e = graph.addNode("E");
        Node f = graph.addNode("F");
        Node g = graph.addNode("G");
        Node h = graph.addNode("H");


        graph.addEdge(a,b,true);
        graph.addEdge(a,d,true);
        graph.addEdge(b,c,true);
        graph.addEdge(b,d,true);
        graph.addEdge(c,g,true);
        graph.addEdge(d,e,true);
        graph.addEdge(d,h,true);
        graph.addEdge(d,f,true);
        graph.addEdge(h,f,true);


        List<Node<String>> result = new ArrayList<>();
        result.add(a);
        result.add(b);
        result.add(c);
        result.add(g);
        result.add(d);
        result.add(e);
        result.add(h);
        result.add(f);

        assertEquals(result , graph.depthFirst(a));



    }

}

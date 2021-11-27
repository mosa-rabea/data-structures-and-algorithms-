# Graphs

* A graph is a non-linear data structure that can be looked at as a collection of vertices (or nodes) potentially connected by line segments named edges.


## Challenge
<!-- Description of the challenge -->
Implement your own Graph. The graph should be represented as an adjacency list, and should include the following methods:

**add node**

* Arguments: value
* Returns: The added node
Add a node to the graph

**add edge**

        * Arguments: 2 nodes to be connected by the edge, weight (optional)
        * Returns: nothing
        * Adds a new edge between two nodes in the graph
        * If specified, assign a weight to the edge
        Both nodes should already be in the Graph 

**get nodes**

        * Arguments: none
        * Returns all of the nodes in the graph as a collection (set, list, or similar)

**get neighbors**
        * Arguments: node
        * Returns a collection of edges connected to the given node
        * Include the weight of the connection in the returned collectio

**size**

        Arguments: none
        Returns the total number of nodes in the graph



## Approach & Efficiency

### the big O notation for each method

1. add node : time = O(1) because we didnt use loops, space = O(n) because we declared a new ArrayList.

2. add edge : time = O(1) because we didnt use loops, space = O(1) because we didnt declare any arrays.

3. get nodes : time = O(n) because we use loop , space = O(n) because we declared a HashSet.

4. get neighbors : O(1) for both time and space complexity because there is no loops or arrays.
 
5. size : O(1) for both time and space complexity.


## API

**add edge**

        * Arguments: 2 nodes to be connected by the edge, weight (optional)
        * Returns: nothing
        * Adds a new edge between two nodes in the graph
        * If specified, assign a weight to the edge
        Both nodes should already be in the Graph

**get nodes**

        * Arguments: none
        * Returns all of the nodes in the graph as a collection (set, list, or similar)

**get neighbors**

        * Arguments: node
        * Returns a collection of edges connected to the given node
        * Include the weight of the connection in the returned collection

**size**

        Arguments: none
        Returns the total number of nodes in the graph
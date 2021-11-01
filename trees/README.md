# Trees
A tree is a hierarchical data structure defined as a collection of nodes. Nodes represent value and nodes are connected by edges.

## Challenge
this challenge was about making a binary tree implementation, so we created a binary tree and we added pre order ,in order ,post order functionality to it. then we create a binary search tree which has add, contain functionality.

## Approach & Efficiency
in all of our methods the big O notation was equal to O(n) because we used reqursive functions in some and loops in others. 

## API
#### in BinaryTree class there are three methods:
1. preOrder: a method accept Node root as a parameter and return a list contain the tree values in (root,left,right) order.
2. inOrder: a method accept Node root as a parameter and return a list contain the tree values in (left,root,right) order.
3. postOrder: a method accept Node root as a parameter and return a list contain the tree values in (left,right,root) order.

##### in binarySearchTree class there are two methods:
1. add: a method accept a value and add it to a certain location in the tree whereas the left node is smaller and the right node is bigger.
2. contains: a method which take a value and a root node as parameters and search for that value in the tree based on binary search concepts.

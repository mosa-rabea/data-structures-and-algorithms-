# Singly Linked List
linked list is a data stucture type , which consist of nodes where each node have a value and a reference , the reference is pointing to the next node on the sequence .

## Challenge
* Create a Node class that has properties for the value stored in the Node, and a pointer to the next Node.
* create a LinkedList class that has a property of head, and have an insert , includes , tostring methods.

## Approach & Efficiency
* in the insert method i added nodes to the first always so we didnt use any loops.



big O of time = O(1)
big O of space = O(1)


* in the includes method i used the while loop to loop and search for Nodes.


big O of time = O(n)
big O of space = O(1)


* in the toString method i used the while loop to loop to assign the values of nodes to a String variable.

big O of time = O(n)
big O of space = O(1)


## API

1. toString : looping through the linked list and adding the values in a String variable to be printed.

2. includes : checking for a specific value if it exist in the linked list or not.


3. insert :  adding nodes to the linked list.




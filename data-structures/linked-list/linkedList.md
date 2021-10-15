## Singly Linked List :

* a linear data structure in which each element of the list contains a pointer,
 which points to the next element in the list.

## Challenge :

 ### Implement linkedlist include :

* insert
* includes
* to string

## Approach & Efficiency :

after i created a class for Node and the linkedlist ,
I made these methods :

* insert : we want to add node in the first so i use the head to point to the nest node , O(1)

* includes : we want to make sure if the value inside the loop and return true if its there and false if its not, O(1)

* toString : we want to return an string statement that include all the valuse in the linkedlist , O(1)

API
we have this method:

insert : add in the first , i use the head to point to the nest node

includes : i use while to loop over the linkedlist until reach to the null and i added if statement inside to check the value and return true if its in the linkeslist and false if its not

toString : also i use while to loop over the linkedlist until reach to the null and assign the result to the current value ,then return it

Tests :

* Can successfully instantiate an empty linked list
* Can properly insert multiple nodes into the linked list
* Can properly return a collection of all the values that exist in the linked list     
* Can properly insert into the linked list
* Will return true when finding a value within the linked list that exists
* Will return false when searching for a value in the linked list that does not exist
* The head property will properly point to the first node in the linked list

 
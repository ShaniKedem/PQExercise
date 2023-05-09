# PQ Exercise
## QuickPopPQ and QuickPushPQ
QuickPopPQ and QuickPushPQ are classes that implements a priority queue data structure without using built-in Java data structure. 
It allows elements to be added to the queue and removes them in order of priority. The class uses a linked list to implement the queue.

## requirements
QuickPopPQ -  push in o(n)
              pop in o(1)
QuickPushPQ - push in o(1)
              pop in o(n)

# Class Structure
The classes contains private inner class PqNode and Object lock - to enable multi-threaded enviroment.
## PqNode:
PqNode is a private inner class that represents a node in the linked list. It contains a generiic data field of type T, a next field of type PqNode, and a prev field of type PqNode.
T is a generic type parameter that extends Comparable.
## Object lock:
Object lock is a private object used for synchronization purposes in the pop and push methods.

## Methods 
### QuickPopPQ
#### pop 
This method removes and returns the element with the highest priority from the queue. 
The method has a time complexity of O(1) - Remove the element placed at the head.
#### push
This method adds a new element to the queue. The element is inserted at the appropriate position to maintain the order of priority.
The method has a time complexity of O(n)


### QuickPushPQ
#### pop
This method removes and returns the element with the highest priority from the queue. 
Searches for the element with the highest priority and removes it.
The method has a time complexity of O(n).
#### push
This method adds a new element to the queue. 
it placed the new element at the head of the queue.
The method has a time complexity of O(1).


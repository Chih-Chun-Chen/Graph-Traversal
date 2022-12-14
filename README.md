Part 1
Your program should read in a sequence of data from Standard Input describing a graph.
The format of the input is as follows. The first line lists the names of the nodes in the graph. You can assume that this line will always be a list of strings in alphabetical order. The second line is the name of the node at which you will start the traversal. The remaining lines each define one edge in the graph. The last line will consist of three asterisks ***. The edges are NOT directed. For example, the input:
A B C D E F G H I J
F
A B
A D
A C
B C
B E
B G
C E
C F
D F
E F
E G
F H
G H
H I
I J
G J
***

For each node, print out the names of its neighbors. For example, the output for the above input file would be:
Node Neighbors:
D: A F 
E: B C F G 
F: C D E H 
G: B E H J 
A: B C D 
B: A C E G 
C: A B E F 
H: F G I 
I: H J 
J: G I 

Please note that the ORDER in which the nodes are printed does not matter; as long as the neighbors are all correct.

Part 2
After printing out the names of the nodes' neighbors, your program should print out the nodes in the order they would be visited in a depth-first traversal. Base your algorithm on the pseudocode printed on page 597 of the textbook. Start with the node that is listed on the 2nd line of the input (So in the example above, the traversal would start with node F.) During the course of the traversal, if a node has multiple neighbors, we will follow the textbook's convention of visiting the nodes in alphabetical order.
So for the input above, your program would print out:
Depth-First Search:
F C A B E G H I J D

Part 3
Once you have depth first traversal working, implement breadth-first traversal as well. Base your algorithm on the pseudocode printed on page 599 of the textbook. So the complete output of your program would be:
D: A F 
E: B C F G 
F: C D E H 
G: B E H J 
A: B C D 
B: A C E G 
C: A B E F 
H: F G I 
I: H J 
J: G I 

Depth-First Search:
F C A B E G H I J D 

Breadth-First Search:
F C D E H A B G I J 

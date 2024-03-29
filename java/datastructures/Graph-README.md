# Graph Implementation

## Features

Implement your own Graph. The graph should be represented as an adjacency list, and should include the following methods:

### Graph

- add node
  - Arguments: value
  - Returns: The added node
  - Add a node to the graph
- add edge
  - Arguments: 2 nodes to be connected by the edge, weight (optional)
  - Returns: nothing
  - Adds a new edge between two nodes in the graph
  - If specified, assign a weight to the edge
  - Both nodes should already be in the Graph
- get nodes
  - Arguments: none
  - Returns all the nodes in the graph as a collection (set, list, or similar)
  - Empty collection returned if there are no nodes
- get neighbors
  - Arguments: node
  - Returns a collection of edges connected to the given node
  - Include the weight of the connection in the returned collection
  - Empty collection returned if there are no nodes
- size
  - Arguments: none
  - Returns the total number of nodes in the graph
  - 0 if there are none

## Whiteboard Process

No whiteboard was created for this class implementation.

## Approach & Efficiency

- add node (addVertex)
  - Time Complexity: O(1) - Inserting a new key-value pair in a HashMap takes constant time.
  - Space Complexity: O(1) - The space used does not grow with the input size, but is rather constant, just storing the value.

- add edge
  - Time Complexity: O(1) - Again, we're just manipulating the HashMap, which has constant time operations for adding new entries.
  - Space Complexity: O(1) - This operation does not require any additional space that scales with input size.

- get nodes (getVertices)
  - Time Complexity: O(n) - Constructing the list of vertices requires visiting each entry in the HashMap once.
  - Space Complexity: O(n) - The constructed list of vertices will be proportional to the number of vertices in the graph.

- get neighbors
  - Time Complexity: O(1) - Since this operation is just a lookup in the HashMap, it's constant time.
  - Space Complexity: O(m) - The list of neighbors will be proportional to the number of edges connected to the given vertex.

- size
  - Time Complexity: O(1) - The size is kept track of as vertices are added/removed, so no computation needed.
  - Space Complexity: O(1) - This operation just returns the stored size, so no additional space is used.

## Solution

[Link to Vertex Class](lib/src/main/java/datastructures/graph/Vertex.java)

[Link to Edge Class](lib/src/main/java/datastructures/graph/Edge.java)

[Link to Graph Class](lib/src/main/java/datastructures/graph/Graph.java)

[Link to Graph Test Class](lib/src/test/java/datastructures/graph/GraphTest.java)





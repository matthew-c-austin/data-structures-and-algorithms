# Tree Intersection

## Features

Write a function that LEFT JOINs two hashmaps into a single data structure.

- Write a function called left join
- Arguments: two hash maps
  - The first parameter is a hashmap that has word strings as keys, and a synonym of the key as values.
  - The second parameter is a hashmap that has word strings as keys, and antonyms of the key as values.
- Return: The returned data structure that holds the results is up to you. It doesn’t need to exactly match the output below, so long as it achieves the LEFT JOIN logic
-
NOTES:

- Combine the key and corresponding values (if they exist) into a new data structure according to LEFT JOIN logic.
- LEFT JOIN means all the values in the first hashmap are returned, and if values exist in the “right” hashmap, they are appended to the result row.
- If no values exist in the right hashmap, then some flavor of NULL should be appended to the result row.

## Whiteboard Process

![Whiteboard Image](cc33.png)

## Approach & Efficiency

- The Big O time complexity for is O(n), as we have to traverse the entire key set of the synonyms map. This is the same for space complexity, as it is the same order as the synonyms map, even though we add one more value to each, at most.

## Solution

[Link to Tree Intersection Class](lib/src/main/java/codechallenges/LeftJoin.java)

[Link to Binary Tree Test](lib/src/test/java/codechallenges/LeftJoinTest.java)



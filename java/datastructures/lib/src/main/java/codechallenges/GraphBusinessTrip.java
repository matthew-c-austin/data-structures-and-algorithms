package codechallenges;

import datastructures.graph.*;

public class GraphBusinessTrip {

  public Integer businessTrip(Graph<String> graph, String[] cities) {
    int totalCost = 0;

    for (int i = 0; i < cities.length - 1; i++) {
      String currentCity = null;
      String nextCity = null;

      // Find vertices for cities[i] and cities[i+1]
      for (Vertex<String> vertex : graph.getVertices()) {
        if (vertex.value.equals(cities[i])) {
          currentCity = vertex.toString();
        } else if (vertex.value.equals(cities[i + 1])) {
          nextCity = vertex.toString();
        }
      }

      if (currentCity == null || nextCity == null) {
        // If any of the cities is not found in the graph
        return null;
      }

      // Find if there's a direct edge from currentCity to nextCity
      boolean foundDirectFlight = false;
      for (Edge<String> edge : graph.adjacencyLists.get(currentCity)) {
        if (edge.destination.equals(nextCity)) {
          totalCost += edge.weight;
          foundDirectFlight = true;
          break;
        }
      }

      if (!foundDirectFlight) {
        // If there's no direct flight to the next city
        return null;
      }
    }

    return totalCost;
  }

}

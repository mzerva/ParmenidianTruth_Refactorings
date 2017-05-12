package model;

import java.util.Map;

import edu.uci.ics.jung.graph.Graph;


public interface IGraphMetrics {
	
	Graph<String, String> getGraph();
	String generateVertexDegree(String vertex);
	String generateVertexInDegree(String vertex);
	String generateVertexOutDegree(String vertex);
	String generateVertexBetweenness(String vertex);
	String generateEdgeBetweenness(String edge);
	String getGraphDiameter();
	String getVertexCount();
	String getVertexCountForGcc();
	String getEdgeCount();
	String getEdgeCountForGcc();
	String getNumberOfConnectedComponents();
	Map<String,Double> getClusteringCoefficient();

}

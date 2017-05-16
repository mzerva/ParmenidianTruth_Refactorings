package model;

import java.util.ArrayList;

public class GraphMetricsFactory {
	
	
	private IGraphMetrics graphMetrics = null;
	
	
	public IGraphMetrics getGraphMetrics(ArrayList<Table> nodes, ArrayList<ForeignKey> edges){
		
		graphMetrics = new GraphMetrics(nodes,edges);
		return graphMetrics;
				
	}
	
	
}

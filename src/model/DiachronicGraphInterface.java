package model;

import java.awt.Component;
import java.io.IOException;
import java.util.ArrayList;

import edu.uci.ics.jung.visualization.VisualizationViewer;

public interface DiachronicGraphInterface {
	
	public void clear();
	
	public void setPickingMode();
	
	public void setTransformingMode();
	
	public void saveVertexCoordinates(String projectIni) throws IOException;
	
	public void stopConvergence();
	
	public String getTargetFolder();
	
	public void visualizeDiachronicGraph(VisualizationViewer< String, String> vv);
	
	public void visualizeIndividualDBVersions(VisualizationViewer< String, String> vv,String targetFolder,int edgeType);
	
	public VisualizationViewer show();
	
	public Component refresh(double forceMult, int repulsionRange);
	
	public ArrayList<Table> getNodes();
	
	public ArrayList<ForeignKey> getEdges();
	
	public ArrayList<DBVersion> getVersions();
	
	public IGraphMetrics getGraphMetrics();
}

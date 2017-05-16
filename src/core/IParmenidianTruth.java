package core;

import java.awt.Component;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import edu.uci.ics.jung.visualization.VisualizationViewer;
import parmenidianEnumerations.Metric_Enums;

public interface IParmenidianTruth {
	//modelManager
	public void clear();
	
	public String getTargetFolder();
	
	public void stopConvergence();
	
	public void saveVertexCoordinates(String projectIni) throws IOException;
	
	public void setTransformingMode();
	
	public void setPickingMode();
	
	public void visualize(VisualizationViewer< String, String> vv,String projectIni,String targetFolder,int edgeType) throws IOException;
	
	public Component loadProject(String sql,String xml,String graphml, double frameX,double frameY,double scaleX,double scaleY,double centerX,double centerY,String targetFolder,int edgeType) throws Exception;
	
	public Component refresh(double forceMult, int repulsionRange);
	
	public void generateMetricsReport(String targetFolder, ArrayList<Metric_Enums> metrics);
	
	//exportManager
	public void createTransitions(File selectedFile) throws Exception;
			
	public void createPowerPointPresentation(ArrayList<String> FileNames,String targetFolder,String projectName) throws FileNotFoundException, IOException;
	
	public void createVideo(File file) throws IOException;
}

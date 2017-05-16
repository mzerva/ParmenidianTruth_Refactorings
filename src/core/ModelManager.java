package core;


import java.awt.Component;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import edu.uci.ics.jung.visualization.VisualizationViewer;
import model.DiachronicGraph;
import model.DiachronicGraphFactory;
import model.IDiachronicGraph;
import model.IMetricsReport;
import model.ReportFactory;
import parmenidianEnumerations.Metric_Enums;

public class ModelManager {
	
	private IDiachronicGraph diachronicGraph=null; 
	private DiachronicGraphFactory factory = new DiachronicGraphFactory();

	
	public ModelManager(){}
	
	public void clear(){
		
		if(diachronicGraph!=null)		
			diachronicGraph.clear();
		
	}
	
	public String getTargetFolder(){
		
		return diachronicGraph.getTargetFolder();
		
	}
	
	public void stopConvergence(){
		
		diachronicGraph.stopConvergence();
		
	}
	
	public void saveVertexCoordinates(String projectIni) throws IOException{
		
		diachronicGraph.saveVertexCoordinates(projectIni);
		
	}
	
	public void setTransformingMode(){
		
		diachronicGraph.setTransformingMode();
		
	}
	
	public void setPickingMode(){
		
		diachronicGraph.setPickingMode();
		
	}
	
	
	public void visualize(VisualizationViewer< String, String> visualizationViewer,String projectIni,String targetFolder,int edgeType) throws IOException {
			
		diachronicGraph.saveVertexCoordinates(projectIni);
		diachronicGraph.visualizeIndividualDBVersions(visualizationViewer,targetFolder,edgeType);
		diachronicGraph.visualizeDiachronicGraph(visualizationViewer);

	}
	
	public Component loadProject(String sql,String xml,String graphml, double frameX,double frameY,double scaleX,double scaleY,double centerX,double centerY,String targetFolder,int edgeType) throws Exception{
		
		diachronicGraph=factory.getDiachronicGraph(sql, xml, graphml, frameX, frameY, scaleX, scaleY, centerX, centerY, targetFolder, edgeType);
		
		return diachronicGraph.show();
		
	}

	public Component refresh(double forceMult, int repulsionRange) {
		
		return diachronicGraph.refresh(forceMult,repulsionRange);
		
	}

//created by KD on 13/04/17
	public void generateMetricsReport(String targetFolder, ArrayList<Metric_Enums> metrics){
		
		ReportFactory reportFactory = new ReportFactory();
		ArrayList<IMetricsReport> reportEngine = new ArrayList<IMetricsReport>();
		
		for(int i=0;i<metrics.size();i++){

			reportEngine.add(reportFactory.getMetricsReportEngine(targetFolder, metrics.get(i),diachronicGraph));
			reportEngine.get(i).generateMetricsReport();
		

				
		}
		
		reportEngine.clear();
		
	}

}

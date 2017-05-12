package core;


import java.awt.Component;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import edu.uci.ics.jung.visualization.VisualizationViewer;
import model.DiachronicGraph;
import model.DiachronicGraphFactory;
import model.DiachronicGraphInterface;
import model.MetricsReportInterface;
import model.ReportFactory;
import parmenidianEnumerations.Metric_Enums;

public class ModelManager {
	
	private DiachronicGraphInterface diachronicGraph=null; 
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
	
	
	public void visualize(VisualizationViewer< String, String> vv,String projectIni,String targetFolder,int edgeType) throws IOException {
			
		diachronicGraph.saveVertexCoordinates(projectIni);
		diachronicGraph.visualizeIndividualDBVersions(vv,targetFolder,edgeType);
		diachronicGraph.visualizeDiachronicGraph(vv);

	}
	
	public Component loadProject(String sql,String xml,String graphml, double frameX,double frameY,double scaleX,double scaleY,double centerX,double centerY,String targetFolder,int edgeType) throws Exception{
		
		diachronicGraph=factory.getDiachronicGraph(sql, xml, graphml, frameX, frameY, scaleX, scaleY, centerX, centerY, targetFolder, edgeType);
		
		return diachronicGraph.show();
		
	}

//KD on 14/04/17
//	public void generateVertexDegreeReport(String targetFolder) throws FileNotFoundException{
//		
//		diachronicGraph.generateVertexDegreeReport(targetFolder);
//		
//	}
//	
//	public void generateVertexInDegreeReport(String targetFolder) throws FileNotFoundException{
//		
//		diachronicGraph.generateVertexInDegreeReport(targetFolder);
//		
//	}
	
//	public void generateVertexOutDegreeReport(String targetFolder) throws FileNotFoundException{
//		
//		diachronicGraph.generateVertexOutDegreeReport(targetFolder);
//		
//	}
//	
//	public void generateVertexBetweennessReport(String targetFolder) throws FileNotFoundException{
//		
//		diachronicGraph.generateVertexBetweennessReport(targetFolder);
//		
//	}
//	
//	public void generateEdgeBetweennessReport(String targetFolder) throws FileNotFoundException{
//		
//		diachronicGraph.generateEdgeBetweennessReport(targetFolder);
//		
//	}
//	
//	public void generateGraphDiameterReport(String targetFolder) throws FileNotFoundException{
//		
//		diachronicGraph.generateGraphDiameterReport(targetFolder);
//		
//	}
//	
//	public void generateVertexCountReport(String targetFolder) throws FileNotFoundException{
//		
//		diachronicGraph.generateVertexCountReport(targetFolder);
//		
//	}
//	
//	public void generateEdgeCountReport(String targetFolder) throws FileNotFoundException{
//		
//		diachronicGraph.generateEdgeCountReport(targetFolder);
//		
//	}

	public Component refresh(double forceMult, int repulsionRange) {
		
		return diachronicGraph.refresh(forceMult,repulsionRange);
		
	}
	
//KD on 14/04/17
//	public void generateConnectedComponentsCountReport(String targetFolder) throws FileNotFoundException{
//		
//		diachronicGraph.generateConnectedComponentsCountReport(targetFolder);
//
//	}
//	
//	public void generateClusteringCoefficientReport(String targetFolder) throws FileNotFoundException{
//		
//		diachronicGraph.generateClusteringCoefficientReport(targetFolder);
//		
//	}
//
//	public void generateVertexCountReportForGCC(String targetFolder) throws FileNotFoundException {
//		
//		diachronicGraph.generateVertexCountReportForGcc(targetFolder);
//		
//	}
//
//	public void generateEdgeCountReportForGCC(String targetFolder) throws FileNotFoundException {
//		
//		diachronicGraph.generateEdgeCountReportForGcc(targetFolder);
		
//	}

//created by KD on 13/04/17
	public void generateMetricsReport(String targetFolder, ArrayList<Metric_Enums> metrics){
		
		ReportFactory reportFactory = new ReportFactory();
		ArrayList<MetricsReportInterface> reportEngine = new ArrayList<MetricsReportInterface>();
		
		for(int i=0;i<metrics.size();i++){

			reportEngine.add(reportFactory.getMetricsReportEngine(targetFolder, metrics.get(i),diachronicGraph));
			reportEngine.get(i).generateMetricsReport();
		

				
		}
		
		reportEngine.clear();
		
	}

}

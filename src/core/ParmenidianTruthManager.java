package core;

import java.awt.Component;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import parmenidianEnumerations.Metric_Enums;
import edu.uci.ics.jung.visualization.VisualizationViewer;

public class ParmenidianTruthManager implements IParmenidianTruth{
	
	private ModelManager modelManager;
	private ExportManager exportManager;
	
	public ParmenidianTruthManager(){
		
		
		modelManager = new ModelManager();
		exportManager = new ExportManager();
		
	}
	
	public void clear(){
		
		modelManager.clear();
	}
	
	public String getTargetFolder(){
		
		return modelManager.getTargetFolder();
		
	}
	
	public void stopConvergence(){
		
		modelManager.stopConvergence();
		
	}
	
	public void saveVertexCoordinates(String projectIni) throws IOException{
		
		modelManager.saveVertexCoordinates(projectIni);
		
	}
	
	public void setTransformingMode(){
		
		modelManager.setTransformingMode();
		
	}
	
	public void setPickingMode(){
		
		modelManager.setPickingMode();
		
	}
	
	public void visualize(VisualizationViewer< String, String> visualizationViewer,String projectIni,String targetFolder,int edgeType) throws IOException {
		
		modelManager.visualize(visualizationViewer,projectIni, targetFolder, edgeType);
	}
	
	public Component loadProject(String sql,String xml,String graphml, double frameX,double frameY,double scaleX,double scaleY,double centerX,double centerY,String targetFolder,int edgeType) throws Exception{
		
		return modelManager.loadProject( sql, xml, graphml,  frameX, frameY, scaleX, scaleY, centerX, centerY, targetFolder, edgeType);
		
	}
	
	public void createTransitions(File fileSelected) throws Exception{
		
		exportManager.createTransitions(fileSelected);
		
	}
			
	public void createPowerPointPresentation(ArrayList<String> fileNames,String targetFolder,String projectName) throws FileNotFoundException, IOException{
		
		exportManager.createPowerPointPresentation(fileNames, targetFolder, projectName);
		
	}
	
	public void createVideo(File file) throws IOException{
		
		exportManager.createVideo(file);
	}
	


	public Component refresh(double forceMult, int repulsionRange) {
		
		return modelManager.refresh(forceMult,repulsionRange);
	}
	
//created by KD on 13/04/17
		public void generateMetricsReport(String targetFolder, ArrayList<Metric_Enums> metrics){
			
			try{
				
				modelManager.generateMetricsReport(targetFolder, metrics);
				
			}catch(Exception e){
				
				System.out.println(e.getClass());
				
			}
			
		}
	
}
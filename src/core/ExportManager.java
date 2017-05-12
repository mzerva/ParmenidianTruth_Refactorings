package core;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import hecateExport.HecateScript;
import powerpointExport.PowerPointGenerator;
import videoExport.VideoGenerator;

public class ExportManager {
	
	public ExportManager(){}
	
	public void createTransitions(File file) throws Exception{
		
		HecateScript hecate= new HecateScript(file);
		hecate.createTransitions();
		hecate=null;
		
	}
	
	public void createPowerPointPresentation(ArrayList<String> FileNames,String targetFolder,String projectName) throws FileNotFoundException, IOException{
		
		
		PowerPointGenerator pptx=new PowerPointGenerator(targetFolder,projectName);			
		pptx.createPresentation(FileNames);
		pptx=null;

		
	}
	
	public void createVideo(File file) throws IOException{
		
		VideoGenerator vg = new VideoGenerator(file);
		vg.exportToVideo();
		vg=null;
		
	}
	


}

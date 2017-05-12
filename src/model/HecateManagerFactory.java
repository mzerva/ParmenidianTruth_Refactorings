package model;

public class HecateManagerFactory {
	private HecateManagerInterface hm = new HecateManager();
	
	public HecateManagerInterface getHecateManager(){
		 return hm;
	}
}

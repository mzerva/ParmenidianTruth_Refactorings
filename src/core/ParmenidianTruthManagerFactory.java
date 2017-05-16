package core;

public class ParmenidianTruthManagerFactory {
	private IParmenidianTruth manager = new ParmenidianTruthManager();
	
	public IParmenidianTruth getManager(){
		return manager;
	}
	

}

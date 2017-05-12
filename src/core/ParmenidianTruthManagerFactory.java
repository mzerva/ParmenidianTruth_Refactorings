package core;

public class ParmenidianTruthManagerFactory {
	private ParmenidianTruthInterface manager = new ParmenidianTruthManager();
	
	public ParmenidianTruthInterface getManager(){
		return manager;
	}
	

}

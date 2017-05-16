package model;

public interface IMetricsReport {
	
	public void generateMetricsReport();
	
	public void createCsvFile();
	
	public abstract void populateArray();
	
	public void printArrayIntoFile();
	
	public String[][] getReport();
	
}

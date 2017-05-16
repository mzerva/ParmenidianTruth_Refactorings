package model;

public class DiachronicGraphFactory {
	private IDiachronicGraph dg = null;
	
	public IDiachronicGraph getDiachronicGraph(String sql,String xml,String graphml, double frameX,double frameY,double scaleX,double scaleY,double centerX,double centerY,String targetFolder,int edgeType) throws Exception{
		dg = new DiachronicGraph(sql,xml,graphml,targetFolder,edgeType,frameX,frameY,scaleX,scaleY,centerX,centerY);
		return dg;
	}
	
	

}

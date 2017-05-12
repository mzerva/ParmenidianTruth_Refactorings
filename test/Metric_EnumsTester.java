

import java.util.EnumSet;

import junit.framework.TestCase;
import parmenidianEnumerations.Metric_Enums;

public class Metric_EnumsTester extends TestCase {
	
	
	//private static Metric_Enums MetricEnums = Metric_Enums.VERTEX_DEGREE;
	
	
	public static void main(String[] args){
		
	EnumSet<Metric_Enums> set1 = EnumSet.of(Metric_Enums.VERTEX_DEGREE,Metric_Enums.VERTEX_OUT_DEGREE);
	EnumSet<Metric_Enums> set2 = EnumSet.complementOf(set1);
			//EnumSet.allOf(Metric_Enums.class);
	System.out.println(set1);
	System.out.print(set2);
	/*	for (Metric_Enums m : Metric_Enums.values()){
			
			if (m.)
			System.out.print(m.name()+" ");
			System.out.println(m.ordinal());
		}*/
		
		
	}
	

}

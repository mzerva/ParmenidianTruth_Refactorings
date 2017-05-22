import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mockito;

import model.GraphMetricsPopulation;
import model.DiachronicGraph;
import parmenidianEnumerations.Metric_Enums;

public class GraphMetricsPopulationTest {
	private static DiachronicGraph diag;
	private static Metric_Enums metric;
	private static GraphMetricsPopulation graphArray;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		//diag = Mockito.mock(DiachronicGraph.class);
		diag = new DiachronicGraph("C:\\Users\\mzerva\\Documents\\PV_Master\\EvolutionDatasets-master\\CERN\\Atlas\\processed schemata" , "C:\\Users\\mzerva\\Documents\\PV_Master\\EvolutionDatasets-master\\CERN\\Atlas\\results\\transitions.xml" , null , "C:\\Users\\mzerva\\Desktop\\Parmenidis_Output" , 0 , 0.0 , 0.0 , 0.0 , 0.0 , 0.0 , 0.0);
		metric=Metric_Enums.CLUSTERING_COEFFICIENT;
		graphArray = new GraphMetricsPopulation("C:\\Users\\mzerva\\Desktop\\Parmenidis_Output\\tests",metric,diag);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testPopulateArray(){
	}

	@Test
	public void testArrayPopulationForGraphMetrics() {
		//tested on MetricsReportEngine
	}

	@Test
	public void testGetDiachronicGraphMetricValue() {
		assertNotNull("DiachronicGraphMetricValue not null", graphArray.getDiachronicGraphMetricValue(metric.name()));
	}

	@Test
	public void testGetVersionMetricValue() {
		assertNotNull("VersionMetricValue not null", graphArray.getVersionMetricValue(metric.name(),1));	
	}

}

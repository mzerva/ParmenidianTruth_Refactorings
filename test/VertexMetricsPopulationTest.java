import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import model.VertexMetricsPopulation;
import model.DiachronicGraph;
import parmenidianEnumerations.Metric_Enums;

public class VertexMetricsPopulationTest {
	private static DiachronicGraph diag;
	private static Metric_Enums metric;
	private static VertexMetricsPopulation vertexArray;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		//diag = Mockito.mock(DiachronicGraph.class);
		diag = new DiachronicGraph("C:\\Users\\mzerva\\Documents\\PV_Master\\EvolutionDatasets-master\\CERN\\Atlas\\processed schemata" , "C:\\Users\\mzerva\\Documents\\PV_Master\\EvolutionDatasets-master\\CERN\\Atlas\\results\\transitions.xml" , null , "C:\\Users\\mzerva\\Desktop\\Parmenidis_Output" , 0 , 0.0 , 0.0 , 0.0 , 0.0 , 0.0 , 0.0);
		metric=Metric_Enums.CLUSTERING_COEFFICIENT;
		vertexArray = new VertexMetricsPopulation("C:\\Users\\mzerva\\Desktop\\Parmenidis_Output\\tests",metric,diag);
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
	public void testArrayPopulationForVertexMetrics() {
		//tested on MetricsReportEngine
	}

	@Test
	public void testGetDiachronicGraphMetricValue() {
		String tablename="";
		assertNotNull("DiachronicGraphMetricValue not null", vertexArray.getDiachronicGraphMetricValue(metric.name(),tablename));
	}

	@Test
	public void testGetVersionMetricValue() {
		String tablename="";
		assertNotNull("VersionMetricValue not null", vertexArray.getVersionMetricValue(metric.name(),1,tablename));
	}

}

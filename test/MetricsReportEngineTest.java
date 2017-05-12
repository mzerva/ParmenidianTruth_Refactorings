import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mockito;

import model.ArrayPopulationForGraphMetrics;
import model.ArrayPopulationForVertexMetrics;
import model.DiachronicGraph;
import model.ReportFactory;
import parmenidianEnumerations.Metric_Enums;

public class MetricsReportEngineTest {
	private static ArrayPopulationForGraphMetrics graphReport;
	private static ArrayPopulationForVertexMetrics vertexReport;
	private static DiachronicGraph diag;
	private static Metric_Enums metric;
	private static ArrayPopulationForGraphMetrics spyGraph;
	private static ArrayPopulationForVertexMetrics spyVertex;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		//graphReport=Mockito.mock(ArrayPopulationForGraphMetrics.class);
		//vertexReport=Mockito.mock(ArrayPopulationForVertexMetrics.class);
		//diag = Mockito.mock(DiachronicGraph.class);
		diag = new DiachronicGraph("C:\\Users\\mzerva\\Documents\\PV_Master\\EvolutionDatasets-master\\CERN\\Atlas\\processed schemata" , "C:\\Users\\mzerva\\Documents\\PV_Master\\EvolutionDatasets-master\\CERN\\Atlas\\results\\transitions.xml" , null , "C:\\Users\\mzerva\\Desktop\\Parmenidis_Output" , 0 , 0.0 , 0.0 , 0.0 , 0.0 , 0.0 , 0.0);
		metric=Metric_Enums.CLUSTERING_COEFFICIENT;
		graphReport = new ArrayPopulationForGraphMetrics("C:\\Users\\mzerva\\Desktop\\Parmenidis_Output\\tests",metric, diag);
		vertexReport = new ArrayPopulationForVertexMetrics("C:\\Users\\mzerva\\Desktop\\Parmenidis_Output\\tests",metric, diag);
		spyGraph = Mockito.spy(graphReport);
		spyVertex = Mockito.spy(vertexReport);
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
	public void testGenerateMetricsReport() {
		assertNull("graph report array is not filled", spyGraph.getReport());
		assertNull("vertex report array is not filled", spyVertex.getReport());
		spyGraph.generateMetricsReport();
		spyVertex.generateMetricsReport();
		assertNotNull("graph report array filled", spyGraph.getReport());
		assertNotNull("vertex report array filled", spyVertex.getReport());
	}

	@Test
	public void testCreateCsvFile() {
		//just opens a file
	}

	@Test
	public void testPopulateArray() {
		//abstract
	}

	@Test
	public void testPrintArrayIntoFile() {
		//just writes the array content to the file
	}

}

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import model.DiachronicGraph;

public class DiachronicGraphTest {
	private static DiachronicGraph dg; 
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		dg = new DiachronicGraph("C:\\Users\\mzerva\\Documents\\PV_Master\\EvolutionDatasets-master\\CERN\\Atlas\\processed schemata" , "C:\\Users\\mzerva\\Documents\\PV_Master\\EvolutionDatasets-master\\CERN\\Atlas\\results\\transitions.xml" , null , "C:\\Users\\mzerva\\Desktop\\Parmenidis_Output" , 0 , 0.0 , 0.0 , 0.0 , 0.0 , 0.0 , 0.0);
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
	public void testDiachronicGraph() {
		assertNotNull("After setup, diachronic graph is not null", dg);
	}

	@Test
	public void testGetNodes() {
		assertNotNull("Nodes are not null", dg.getNodes());
	}

	@Test
	public void testGetEdges() {
		assertNotNull("Edges are not null", dg.getEdges());
	}

	@Test
	public void testGetDictionaryOfGraph() {
		assertNotNull("dictionary of graph not null", dg.getDictionaryOfGraph());
	}

	@Test
	public void testGetVersion() {
		assertNotNull("version not null", dg.getVersion());
	}

	@Test
	public void testGetTargetFolder() {
		assertNotNull("target folder not null", dg.getTargetFolder());
	}

	@Test
	public void testGetUniversalFrame() {
		assertNotNull("universal frame not null", dg.getUniversalFrame());
	}

	@Test
	public void testGetUniversalCenter() {
		assertNotNull("universal center not null", dg.getUniversalCenter());
	}

	@Test
	public void testGetScaleX() {
		assertNotNull("scaleX not null", dg.getScaleX());
	}

	@Test
	public void testGetScaleY() {
		assertNotNull("scaleY not null", dg.getScaleY());
	}

	@Test
	public void testGetFrameX() {
		assertNotNull("frameX not null", dg.getFrameX());
	}

	@Test
	public void testGetFrameY() {
		assertNotNull("frameY not null", dg.getFrameY());
	}

	@Test
	public void testGetGraph() {
		assertNotNull("graph not null", dg.getGraph());
	}

	@Test
	public void testGetUniversalBounds() {
		assertNotNull("universal bounds not null", dg.getUniversalBounds());
	}

	@Test
	public void testGetVersions() {
		assertNotNull("versions not null", dg.getVersions());
	}

	@Test
	public void testGetGraphMetrics() {
		assertNotNull("GraphMetrics not null", dg.getGraphMetrics());
	}

}

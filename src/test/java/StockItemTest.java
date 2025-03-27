package ee.ut.math.tvt.salessystem.dataobjects;

import org.junit.Test;
import static org.junit.Assert.*;

public class StockItemTest {

	@Test(timeout = 4000)
	public void testGetId() throws Throwable {
	    StockItem stockItem0 = new StockItem();
	    Long long0 = stockItem0.getId();
	    assertNull(long0);
	}

	@Test(timeout = 4000)
	public void testSetId() throws Throwable {
	    Long long0 = new Long(0L);
	    StockItem stockItem0 = new StockItem(long0, (String) null, (String) null, 0.0, 1);
	    stockItem0.setId(long0);
	    assertEquals(1, stockItem0.getQuantity());
	    assertEquals(0.0, stockItem0.getPrice(), 0.01);
	}

	@Test(timeout = 4000)
	public void testGetName() throws Throwable {
	    StockItem stockItem0 = new StockItem();
	    String string0 = stockItem0.getName();
	    assertNull(string0);
	}

	@Test(timeout = 4000)
	public void testToString() throws Throwable {
	    StockItem stockItem0 = new StockItem();
	    String string0 = stockItem0.toString();
	    assertEquals("StockItem{id=null, name='null'}", string0);
	}

	@Test(timeout = 4000)
	public void testGetPrice() throws Throwable {
	    StockItem stockItem0 = new StockItem();
	    double double0 = stockItem0.getPrice();
	    assertEquals(0.0, double0, 0.01);
	}

	@Test(timeout = 4000)
	public void testSetDescription() throws Throwable {
	    StockItem stockItem0 = new StockItem((Long) null, "", "", 0.0, 1214);
	    stockItem0.setDescription("");
	    assertEquals(1214, stockItem0.getQuantity());
	    assertEquals(0.0, stockItem0.getPrice(), 0.01);
	}

	@Test(timeout = 4000)
	public void testSetPrice() throws Throwable {
	    StockItem stockItem0 = new StockItem();
	    stockItem0.setPrice((-1827.815854999749));
	    assertEquals((-1827.815854999749), stockItem0.getPrice(), 0.01);
	}

	@Test(timeout = 4000)
	public void testSetQuantity() throws Throwable {
	    StockItem stockItem0 = new StockItem();
	    stockItem0.setQuantity((-4490));
	    assertEquals((-4490), stockItem0.getQuantity());
	}

	@Test(timeout = 4000)
	public void testGetDescription() throws Throwable {
	    StockItem stockItem0 = new StockItem();
	    String string0 = stockItem0.getDescription();
	    assertNull(string0);
	}

	@Test(timeout = 4000)
	public void testSetName() throws Throwable {
	    StockItem stockItem0 = new StockItem();
	    stockItem0.setName("v*4frP'!$t.");
	    assertEquals(0.0, stockItem0.getPrice(), 0.01);
	}

	@Test(timeout = 4000)
	public void testGetQuantity() throws Throwable {
	    StockItem stockItem0 = new StockItem();
	    int int0 = stockItem0.getQuantity();
	    assertEquals(0, int0);
	}

}
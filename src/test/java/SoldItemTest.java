package ee.ut.math.tvt.salessystem.dataobjects;

import org.junit.Test;
import static org.junit.Assert.*;
import ee.ut.math.tvt.salessystem.dataobjects.StockItem;

public class SoldItemTest {

	@Test(timeout = 4000)
	public void testGetId() throws Throwable {
	    SoldItem soldItem0 = new SoldItem();
	    Long long0 = soldItem0.getId();
	    assertNull(long0);
	}

	@Test(timeout = 4000)
	public void testSetId() throws Throwable {
	    SoldItem soldItem0 = new SoldItem();
	    Long long0 = new Long((-1L));
	    soldItem0.setId(long0);
	    assertEquals((-1L), (long) soldItem0.getId());
	}

	@Test(timeout = 4000)
	public void testGetName() throws Throwable {
	    StockItem stockItem0 = new StockItem();
	    SoldItem soldItem0 = new SoldItem(stockItem0, (-1092));
	    soldItem0.getName();
	    assertEquals((-1092), (int) soldItem0.getQuantity());
	}

	@Test(timeout = 4000)
	public void testGetPrice() throws Throwable {
	    StockItem stockItem0 = new StockItem();
	    SoldItem soldItem0 = new SoldItem(stockItem0, (-1092));
	    double double0 = soldItem0.getPrice();
	    assertEquals((-1092), (int) soldItem0.getQuantity());
	    assertEquals(0.0, double0, 0.01);
	}

	@Test(timeout = 4000)
	public void testToString() throws Throwable {
	    StockItem stockItem0 = new StockItem();
	    SoldItem soldItem0 = new SoldItem(stockItem0, (-1092));
	    String string0 = soldItem0.toString();
	    assertEquals((-1092), (int) soldItem0.getQuantity());
	    assertEquals("SoldItem{id=null, name='null'}", string0);
	}

	@Test(timeout = 4000)
	public void testGetStockItem() throws Throwable {
	    SoldItem soldItem0 = new SoldItem();
	    StockItem stockItem0 = soldItem0.getStockItem();
	    assertNull(stockItem0);
	}

	@Test(timeout = 4000)
	public void testSetPrice() throws Throwable {
	    SoldItem soldItem0 = new SoldItem();
	    soldItem0.setPrice(0);
	    assertEquals(0.0, soldItem0.getPrice(), 0.01);
	}

	@Test(timeout = 4000)
	public void testSetQuantity() throws Throwable {
	    SoldItem soldItem0 = new SoldItem();
	    Integer integer0 = new Integer(0);
	    soldItem0.setQuantity(integer0);
	    assertEquals(0, (int) soldItem0.getQuantity());
	}

	@Test(timeout = 4000)
	public void testGetSum() throws Throwable {
	    SoldItem soldItem0 = new SoldItem();
	    // Undeclared exception!
	    soldItem0.getSum();
	}

	@Test(timeout = 4000)
	public void testSetName() throws Throwable {
	    SoldItem soldItem0 = new SoldItem();
	    soldItem0.setName("wzO>X&j=RH;&8_o2w1");
	    assertNull(soldItem0.getQuantity());
	}

	@Test(timeout = 4000)
	public void testGetQuantity() throws Throwable {
	    StockItem stockItem0 = new StockItem();
	    SoldItem soldItem0 = new SoldItem(stockItem0, (-1092));
	    Integer integer0 = soldItem0.getQuantity();
	    assertEquals((-1092), (int) integer0);
	}

	@Test(timeout = 4000)
	public void testSetStockItem() throws Throwable {
	    SoldItem soldItem0 = new SoldItem();
	    StockItem stockItem0 = new StockItem();
	    soldItem0.setStockItem(stockItem0);
	    assertNull(soldItem0.getId());
	}

}
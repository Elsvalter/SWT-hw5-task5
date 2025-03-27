package ee.ut.math.tvt.salessystem.dao;

import org.junit.Test;
import static org.junit.Assert.*;
import ee.ut.math.tvt.salessystem.dataobjects.SoldItem;
import ee.ut.math.tvt.salessystem.dataobjects.StockItem;
import java.util.List;

public class InMemoryDAOTest {

	@Test(timeout = 4000)
	public void testBeginTransaction() throws Throwable {
	    InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new InMemorySalesSystemDAO();
	    inMemorySalesSystemDAO0.beginTransaction();
	}

	@Test(timeout = 4000)
	public void testRollbackTransaction() throws Throwable {
	    InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new InMemorySalesSystemDAO();
	    inMemorySalesSystemDAO0.rollbackTransaction();
	}

	@Test(timeout = 4000)
	public void testCommitTransaction() throws Throwable {
	    InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new InMemorySalesSystemDAO();
	    inMemorySalesSystemDAO0.commitTransaction();
	}

	@Test(timeout = 4000)
	public void testFindStockItemReturningStockItemWhereGetPriceIsPositive() throws Throwable {
	    InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new InMemorySalesSystemDAO();
	    StockItem stockItem0 = inMemorySalesSystemDAO0.findStockItem(3L);
	    assertNotNull(stockItem0);
	    assertEquals("Frankfurters", stockItem0.getName());
	    assertEquals("Beer sauseges", stockItem0.getDescription());
	    assertEquals(12, stockItem0.getQuantity());
	    assertEquals(15.0, stockItem0.getPrice(), 0.01);
	}

	@Test(timeout = 4000)
	public void testFindStockItems() throws Throwable {
	    InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new InMemorySalesSystemDAO();
	    List<StockItem> list0 = inMemorySalesSystemDAO0.findStockItems();
	    assertFalse(list0.isEmpty());
	}

	@Test(timeout = 4000)
	public void testSaveStockItem() throws Throwable {
	    InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new InMemorySalesSystemDAO();
	    inMemorySalesSystemDAO0.saveStockItem((StockItem) null);
	}

	@Test(timeout = 4000)
	public void testFindStockItemReturningNull() throws Throwable {
	    InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new InMemorySalesSystemDAO();
	    StockItem stockItem0 = inMemorySalesSystemDAO0.findStockItem(1045L);
	    assertNull(stockItem0);
	}

	@Test(timeout = 4000)
	public void testSaveSoldItem() throws Throwable {
	    InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new InMemorySalesSystemDAO();
	    StockItem stockItem0 = new StockItem();
	    SoldItem soldItem0 = new SoldItem(stockItem0, 0);
	    inMemorySalesSystemDAO0.saveSoldItem(soldItem0);
	    assertNull(soldItem0.getId());
	}

}
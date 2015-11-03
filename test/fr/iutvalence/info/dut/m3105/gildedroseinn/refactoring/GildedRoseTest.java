package fr.iutvalence.info.dut.m3105.gildedroseinn.refactoring;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GildedRoseTest
{
	@Test
	public void dailyUptateItemTest()
	{
		Item item_test = new Item("Aged Brie", 2, 5);
		GildedRose.updateItem(item_test);
		assertEquals(item_test.getSellIn(), 1);
		assertEquals(item_test.getQuality(), 4);
	}
	
	@Test
	public void UptateItemInFunctionOfSellinTest()
	{
		Item item_test = new Item("Aged Brie", -1, 5);
		GildedRose.updateItem(item_test);
		assertEquals(item_test.getSellIn(), -2);
		assertEquals(item_test.getQuality(), 3);		
	}
	
	@Test
	public void UptateItemInFunctionOfQualityTest()
	{
		Item item_test = new Item("Aged Brie", -1, -5);
		GildedRose.updateItem(item_test);
		assertEquals(item_test.getSellIn(), -2);
		assertEquals(item_test.getQuality(), 0);		
	}

}
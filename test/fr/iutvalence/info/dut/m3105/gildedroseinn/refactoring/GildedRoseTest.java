package fr.iutvalence.info.dut.m3105.gildedroseinn.refactoring;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GildedRoseTest
{
	
	public void UpdateItemtest(Item item_test, int sellin, int quality) {
		GildedRose.updateItem(item_test);
		assertEquals(item_test.getSellIn(), sellin);
		assertEquals(item_test.getQuality(), quality);		
	}
	
	@Test
	public void dailyUptateItemTest()
	{
		Item item_test = new Item("Object", 2, 5);
		UpdateItemtest(item_test, 1, 4);
	}
	
	@Test
	public void UptateItemInFunctionOfSellinTest()
	{
		Item item_test = new Item("Object", -1, 5);
		UpdateItemtest(item_test, -2, 3);	}
	
	@Test
	public void UptateItemInFunctionOfQualityTest()
	{
		Item item_test = new Item("Object", -1, -5);
		UpdateItemtest(item_test, -2, 0);		}

	@Test
	public void UptateAgedBrieTest()
	{
		Item item_test = new Item("Aged Brie", 2, 0);
		UpdateItemtest(item_test, 1, 1);	}

}
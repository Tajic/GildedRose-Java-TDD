	package fr.iutvalence.info.dut.m3105.gildedroseinn.refactoring;

import java.util.List;

public class GildedRose
{

	/*
	 * The code below is intended to help writing test fixtures
	 * 
	 * items = new ArrayList<Item>(); 
	 * items.add(new Item("+5 Dexterity Vest", 10, 20)); 
	 * items.add(new Item("Aged Brie", 2, 0)); 
	 * items.add(new Item("Elixir of the Mongoose", 5, 7)); 
	 * items.add(new Item("Sulfuras, Hand of Ragnaros", 0, 80)); 
	 * items.add(new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20)); 
	 * items.add(new Item("Conjured Mana Cake", 3, 6));
	 */

	public static void updateItems(List<Item> items)
	{
		for (int indexInItemList = 0; indexInItemList < items.size(); indexInItemList++)
			updateItem(items.get(indexInItemList));
	}

	public static void updateItem(Item updatedItem)
	{
	
	String nameOfUpdatedItem = updatedItem.getName();
	int qualityOfUpdatedItem = updatedItem.getQuality();
	int sellInOfUpdatedItem = updatedItem.getSellIn();
	
	if(sellInOfUpdatedItem < 0) 
	{
		 updatedItem.setSellIn(sellInOfUpdatedItem-1);
		 updatedItem.setQuality(qualityOfUpdatedItem-2); 
	}
	else 
	{
		updatedItem.setSellIn(sellInOfUpdatedItem-1);
		updatedItem.setQuality(qualityOfUpdatedItem-1);
	} 
	
	if(qualityOfUpdatedItem < 0)
	{
		updatedItem.setQuality(0);
	}
	
	
	switch(nameOfUpdatedItem) {
	
	case "Aged Brie":
		updatedItem.setQuality(qualityOfUpdatedItem+1);
	break;
	
	
	}
		
	
	}

}

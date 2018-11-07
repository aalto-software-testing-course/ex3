package com.gildedrose;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GildedRoseTest {

	@Test
	public void TestSomething() {
		GildedRose app = checkItem("Any", 0, 0);
		assertEquals(0, app.items[0].quality);
	}

	public GildedRose checkItem(String item, Integer sellin, Integer quality) {
		Item[] items = new Item[] { new Item(item, sellin, quality) };
		GildedRose app = new GildedRose(items);
		app.updateQuality();
		return app;
	}

}

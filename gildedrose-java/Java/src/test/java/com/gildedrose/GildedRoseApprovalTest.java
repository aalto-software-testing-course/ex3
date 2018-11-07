package com.gildedrose;

import org.approvaltests.combinations.CombinationApprovals;

import junit.framework.TestCase;

public class GildedRoseApprovalTest extends TestCase {

	public void testSomething() throws Exception {
		String[] items = { "Any" };
		Integer[] sellins = { 0, 10, 42, 100 };
		Integer[] qualities = { 0, 50, 55 };
		CombinationApprovals.verifyAllCombinations(this::checkItem, items, sellins, qualities);
	}

	public Item checkItem(String item, Integer sellin, Integer quality) {
		Item[] items = new Item[] { new Item(item, sellin, quality) };
		GildedRose app = new GildedRose(items);
		app.updateQuality();
		return items[0];
	}

}
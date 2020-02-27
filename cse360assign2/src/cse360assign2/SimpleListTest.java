package cse360assign2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import cse360assign2.SimpleList;

class SimpleListTest {

	/*
	@Test
	void testSimpleList() {
		fail("Not yet implemented");
	}
	*/

	@Test
	void testAdd() {
		SimpleList list = new SimpleList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);
		list.add(44);
		list.add(55);
		//Uses the toString to check if the values in order
		String result = list.toString();
		assertEquals("55 44 10 9 8 7 6 5 4 3 2 1", result);
	}
	
	
	@Test
	void testRemove() {
		SimpleList list = new SimpleList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.remove(7);
		list.remove(2);
		String result = list.toString();
		assertEquals("6 5 4 3 1", result);
	}
	
	@Test
	void testRemoveSize() {
		SimpleList list = new SimpleList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.remove(7);
		int value = list.size();
		assertEquals(value, 7);
	}

	
	@Test
	void testCount() {
		SimpleList list = new SimpleList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);
		list.add(44);
		list.add(55);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);
		list.add(44);
		list.add(55);
		assertEquals(24,list.count());
	}

	@Test
	void testToString() {
		SimpleList list = new SimpleList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);
		list.add(44);
		list.add(55);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);
		list.add(44);
		list.add(55);
		//Uses the toString to check if the values in order
		String result = list.toString();
		assertEquals("55 44 10 9 8 7 6 5 4 3 2 1 55 44 10 9 8 7 6 5 4 3 2 1", result);
	}

	
	@Test
	void testSearch() {
		SimpleList list = new SimpleList();
		list.add(14);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);
		list.add(44);
		list.add(55);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);
		list.add(44);
		list.add(55);
		assertEquals(list.search(14),24);
		
	}

	@Test
	void testAppend() {
		SimpleList list = new SimpleList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);
		list.append(69);
		//Uses the toString to check if the values in order
		String result = list.toString();
		assertEquals("10 9 8 7 6 5 4 3 2 1 69", result);
	}

	@Test
	void testFirst() {
		SimpleList list = new SimpleList();
		list.add(55);
		assertEquals(list.first(), 55);
	}

	
	@Test
	void testLast() {
		SimpleList list = new SimpleList();
		list.add(55);
		list.add(69);
		list.add(54);
		assertEquals(list.last(), 55);
	}

	
	@Test
	void testSize() {
		SimpleList list = new SimpleList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);
		list.add(44);
		list.add(55);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);
		list.add(44);
		list.add(55);
		int newSize = list.size();
		assertEquals(newSize,33);
	}
	

}

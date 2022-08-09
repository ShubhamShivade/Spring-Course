package com.example.mockito;

import org.junit.jupiter.api.Test;

class SomeBusinessImplTest {

	@Test
	public void testFindTheGreatestFromAllData() {
		SomeBusinessImpl businessImpl = new SomeBusinessImpl(new DataServiceStub());
		businessImpl.findTheGreatestFromAllData();
	}

}

class DataServiceStub implements DataService {
	@Override
	public int[] retrieveAllData() {
		return new int[] { 24, 6, 15 };
	}

}
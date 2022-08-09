package com.example.mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.awt.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
class ListTest {

	@Test
	public void test() {
		List listMock = mock(List.class);
		when(listMock.size()).thenReturn(10);
		assertEquals(10,listMock.size());
	}
	@Test
	public void testSize_multipleReturns() {
		List listMock = mock(List.class);
		when(listMock.size()).thenReturn(10).thenReturn(20);
		assertEquals(10,listMock.size());
		assertEquals(20,listMock.size());
	}
	@Test
	public void testGet_SpecificParameter() {
		List listMock = mock(List.class);
		when(listMock.get(0)).thenReturn("Something");
		assertEquals("Something",listMock.get(0));
		assertEquals(null,listMock.get(1));
	}
	@Test
	public void testGet_GenericParameter() {
		List listMock = mock(List.class);
		when(listMock.get(Mockito.anyInt())).thenReturn("Something");
		assertEquals("Something",listMock.get(0));
		assertEquals("Something",listMock.get(1));
	}

}

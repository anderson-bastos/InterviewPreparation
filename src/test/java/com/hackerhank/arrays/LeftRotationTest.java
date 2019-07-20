package com.hackerhank.arrays;

import org.junit.FixMethodOrder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LeftRotationTest {

	static int[] arr = new int[] { 1, 2, 3, 4, 5 };

	@BeforeEach
	public void setUP() {
		arr = new int[] { 1, 2, 3, 4, 5 };
	}
	
	@DisplayName("First Rotation")
	@Test
	public void firstRotLeftTest() {
		Assertions.assertArrayEquals(new int[] { 2, 3, 4, 5, 1 }, LeftRotation.rotLeft(arr, 1));
	}

	@DisplayName("Second Rotation")
	@Test
	public void secondRotLeftTest() {
		Assertions.assertArrayEquals(new int[] { 3, 4, 5, 1, 2 }, LeftRotation.rotLeft(arr, 2));
	}
	
	@DisplayName("Third Rotation")
	@Test
	public void thirdRotLeftTest() {
		Assertions.assertArrayEquals(new int[] { 4, 5, 1, 2, 3 }, LeftRotation.rotLeft(arr, 3));
	}
	
	@DisplayName("Fourth Rotation")
	@Test
	public void fourthRotLeftTest() {
		Assertions.assertArrayEquals(new int[] { 5, 1, 2, 3, 4 }, LeftRotation.rotLeft(arr, 4));
	}
}

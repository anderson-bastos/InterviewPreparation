package com.hackerhank.arrays;

public class LeftRotation {

	private LeftRotation() {
		throw new IllegalStateException("Utility class");
	}

	// Complete the rotLeft function below.
	static int[] rotLeft(int[] a, int d) {
		int timesShifted = 0;
		while (timesShifted < d) {
			int temp = a[0];
			for (int i = 0; i < a.length - 1; i++) {
				a[i] = a[i + 1];
			}
			a[a.length - 1] = temp;
			timesShifted++;
		}
		return a;
	}
}

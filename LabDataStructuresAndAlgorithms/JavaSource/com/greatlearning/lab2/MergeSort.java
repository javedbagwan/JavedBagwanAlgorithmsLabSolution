package com.greatlearning.lab2;

import java.util.Scanner;

public class MergeSort {
	// Your code here...

	public int notes[], L[], R[];
	public int size;
	public int i;
	Scanner sc = new Scanner(System.in);

	public void implementationOfMergeSort() {

		sortArray(notes, 0, size - 1);

	}

	public void sortArray(int notes[], int l, int r) {

		if (l < r) {
			int m = l + (r - l) / 2;
			sortArray(notes, l, m);
			sortArray(notes, m + 1, r);
			conquerArray(notes, l, m, r);
		}

	}

	public void conquerArray(int notes[], int l, int m, int r) {

		int n1 = m - l + 1;
		int n2 = r - m;
		int L[] = new int[n1];
		int R[] = new int[n2];
		for (i = 0; i < n1; ++i) {
			L[i] = notes[l + i];
		}
		for (int j = 0; j < n2; ++j) {
			R[j] = notes[m + 1 + j];
		}
		int i = 0, j = 0;
		int k = l;
		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				notes[k] = L[i];
				i++;
			} else {
				notes[k] = R[j];
				j++;
			}
			k++;
		}
		while (i < n1) {
			notes[k] = L[i];
			i++;
			k++;
		}
		while (j < n2) {
			notes[k] = R[j];
			j++;
			k++;
		}

	}

}

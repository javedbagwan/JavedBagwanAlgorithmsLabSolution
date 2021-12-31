package com.greatlearning.lab2;

import java.util.Scanner;

public class DriverNotesCount {
	public static void main(String[] args) {
		MergeSort mergeSortImplementation = new MergeSort();
		NotesCount notesCount = new NotesCount();

		System.out.println("Enter the size of currency denomination");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] notes = new int[size];
		System.out.println("Enter the currency denomination values");
		for (int i = 0; i < size; i++) {
			notes[i] = sc.nextInt();

		}
		System.out.println("Enter the amount you want to pay");
		int amount = sc.nextInt();
		mergeSortImplementation.sortArray(notes, 0, size - 1);

		notesCount.notesCountImplementaion(notes, amount);
	}

}
package model;

import java.util.Observable;

public class ArrayModel extends Observable {
	int[] array = new int[10];

	public void addElement(int index, int number) {
		array[index] = number;

		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

		setChanged();
		notifyObservers();
	}

	public void removeElement(int index) {
		array[index] = 0;

		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		setChanged();
		notifyObservers();
	}

	public int[] getArray() {
		return array;
	}

}

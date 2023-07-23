package Arrays;

public class MyQueue {

	int[] a = new int[5];
	int index = 0;

	// put add element at end
	public void put(int num) {
		if (index < a.length) {
			a[index] = num;
			index++;
		} else {
			System.out.println("Queue is full");
		}
	}

	// get give me 0 index element and left shift remaining

	public int get() {
		if (index > 0) {
			int temp = a[0];

			for (int i = 0; i < a.length - 1; i++) {
				a[i] = a[i + 1];
			}
			index--;
			return temp;

		} else {
			System.out.println("Queue is empty");
			return 0;
		}
	}

}

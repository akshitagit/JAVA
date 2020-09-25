import java.util.ArrayList;

class HeapSort {

	static void sort(int[] a) {
		ArrayList<Integer> heap = new ArrayList<Integer>();
		for (int i : a) {
			// add i at the end and swap it into the right position
			trickleUp(heap, i);
		}
		for (int i = 0; i < a.length; i++) {
			a[i] = heap.get(0);
			if (heap.size() > 1) {
				heap.set(0, heap.remove(heap.size() - 1));
				trickleDown(heap);
			}
		}

	}

	static void trickleDown(ArrayList<Integer> heap) {
		int i = heap.get(0);
		int index = 0;
		while (heap.size() >= (index + 1) * 2) {
			int l = heap.get((index + 1) * 2 - 1);
			// swap i with bigger child
			if (i < l) {
				if (heap.size() > (index + 1) * 2) {
					int r = heap.get((index + 1) * 2);
					if (r > l) {
						heap.set(index, r);
						index = (index + 1) * 2;
						heap.set(index, i);
					} else {
						heap.set(index, l);
						index = (index + 1) * 2 - 1;
						heap.set(index, i);

					}
				} else
					break;
			} else {
				if (heap.size() > (index + 1) * 2) {
					int r = heap.get((index + 1) * 2);
					if (r > i) {
						heap.set(index, r);
						index = (index + 1) * 2;
						heap.set(index, i);
					} else
						break;
				} else
					break;
			}
		}
	}

	static void trickleUp(ArrayList<Integer> heap, int i) {
		heap.add(i);
		int index = heap.size() - 1;
		while (index > 0 && i > heap.get((index - 1) / 2)) {
			// swap i and its parent if i is bigger than the parent
			heap.set(index, heap.get((index - 1) / 2));
			index = (index - 1) / 2;
			heap.set(index, i);

		}
	}

	public static void main(String[] args) {
		int[] a = new int[] { 17, 3, 2, 6, 5, 9, 6, 14, 0, 4, 7, 3, 9, 4, 1 };
		System.out.println("Unsorted Array: ");
		for (int i : a) {
			System.out.print(i + " ");
		}
		sort(a);
		System.out.println("\n\nSorted Array: ");
		for (int i : a) {
			System.out.print(i + " ");
		}
	}

}

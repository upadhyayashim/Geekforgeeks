package array;

public class ArrayRotation {
	public static void firstmethod(int[] array, int d, int start, int end) {
		int temp[] = new int[d];
		int count = 0, count1 = 0;
		for (int i = 0; i < d; i++) {
			temp[i] = array[i];
			count++;
		}
		for (int i = count; i <= array.length - 1; i++) {
			array[count - d] = array[i];
			count++;
			if (array[i] != 0)
				count1++;
		}
		for (int i = 0; i < temp.length; i++)
			array[count1++] = temp[i];
	}

	public static void secondmethod(int[] array, int d, int start, int end) {
		for (int i = 0; i < d; i++)
			leftRotate(array, end);

	}

	private static void leftRotate(int[] array, int end) {
		int temp = array[0], i = 0;
		for (; i < end; i++)
			array[i] = array[i + 1];
		array[i] = temp;

	}

	public static void thirdmethod() {

	}

	public static void fourthmethod() {

	}

	public static void main(String args[]) {
		int array[] = { 1, 2, 3, 4, 5, 6, 7 };
		int d = 2, start = 0, end = array.length - 1;
		System.out.println("before rotation the array");
		for (int i = 0; i < array.length; i++)
			System.out.print(" " + array[i]);
		// firstmethod(array,d,start,end);
		secondmethod(array, d, start, end);
		System.out.println("");
		System.out.println("after rotation the array");
		for (int i = 0; i < array.length; i++)
			System.out.print(" " + array[i]);
	}
}

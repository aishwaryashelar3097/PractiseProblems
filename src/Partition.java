public static int Partition(int inputArray[], int threshold) {
		int count = 0;
		for (int i = 0; i < inputArray.length; i++) {
			if (inputArray[i] <= threshold) {
				count++;
			}
		}

		return count;
	}
public static int[] traveseNShuffle(int inputArray[], int threshold) {

		int rightHalfStartIndex = getElementOfPartition(inputArray, threshold);
		int j = rightHalfStartIndex;
		int temp;
		for (int i = 0; i < getElementOfPartition(inputArray, threshold); i++) {

			System.out.println("i:" + i);
			if (inputArray[i] > threshold) {

				while (j < inputArray.length) {
					System.out.println("j:" + j);
					if (inputArray[j] < threshold) {
temp = inputArray[i];
						inputArray[i] = inputArray[j];
						inputArray[j] = temp;
						break;
					}
					j++;
				}

			}
		}
		return inputArray;
	}

public static int[] sortInDesc(int inputArray[], int start, int end) {
		int temp;
		for (int i = start; i < end; i++) {
			for (int j = i + 1; j < end; j++) {
				if (inputArray[i] < inputArray[j]) {
					temp = inputArray[i];
					inputArray[i] = inputArray[j];
					inputArray[j] = temp;
				}
			}
		}
		return inputArray;
}


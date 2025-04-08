import java.util.Arrays;

public class PracticeProblem {
	
public static int[] compareSearch(int[] array, int number) {
	int seqLoops = 0;
	for (int i = 0; i < array.length; i++) {
	seqLoops++;
	if (array[i] == number) {
	break;
	}
}
	Arrays.sort(array);
	int binLoops = 0;
	int high = array.length - 1;
	int low = 0;
	int mid;
	while (low <= high) {
	binLoops++;
	mid = (low + high) / 2;
	if (array[mid] == number) {
    break;
		} else if (array[mid] < number) {
			low = mid + 1;
		} else {
			high = mid - 1;
		}
	}

return new int[]{seqLoops, binLoops};
}

public static int[] compareStringSearch(String[] array, String word) {
		
    int seqLoops = 0;
	for (int i = 0; i < array.length; i++) {
	seqLoops++;
	if (array[i].equals(word)) {
	break;
	}
}

	Arrays.sort(array);
	int binLoops = 0;
	int low = 0;
	int high = array.length - 1;
	int mid;

	while (low <= high) {
	binLoops++;
	mid = low + (high - low) / 2;
	int comparison = array[mid].compareTo(word);

	if (comparison == 0) {
		break;
	} else if (comparison < 0) {
		low = mid + 1;
	} else {
		high = mid - 1;
	}
}
return new int[]{seqLoops, binLoops};
	}
}

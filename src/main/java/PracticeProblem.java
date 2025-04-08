import java.util.Arrays;

public class PracticeProblem {

	public static void main(String args[]) {	
	}
	
public static int[] compareSearch(int[] arr, int num) {
	int seqLoops = 0;
	for (int i = 0; i < arr.length; i++) {
	seqLoops++;
	if (arr[i] == num) {
	break;
	}
}
	Arrays.sort(arr);
	int binLoops = 0;
	int high = arr.length - 1;
	int low = 0;
	int mid;
	while (low <= high) {
	binLoops++;
	mid = (low + high) / 2;
	if (arr[mid] == num) {
    break;
		} else if (arr[mid] < num) {
			low = mid + 1;
		} else {
			high = mid - 1;
		}
	}

return new int[]{seqLoops, binLoops};
}

public static int[] compareStringSearch(String[] arr, String words) {
		
    int seqLoops = 0;
	for (int i = 0; i < arr.length; i++) {
	seqLoops++;
	if (arr[i].equals(words)) {
	break;
	}
}

	Arrays.sort(arr);
	int binLoops = 0;
	int low = 0;
	int high = arr.length - 1;
	int mid;

	while (low <= high) {
	binLoops++;
	mid = low + (high - low) / 2;
	int comparison = arr[mid].compareTo(words);

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

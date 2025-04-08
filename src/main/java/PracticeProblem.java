import java.util.Arrays;

public class PracticeProblem {

    public static void main(String[] args) {
        // Example usage
        int[] intArray = {5, 3, 8, 1, 2};
        int[] intSearchResult = compareSearch(intArray, 3);
        System.out.println("Integer Search Loops: Sequential = " + intSearchResult[0] + ", Binary = " + intSearchResult[1]);

        String[] strArray = {"banana", "apple", "cherry", "date"};
        int[] strSearchResult = compareStringSearch(strArray, "cherry");
        System.out.println("String Search Loops: Sequential = " + strSearchResult[0] + ", Binary = " + strSearchResult[1]);
    }

    public static int[] compareSearch(int[] numArray, int num) {
        int loops = 0;
        int loops2 = 0;
        Arrays.sort(numArray);

        // Sequential search
        for (int i = 0; i < numArray.length; i++) {
            loops++;
            if (numArray[i] == num) {
                break;
            }
        }

        // Binary search
        int low = 0;
        int high = numArray.length - 1;
        int mid;

        while (low <= high) {
            mid = (low + high) / 2;
            loops2++;
            if (numArray[mid] < num) {
                low = mid + 1;
            } else if (numArray[mid] > num) {
                high = mid - 1;
            } else {
                break; // Found the num
            }
        }

        int[] stringArray = {loops, loops2}; // Changed to stringArray
        return stringArray;
    }

    public static int[] compareStringSearch(String[] strArray, String searchText) {
        int loops = 0;
        int loops2 = 0;
        Arrays.sort(strArray);

        // Sequential search
        for (int i = 0; i < strArray.length; i++) {
            loops++;
            if (strArray[i].equals(searchText)) {
                break;
            }
        }

        // Binary search
        int low = 0;
        int high = strArray.length - 1;
        int mid;

        while (low <= high) {
            mid = (low + high) / 2;
            loops2++;
            int comparison = strArray[mid].compareTo(searchText);
            if (comparison < 0) {
                low = mid + 1;
            } else if (comparison > 0) {
                high = mid - 1;
            } else {
                break; // Found the searchText
            }
        }

        int[] stringArray = {loops, loops2}; // Changed to stringArray
        return stringArray;
    }
}

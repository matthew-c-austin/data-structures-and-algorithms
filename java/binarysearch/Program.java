package java.binarysearch;

public class Program {
  public static int binarysearch(int[] array, int target) {

    int low = 0;
    int high = array.length - 1;

    while (low <= high) {
      int mid = low + high / 2;
      int potentialMatch = array[mid];
      if (potentialMatch == target) {
        return mid;
      } else if (potentialMatch < target) {
        low = mid + 1;
      } else {
        high = mid - 1;
      }
    }

    return -1;
  }
}

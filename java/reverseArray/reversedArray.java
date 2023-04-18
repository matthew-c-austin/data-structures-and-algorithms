public class reversedArray {
  public static int[] reverseArray(int[] array) {
    int[] reversedArray = new int[array.length];
    int i = 0;
    for (int j = array.length - 1; j >= 0; j--) {
      reversedArray[i] = array[j];
      i++;
    }
    return reversedArray;
  }
}

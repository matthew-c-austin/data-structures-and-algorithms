public class arrayInsertShift {
  public static int[] insertShiftArray(int[] array, int value) {

    int[] insertShiftArray = new int[array.length + 1];

    // Integer division will round to the correct index starting from 0
    int middleIdx = insertShiftArray.length / 2;
    for(int i = 0; i < insertShiftArray.length; i++) {
      if (i == middleIdx) {
        insertShiftArray[i] = value;
      } else if (i < middleIdx) {
        insertShiftArray[i] = array[i];
      } else {
        insertShiftArray[i] = array[i - 1];
      }
    }
    return insertShiftArray;
  }
}

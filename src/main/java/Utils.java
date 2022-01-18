public class Utils {
    public void Sort(int[] printArray) {
        int temp = 0;
        for (int i = 0; i < printArray.length; i++) {
            for (int j = i + 1; j < printArray.length; j++) {
                if (printArray[i] > printArray[j]) {
                    temp = printArray[i];
                    printArray[i] = printArray[j];
                    printArray[j] = temp;
                }
            }
        }
    }
}


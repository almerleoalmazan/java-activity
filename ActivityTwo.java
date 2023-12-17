/*
 * Activity #2
 *
 * Write a program that will accept a number of elements and
 * determine the following.
 * 1. Mean
 * 2. Median
 * 3. Mode
 */
class ActivityTwo {
    public static void main(String[] args) {
        System.out.println("Activity #2");
        
        int[] firstDataSet = {12, 7, 14, 5, 7, 11, 9};
        int[] sortedFirstDataSet = sort(firstDataSet);
        
        System.out.println("Given array: " + toString(firstDataSet));
        System.out.println("First Mean = " + getMeanValue(sortedFirstDataSet));
        System.out.println("First Median = " + getMedianValue(sortedFirstDataSet));
        
        if (getModeValue(sortedFirstDataSet) == sortedFirstDataSet[0]) {
            System.out.println("First Mode = None");
        } else {
            System.out.println("First Mode = " + getModeValue(sortedFirstDataSet));
        }
        
        System.out.println();
        
        int[] secondDataSet = {6, 14, 8, 5, 3, 11, 9};
        int[] sortedSecondDataSet = sort(secondDataSet);
        
        System.out.println("Given array: " + toString(secondDataSet));
        System.out.println("Second Mean = " + getMeanValue(sortedSecondDataSet));
        System.out.println("Second Median = " + getMedianValue(sortedSecondDataSet));
        
        if (getModeValue(sortedSecondDataSet) == sortedSecondDataSet[0]) {
            System.out.println("Second Mode = None");
        } else {
            System.out.println("Second Mode = " + getModeValue(sortedSecondDataSet));
        }
        
        System.out.println();
        
        int[] thirdDataSet = {6, 8, 5, 5, 9, 8, 10, 8};
        int[] sortedThirdDataSet = sort(thirdDataSet);
        
        System.out.println("Given array: " + toString(thirdDataSet));
        System.out.println("Third Mean = " + getMeanValue(sortedThirdDataSet));
        System.out.println("Third Median = " + getMedianValue(sortedThirdDataSet));
        
        if (getModeValue(sortedThirdDataSet) == sortedThirdDataSet[0]) {
            System.out.println("Third Mode = None");
        } else {
            System.out.println("Third Mode = " + getModeValue(sortedThirdDataSet));
        }
        
        System.out.println();
        
        int[] fourthDataSet = {12, 15, 21, 4, 36, 15, 11, 48, 29, 38};
        int[] sortedFourthDataSet = sort(fourthDataSet);
        
        System.out.println("Given array: " + toString(fourthDataSet));
        System.out.println("Fourth Mean = " + getMeanValue(sortedFourthDataSet));
        System.out.println("Fourth Median = " + getMedianValue(sortedFourthDataSet));
        
        if (getModeValue(sortedFourthDataSet) == sortedFourthDataSet[0]) {
            System.out.println("Fourth Mode = None");
        } else {
            System.out.println("Fourth Mode = " + getModeValue(sortedFourthDataSet));
        }
    }
    
    private static double getMeanValue(int[] array) {
        double sum = 0.0;
        double numberOfItems = array.length;
        
        for (int i = 0; i < numberOfItems; i++) {
            sum += array[i];
        }
        
        return sum / numberOfItems;
    }
    
    private static int getMedianValue(int[] array) {
        int middle = array.length / 2;
        
        // If the length of an array is even
        if (array.length % 2 == 0) {
            // If the two numbers are equal, then return the number
            return (array[middle - 1] + array[middle]) / 2;
        }
        
        // If the length of an array is odd
        return array[middle];
    }
    
    private static int getModeValue(int[] array) {
        int maxValue = 0;
        int maxCount = 0;

        for (int i = 0; i < array.length; ++i) {
            int count = 0;
            
            for (int j = 0; j < array.length; ++j) {
                if (array[j] == array[i]) {
                    ++count;
                }
            }
            
            if (count > maxCount) {
                maxCount = count;
                maxValue = array[i];
            }
        }
    
        return maxValue;
    }
    
    private static int[] sort(int[] array) {
        int index;
        
        for (int i = 0; i < array.length; i++) {
            index = i;
            for (int j = i ; j <= array.length - 1; j++) {
                if (array[j] < array[index]) {
                    index = j;
                }
            }

            int temp = array[i];
            array[i] = array[index];
            array[index] = temp;
        }
        
        return array;
    }

    private static String toString(int[] array) {
        String temporaryString = "";
        
        for (int number : array) {
            temporaryString += number + " ";
        }
        
        return temporaryString;
    }
}

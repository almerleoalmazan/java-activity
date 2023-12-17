/*
 * Activity #3
 *
 * Write a program that will accept the size of the
 * array after that, the program will display the highest
 * and lowest among the elements as well as the middle
 * value of the element.
 */
class ActivityThree {
    public static void main(String[] args) {
        
        System.out.println("Activity #3");
        int[] arrayOfNumbers = {12, 22, 3, 4, 15, 6, 7, 17, 9};
        int[] sortedArrayOfNumbers = sort(arrayOfNumbers);
        
        int highestNumber = 0;
        int lowestNumber = 0;
        int middleNumber = 0;
        
        for (int index = 0; index < sortedArrayOfNumbers.length; index++) {
            // Get the lowest number if it's the first number in the array
            if (index == 0) {
                lowestNumber = sortedArrayOfNumbers[0];
            }
            
            int temporaryNumber = sortedArrayOfNumbers[index];
            if (temporaryNumber < lowestNumber) {
                lowestNumber = temporaryNumber;
            }
            
            // Get the highest number
            if (temporaryNumber > highestNumber) {
                highestNumber = temporaryNumber;
            }
        }
        
        // Get the middle number
        middleNumber = sortedArrayOfNumbers[sortedArrayOfNumbers.length/2];
        
        System.out.println("Given array: " + toString(arrayOfNumbers));
        System.out.println("Highest number is " + highestNumber);
        System.out.println("Lowest number is " + lowestNumber);
        System.out.println("Middle number is " + middleNumber);
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

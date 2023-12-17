import java.util.Scanner;

/*
 * Activity #1
 *
 * Write a program that will accept the length of an array,
 * after that the program will ask the user if she/he will
 * arrange the element according to ascending or descending.
 * */
class ActivityOne {
    public static void main(String[] args) {
        int[] firstDataSet = {12, 7, 14, 5, 7, 11, 9};
        int[] secondDataSet = {6, 14, 8, 5, 3, 11, 9};
        int[] thirdDataSet = {6, 8, 5, 5, 9, 8, 10, 8};
        int[] fourthDataSet = {12, 15, 21, 4, 36, 15, 11, 48, 29, 38};
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Given array: " + toString(firstDataSet));
        System.out.print("Please enter the type of sorting order: (asc or desc) : ");
        
        String selectedSortOrder = scanner.nextLine();
        
        if (selectedSortOrder.equals("asc")) {
            int[] sortedFirstDataSet = sortBy("asc", firstDataSet);
            System.out.println("Ascending first dataset = " + toString(sortedFirstDataSet));
        } 
        
        if (selectedSortOrder.equals("desc")) {
            int[] sortedFirstDataSet = sortBy("desc", firstDataSet);
            System.out.println("Descending first dataset = " + toString(sortedFirstDataSet));
        }
    }
    
    // Assuming we only have "asc" for ascending value
    // and "desc" for descending value
    private static int[] sortBy(String sortOrder, int[] array) {
        if (sortOrder.equals("desc")) {
            return reverseSort(sort(array));
        }
        
        return sort(array);
    }
    
    private static String toString(int[] array) {
        String temporaryString = "";
        
        for (int number : array) {
            temporaryString += number + " ";
        }
        
        return temporaryString;
    }
    
    private static int[] reverseSort(int[] array) {
        for (int i = 0, j = array.length - 1; i < array.length / 2; i++) {
            int temporary = array[i];
            array[i] = array[j];
            array[j] = temporary;
            j--;
        }
        
        return array;
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
}

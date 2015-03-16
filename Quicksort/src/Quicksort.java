import java.util.Arrays;
public class Quicksort {
	public static void main (String[] args){
		performSort();
	}

	public static void performSort(){
		System.out.println("Quicksort Implementation");
		boolean sorted = false;
		int[] numbers = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};
		int[] sortedList = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48}; // Figure out copy value later
		System.out.println(Arrays.toString(numbers));
		int unsortedEnd = numbers.length - 1; // Index of the end of the unsorted partition
		int pivotIndex = 0;	// Index of the beginning of the unsorted partition; value to compare to
		int storeIndex = pivotIndex + 1;
		System.out.println("pivotIndex = " + pivotIndex);
		System.out.println("unsortedEnd = " + unsortedEnd);
		for(int i = pivotIndex + 1; i <= unsortedEnd; i++){
			System.out.println("\n\nchecking value " + numbers[i]);
			if(numbers[i] < numbers[pivotIndex]){
				System.out.print("it is smaller than pivot");
				swap(sortedList, i, storeIndex);
			}
			else{
				System.out.print("it is bigger than pivot");	
			} 
		}
	}

	public static void swap(int[] a, int b, int c){
		int[] l = a;
		int temp;
		temp = l[c];
		l[c] = l[b];
		l[b] = temp;
		System.out.println("new array = " + Arrays.toString(l));
	}
	
}

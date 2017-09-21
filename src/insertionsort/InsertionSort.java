
package insertionsort;

/**
 *
 * @author Christopher
 */
public class InsertionSort {

    public static void main(String[] args) {
        
        /*
            This program will pass a unsorted integer array to a 
            selectionSort algorithm that will use a nested for loops
            to put the array value in descending numeric order. 
        */
        int [] numbers = { 67, 78, 4, 15, 47, 30, 99, 33, 65, 85};
        
        System.out.print("Here are the numbers unsorted: ");
        for(int i = 0; i < numbers.length; i++){
            
            System.out.print(" " + numbers[i]);
        }
        
        System.out.println();
        System.out.print("Here are the numbers sorted: ");
        insertionSort(numbers); 
        
        for(int i = 0; i < numbers.length; i++){
            
            System.out.print(" " + numbers[i]);
        }
        System.out.println();
                
    }
    
    public static void insertionSort(int [] num){
        
        int j, key, i;
        
        for(j = 1; j < num.length; j++){  //start with 1 (not 0)
            
            key = num[j];
            for(i = j-1; (i >= 0) && (num[i] < key); i--){  //smaller value moves up.
                
                num[i + 1] = num[i];
            }
            
            num[i + 1] = key;              //put key in proper location
        }
    }
    
}

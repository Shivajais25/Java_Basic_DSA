// working code of user input array and reverse it 
import java.util.Scanner;
public class Reverse_array{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int size = scan.nextInt();
        int index;
        // now converting size of array into array space

        if(size <= 0){
            System.out.println("Invalid array size");
            return;
        }

        int array[] = new int[size];
        
        // using for loop to get input for array

        for(index = 0; index <= size - 1; index++){
            System.out.print("Enter "+ (index + 1) +" element: ");
            array[index] = scan.nextInt();
        }

        // showing array
        System.out.println("\nEntered array is given below:");
        for(index = 0; index <= size - 1; index++){
            System.out.print(array[index] + " ");
        }

        // reversing array
        System.out.println("\nReverse of given array:");

        // reverse original array
        for(index = 0; index < size / 2; index++){
            int temp = array[index];
            array[index] = array[size - 1 - index];
            array[size - 1 - index] = temp;
        }

        for(index = 0; index <= size - 1; index++){
            System.out.print(array[index] + " ");
        }

        scan.close();
    }
}
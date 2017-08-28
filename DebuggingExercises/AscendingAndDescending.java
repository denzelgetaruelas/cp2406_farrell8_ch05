/**
 * Created by Jc337839 on 28/08/17.
 */
import java.util.Arrays;
import java.util.Scanner;
public class AscendingAndDescending
{
    public static void main(String[] args)
    {
        int number;
        int [] array = new int [3];
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an number: ");
        number = scanner.nextInt();
        array[0] = number;
        System.out.print("Enter another number: ");
        number = scanner.nextInt();
        array[1] = number;
        System.out.print("Enter another number: ");
        number = scanner.nextInt();
        array[2] = number;
        Arrays.sort(array);
        System.out.print("Ascending Order:" );
        for(int i = 0; i < array.length; i++){
            System.out.print( " " + array[i]);
        }
        System.out.print("\nDescending Order:" );
        for(int i = array.length - 1; i >= 0; i--){
            System.out.print( " " + array[i]);
        }
       }
}

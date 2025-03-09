import java.util.*;
public class Sorted_Array_Comparison{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array: ");
        int N = sc.nextInt();
        int[] arr = new int[N];
        System.out.println("Enter the number from which it is to be checked: ");
        int B = sc.nextInt();
        int count = 0;
        System.out.println("Enter the elements to be checked: ");
        for(int i=0;i<N;i++){
            arr[i] = sc.nextInt();
            if(arr[i]<B || arr[i]==B){
                count++;
            }
        }
        System.out.println("Count is: "+count);
        sc.close();
    }
}
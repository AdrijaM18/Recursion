import java.util.*;
public class recArrayOperations {
    static void recArrayTraversal(int ind,int[] arr)
    {
        if(ind > arr.length-1)
            return;
        System.out.print(arr[ind] +" ");
        recArrayTraversal(ind+1,arr);
    }
    static int recBinarySearch(int[] arr, int t,int l,int r){
        int m = l+(r-l)/2;
        if(l<=r){
            if(arr[m] == t)
                return m;
            else if(arr[m] < t)
            {
                return recBinarySearch(arr,t,m+1,r);
            }
            else if(arr[m] > t) {
                return recBinarySearch(arr, t, l, m-1);
            }
        }
        return -1;
    }
    static int recProd(int ind,int[] arr)
    {
        int prod=1;
        if(ind == arr.length-1)
            return 1;
        return arr[ind]*recProd(ind+1,arr);


    }
    static int recSum(int ind, int[]arr)
    {
        if(ind == arr.length)
            return 0;
        return arr[ind] + recSum(ind+1,arr);
    }
    static int recOccurrences(int ind, int[] arr, int ele){
        if(ind == arr.length){
            return 0;
        }
        if (arr[ind] == ele)
             return 1 + recOccurrences(ind + 1,arr, ele);
        else
            return recOccurrences(ind + 1,arr, ele);
    }
    static void recArrayRev(int ind, int[] arr){
        if(ind < 0)
            return;

        System.out.print(arr[ind]+" ");
        recArrayRev(ind-1,arr);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr  = {1,23,23,23,55,56};
        System.out.print("Array elements are: ");
        recArrayTraversal(0,arr);
        System.out.println();
        System.out.print("Enter a target : ");
        int t = sc.nextInt();
        int max = recBinarySearch(arr,t,0,arr.length-1);
        System.out.println("Target value in the array is in : "+max+" index.");
        int prod = recProd(0,arr);
        System.out.println("Product of all the elements in an array : "+prod);
        int sum = recSum(0,arr);
        System.out.println("Sum of all the elements in an array : "+sum);
        System.out.print("Enter a number to find occurrence : ");
        int ele = sc.nextInt();
        int occ=recOccurrences(0,arr,ele);
        System.out.println("Occurrences of "+ele+" is "+occ);
        System.out.print("Reverse array list is : ");
        recArrayRev(arr.length-1, arr);
    }
}

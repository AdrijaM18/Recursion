import java.util.*;
class Recursion {
    public static int fact(int n){
        if(n>1)
          return (n)*fact(n-1);
        else
        {
            return 1;
        }
    }
    public static int sum(int n){
        if(n==0){
            return 0;
        }
        return n+sum(n-1);

    }
    public static void sum12n(int n){
        if (n==0)
            return;
        sum12n(n-1);
        System.out.print(n+" " );

    }
    public static void revn21(int n){
        if (n==0)
            return;

        System.out.print(n+" ");
        revn21(n-1);

    }
    public static int fibi(int n){
        if(n == 0 ){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        else{
            return fibi(n-1) + fibi(n-2);
        }
    }

    public static int countZeros(int num){
        if(num==0)
          return 0;
        int r = num %10;
        if(r==0){
          
          return 1 + countZeros(num/10);
        }
        else
          return countZeros(num/10); 
        
    }
    public static int chkPalindrome(int num,int s){
        if(num == 0){
            return s;
        }
        s = (s*10) + (num %10);
        return chkPalindrome(num/10,s);
        
    }
    public static int makeReverse(int num, int s){
        if(num == 0){
            return s;
        }
        s = (s*10) + (num %10);
        return makeReverse(num/10,s);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int fac = fact(n);
        System.out.println("Factorial of "+n+ " is : "+fac);
        int num = sc.nextInt();
        int s = sum(num);
        System.out.println("Sum of "+num+ " is : "+s);
        sum12n(n);
        System.out.println("");
        revn21(n);
        System.out.println(" ");
        System.out.print(n+"th fibonacci number is : "+fibi(n));
        int num1 = sc.nextInt();
        System.out.println("Number of zeros: "+countZeros(num1));
        int nums1 = sc.nextInt();
        int temp = chkPalindrome(nums1,0);
        if(temp == nums1)
           System.out.println(temp+" is : palindrome");
        System.out.println("The reverse of : "+fac+" :"+makeReverse(fac, 0));
        sc.close();
    }
}

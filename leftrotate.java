/*import java.util.Scanner;
public class leftrotate {
    public static void main(String[] args) {
        
    
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
    arr[i]=sc.nextInt();
    int temp=arr[0];
    int i;
    for( i=1;i<n;i++){
        arr[i-1]=arr[i];
    }
    arr[n-1]=temp;
   for(i=0;i<n;i++){
    System.out.println(arr[i]+" ");
   }
   
}
}*/
import java.util.*;
public class leftrotate{
    public static void reverse(int arr[],int left,int right){
         while(left<right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
         }
    }
    public static void rotate(int arr[],int n,int k){
        k=k%n;
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
        reverse(arr,0,n-1);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size:");
        int n=sc.nextInt();
        System.out.println("enter the nunmber of positions to rotate:");
        int k=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the elements into the array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        rotate(arr,n,k);
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
        }
    }
}
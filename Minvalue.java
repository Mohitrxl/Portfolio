import java.util.*;
class Minvalue
{
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter your array size: ");
        int n=obj.nextInt();
        System.out.println("Enter your elements: ");
        int arr[]=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=obj.nextInt();
        }
        int min=arr[0];
        for(int i=0;i<n;i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println("Minimum value is: "+min);
    }
}
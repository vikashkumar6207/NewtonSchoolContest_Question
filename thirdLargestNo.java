import java.util.Scanner;

class Main{
    static int getMaximum(int []arr){
        
        int maxIndex = 0;
        int n = arr.length;
        for(int i = 0;i < n;i++){
            if(arr[i]>arr[maxIndex]){
                maxIndex = i;
            }
        }
        return maxIndex;
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i < n;i++){
            arr[i] = sc.nextInt();
        }
        int firstMaxIndex = getMaximum(arr);
        arr[firstMaxIndex] = Integer.MIN_VALUE;

        int secondMaxIndex = getMaximum(arr);
        arr[secondMaxIndex] = Integer.MIN_VALUE;

        int thirdMaxIndex = getMaximum(arr);
        System.out.println(arr[thirdMaxIndex]);
    }
}
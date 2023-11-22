import java.util.Scanner;

public class abcContest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N+1];

            int count = 0;
            for(int a = 0;a <= 100;a++){
                for(int b = 0;b <= 100;b++){
                    for(int c = 0;c <= 100;c++){
                        int curr = (a*a)+(b*b)+(c*c);
                        if(curr <= N){
                            arr[curr] = arr[curr]+1;
                        }
                    }
                }
            }
        for(int i = 1;i <= N;i++){
            System.out.println(arr[i]+" ");
        }
        
    }
}

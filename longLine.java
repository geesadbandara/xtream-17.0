import java.util.Scanner;

public class longLine {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int h0 = scanner.nextInt();
        int a = scanner.nextInt();
        int c = scanner.nextInt();
        int q = scanner.nextInt();

        scanner.close();

        int [] arr = new int[n];
        arr[0] = h0;
        int count = n-1;

        for (int i = 1; i < n; i++)
        {
            arr[i] = (a * arr[i-1] + c) % q;
        }
        for(int i = 1;i<n-1;i++){
            if(arr[i-1]>arr[i]){
                int j = i-1;
                for(j=i-1;j>-1;j--){
                    if(arr[j]>arr[j+1]){
                        count = count+1;
                    }
                    
                }
            }
            else if(arr[i-1]<arr[i]){
                int j = i-1;
                for(j=i-1;j>-1;j--){
                   if(arr[j]>arr[j+1]){
                        count = count+1;
                    }
                }
            }
        }

        System.out.println(count);

        
    }
}
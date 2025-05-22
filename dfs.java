import java.util.*;
public class dfs {
    public static void sol(int arr[][],int s,int n,boolean vis[]){
        vis[s]=true;
        System.out.println(s);
        for(int i=0;i<n;i++){
         if(arr[s][i]== 1 && !vis[i]){
            sol(arr,i,n,vis);
         }
        }
    }
 public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        int arr[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int s =sc.nextInt();
        boolean[]vis=new boolean[n];
        sol(arr,s,n,vis);
        sc.close();
    }
}

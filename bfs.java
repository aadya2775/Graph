import java.util.*;
public class bfs{
    public static void sol(int arr[][],int n,int s){
    boolean[] visit = new boolean[n];
    Queue<Integer> q =new LinkedList<>();
    q.add(s);
    visit[s]=true;
    while(!q.isEmpty()){
     int current=q.poll();
     System.out.println(current);
      for(int i=0;i<n;i++){
        if(arr[current][i]==1 && !visit[i]){
            q.add(i);
            visit[i]=true;
        }
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
        sol(arr,n,s);
        sc.close();
    }
}
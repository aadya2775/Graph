import java.util.*;
public class bfslist{
   public static void bfs(ArrayList<ArrayList<Integer>> graph,int start,int n){
      boolean visit[]=new boolean[n];
      Queue<Integer>q =new LinkedList<>();
      visit[start]=true;
      q.add(start);
      while(!q.isEmpty()){
         int current =q.poll();
         System.out.println(current);
      for(int i : graph.get(current)){
         if(!visit[i]){
          q.add(i);
          visit[i]=true;
         }
      }
    }
   }
public static void main(String args[]){
 ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
 Scanner sc =new Scanner(System.in);
 int n =sc.nextInt();
 for(int i=0;i<n;i++){
    graph.add(new ArrayList<>());
 }
 int edge=sc.nextInt();
 for(int i=0;i<edge;i++)
 {
   int sour=sc.nextInt();
   int dest=sc.nextInt();
   graph.get(sour).add(dest);
   graph.get(dest).add(sour);
 }
 int start=sc.nextInt();
 bfs(graph,start,n);
 sc.close();
}
}
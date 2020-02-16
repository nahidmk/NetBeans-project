
package bfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFS {
    
    public static void bfs(int joint[][],int s_node, int e_node,int vertex)
    {
       int colour[] = new int[100];
       int dist[] = new int[100];
       //int node[] = new int[100];
       int pred[] = new int[100];
       int black = 1,white = 0;
       int b = 1;
       Queue nq = new LinkedList();
       Queue dq = new LinkedList();
       for(int i = 1;i<=vertex;i++)
       {
           if(i!=s_node)
           {
               colour[i] = white;
               dist[i] = 0;
               pred[i] = -1; 
           }
       }
       nq.add(s_node);
       dq.add(0);
       colour[s_node] = black;
       while(!nq.isEmpty() && !dq.isEmpty())
       {
           int n_front = (Integer)nq.remove();
           int d_front = (Integer)dq.remove();
           dist[n_front] = d_front;
           for(int i = 1;i<=vertex;i++)
           {
               if(colour[i] == white && joint[n_front][i]==1)
               {
                   nq.add(i);
                   dq.add(d_front+1);
                   colour[i] = black;
                   pred[i]=n_front;
               }
           }
       }
       for(int i = 1;i<=vertex;i++)
       {
           System.out.println(s_node+" to "+i+" distance "+dist[i]);
       }
       System.out.println("Distance = "+dist[e_node]);
       for(int i = 1;i<=vertex;i++)
       {
           System.out.print(pred[i]+" ");
       }
//       Queue pq = new LinkedList();
//   
//       int path = e_node;
//       pq.add(e_node);
//       while(pred[e_node]!=-1)
//       {
//           pq.add(pred[e_node]);
//           e_node = pred[e_node];
//       }
//       for (int i = pq.size() - 1; i >= 0; i--) 
//       {
          // System.out.print(pq+" ");
       //}
       
    }

    public static void main(String[] args) {
        Scanner mk = new Scanner(System.in);
        int eage,vertex;
        System.out.print("Enter the nembr of eage = ");
        eage = mk.nextInt();
        System.out.print("Enter the nuber of vertex = ");
        vertex = mk.nextInt();
        int joint[][] = new int[100][100];
        for(int i = 1;i<=eage;i++)
        {
            System.out.println("Enter the eage those are connented : ");
            int e,v;
            e = mk.nextInt();
            v = mk.nextInt();
            joint[v][e] = joint[e][v] = 1;
                    
        }
        int f_node,l_node;
        System.out.print("Enter the frist node = ");
        f_node = mk.nextInt();
        System.out.print("Enter the last node = ");
        l_node = mk.nextInt();
        bfs(joint,f_node,l_node,vertex);
    }
    
}

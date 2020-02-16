
package bfs_normal_verson;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFS_normal_verson {
    public static void bfs(int linknode[][],int s_node, int e_node,int vertex,int edge)
    {
        int white = 0,black = 1;
        int colour[] = new int[100];
        int distance[] = new int[100];
        Queue ver = new LinkedList();
        Queue eage = new LinkedList();
        for(int i = 1;i<=vertex;i++)
        {
            if(i!=s_node)
            {
                colour[i] = white;
                distance[i] = 0;
            }
        }
        colour[s_node] = black;
        ver.add(s_node);
        eage.add(0);
        while(!ver.isEmpty() && !eage.isEmpty())
        {
            int n_front = (Integer)ver.remove();
           int d_front =  (Integer)eage.remove();
            distance[n_front] = d_front;
            for(int i = 1;i<=vertex;i++)
            {
                if(linknode[n_front][i]!=0)
                {
                    if(colour[i]==white)
                    {
                        ver.add(i);
                        eage.add(d_front+1);
                        colour[i] = black;   
                    }
                }
            }   
        }
        System.out.println("Distance = "+distance[e_node]);
        int parent[] = new int[100];
        int count= 1;
        parent[count] = e_node;
        count++;
        for(int i = 1;i<=vertex;i++)
        {
            for(int j = 1;j<=edge;j++)
            {
                if(linknode[i][e_node]==1&&distance[e_node]>distance[i])
                {
                    parent[count] = i;
                    e_node = i;
                    i = 1;
                }
            }
        }
        for(int i = count-1;i>=0;i++)
        {
            System.out.println(parent[i]+" - ");
        }
    }

    public static void main(String[] args) {
        Scanner mk = new Scanner(System.in);
        int edge, vertex;
        int linknode[][] = new int[100][100];
        System.out.print("Enter the number of vertex = ");
        vertex = mk.nextInt();
        System.out.print("Enter the number of edge = ");
        edge = mk.nextInt();
        for(int i = 1;i<=edge;i++)
        {
            int n1,n2;
            System.out.println("Enter the connentibity of node : ");
            n1 = mk.nextInt();
            n2 = mk.nextInt();
            linknode[n1][n2] = linknode[n2][n1] = 1;
        }
        
        System.out.print("Enter the starting node = ");
        int s_node,e_node;
        s_node = mk.nextInt();
        System.out.print("Enter the Ending node = ");
        e_node = mk.nextInt();
        bfs(linknode,s_node,e_node,vertex,edge);
    }
    
}

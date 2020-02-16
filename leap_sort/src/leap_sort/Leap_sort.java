
package leap_sort;

import java.util.Scanner;

public class Leap_sort {

    public static void heap( int arr[], int size, int i)
    {
        int root = i;
        int left_child = (root*2)+1;
        int right_child = (root*2)+2;
        if(left_child<size && arr[root]<arr[left_child])
        {
            root = left_child;
        }
        if(right_child<size && arr[root]<arr[right_child])
        {
            root = right_child;
        }    
        if(root!=i)
        {
            int temp = arr[i];
            arr[i] = arr[root];
            arr[root] = temp;
            
            heap(arr,size,root);
        }
            
    }
    
    
    public static void insert(int arr[],int size)
    {
          
        for(int i = (size/2)-1;i>=0;i--)
        {
            heap(arr,size,i);
        }        
    }

    
    public static void main(String[] args) {
       int n,k = 0;
       Scanner mk = new Scanner(System.in);
       System.out.print("number of operation = ");
       n = mk.nextInt();
       int arr[] = new int[n];
       for(int i = 1;i<=n;i++)
       {
          System.out.println("");
          System.out.println("1 -----> for Inert");
          System.out.println("2 -----> for Delete");
          System.out.println("3 -----> for Find");
          System.out.println();
          System.out.print("give your option = ");
          System.out.println();
          int option;         
          option = mk.nextInt();
          if(option == 1)
          {      
              System.out.print("Enter the value = ");
              System.out.println();
              arr[k] = mk.nextInt();
              k++;
              insert(arr,k);
              System.out.println("the inserted value");
              for(int j = 0;j<k;j++)
              {
                  System.out.print(arr[j]+" ");
              }
          }
          else if(option == 2)
          {
              int l = k;
              if(l!=0)
              {
                  int temp = arr[0];
                  arr[0] = arr[l-1];
                  arr[l-1] = temp;
                  for(int j = l-2;j>=0;j--)
                    {
                        heap(arr,j,0);
                    }
                    System.out.println("the deleted value = "+arr[l-1]);
                   k--;
              }
              else
                  System.out.println("array is empty.....!");
          }
          else if(option == 3)
          {
              if(k!=0)
              {
                  System.out.print("the root is = "+arr[0]);
                  System.out.println();
              }
              else
                  System.out.println("array is empty....!");
          }   
      }
    }   
}

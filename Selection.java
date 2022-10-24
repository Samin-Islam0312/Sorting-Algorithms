/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sorting;

/**
 *
 * @author User
 */
public class Selection {
    public static void main(String[] args){
    int[] array = {34,5,12,7,44,6,9,0};
    int[] berry = {45,2,67,-1,3,21,6,5};
    //selectionSort(array);
    //selectionStable(berry);
    select(array);
    print(berry);
    }
    public static void print(int[] a){
    for(int i =0; i<a.length;i++){
        System.out.println(a[i]);
    }
    }
    public static void select(int[] a){
    int n = a.length;
    for(int i=0; i<n;i++){
        int max = i;
        for(int j=i+1; j<n-i-1;j++){
          if(a[max]<a[j]){
          max=j;
          }
        }
        int temp =a[i];
        a[i]= a[max];
        a[max]=temp;
    }
    }
    public static void selectionSort(int[] a){
    int n = a.length; 
    for(int i =0; i<n-1; i++){
    int small = i;
      for(int j =i+1; j<n;j++){
        if(a[small]>a[j]){
         small = j;
        }
      }
      int temp = a[i];
      a[i] = a[small];
      a[small] = temp;
     } 
    }
    
    public static void selectionStable(int[] a){
        int n = a.length;
        for(int i=0; i<n-1; i++){
         int small = i;
         for(int j =i+1; j<n;j++){
             if(a[small]>a[j])
                 small = j;
         }
             int key =a[small];
             while(small>i){
             a[small]=a[small-1];
             small--;
             }
             a[small]=key;
         
        }
    }
}

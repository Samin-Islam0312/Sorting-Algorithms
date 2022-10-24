/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sorting;

import java.util.Arrays;

/**
 *
 * @author User
 */

public class Merge{
    public static void main(String[] args){
      int[] a = {10,2,3,0,11,4};
      int[] arr = divide(a);
      for(int i:arr)
          System.out.print(i+" ");
    }
    public static int[] divide(int[] a){
        if(a.length==1)
            return a;
        
        int mid = a.length/2;
        int[] left = divide(Arrays.copyOfRange(a,0,mid));
        int[] right = divide(Arrays.copyOfRange(a, mid, a.length));
        
        return merge(left, right);
    }
    public static int[] merge(int[] l, int[] r){
       int[] merged = new int[l.length+r.length];
       int i = 0;
       int j = 0;
       int x = 0;
       while(i<l.length && j<r.length){
          if(l[i]<=r[j]){
              merged[x] = l[i];
              i++;
          }
          else{
              merged[x] = r[j];
              j++;
          }
          x++;
       }
       while(i<l.length){
           merged[x] = l[i];
           i++;
           x++;
    }
       while(j<r.length){
           merged[x] = r[j];
           j++;
           x++;
       }
      return merged;  
    }
}
//public class Merge {
//    public static void main(String[] args){
//     int[] a = {6,3,9,5,2,4,10};
//     divide(a,0, a.length-1);
//     for(int i=0; i<a.length; i++)
//         System.out.print(a[i]+" ");
//    }
//    public static void divide(int[] arr, int s, int e){
//        if(s>=e)
//            return;
//        int mid = s+(e-s)/2;
//        divide(arr, s, mid);
//        divide(arr, mid+1, e);
//        conquer(arr, s, mid, e);
//    }
//    
//    public static void conquer(int[] a, int s, int m, int e){
//        int[] merged = new int[e-s+1];
//        int first_a = s;
//        int second_a = m+1;
//        int x = 0;
//        
//        while(first_a<=m && second_a<=e){
//            if(a[first_a]<=a[second_a])
//                merged[x++] = a[first_a++];
//            else
//                merged[x++] = a[second_a++];
//        }
//        while(first_a<=m)
//            merged[x++] = a[first_a++];
//        
//        while(second_a<=e)
//            merged[x++] = a[second_a++];
//        //Copy all the numbers from merged to original array
//        
//        for(int i = 0,j = s ; i<merged.length; i++, j++)
//            a[j] = merged[i];
//    }
//    
//}

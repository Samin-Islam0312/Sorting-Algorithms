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
public class Quick_sort {
    public static void main(String[] args){
        int[] a = {6,3,9,5,2,8};
        int n = a.length;
        quick(a,0,n-1);
        for(int i =0; i<a.length; i++){
            System.out.println(a[i]);
        }
    }
    public static void quick(int[] a, int low, int high){
        if(low>high)
            return;
        else{
            int p_idx = partition(a, low, high);
            
            quick(a,low,p_idx-1);
            quick(a, p_idx+1, high);
        }
    }
    public static int partition(int[] arr, int l, int h){
        int pivot = arr[h];
        int i = l-1;
        for(int j = l; j<h; j++){
            if(arr[j]<pivot){
                i++;
                //swapping
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp =arr[i];
        arr[i] = pivot;
        arr[h] = temp;
        return i;
    }
}

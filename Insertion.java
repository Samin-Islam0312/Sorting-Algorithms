package Sorting;
/**
 *
 * @author Samin
 */
public class Insertion {
    public static void main(String[] args){
    int[] arr = {7,8,3,1,2,0};
    insertion(arr);
    print(arr);
    }
    public static void print(int[] a){
      for(int i=0; i<a.length;i++)
          System.out.println(a[i]);
    }
    public static void insertion(int[] a){
        int n = a.length;
        for(int i=1; i<n; i++){
        int j = i-1;
        int key = a[i];
        while(j>=0 && a[j]>key){
        a[j+1]=a[j];
        j--;
        }
        a[j+1] = key;
        }
    }
}

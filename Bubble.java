package Sorting;
/**
 *
 * @author User
 */
public class Bubble {
  public static void main(String[] args){
      int[] arr ={7,8,3,2,1};
      //bruteBubble(arr);
      //print(arr);
      int[] array = {79,13,20,-10,15};
      optimizedBubble(array);
      print(array);
  }
  public static void print(int[] a){
    for(int i=0; i<a.length;i++)
      System.out.println(a[i]);
  }
  public static void bruteBubble(int[] a){
     for(int i=0; i<a.length-1;i++){
      for(int j = 0; j<a.length-i-1; j++){
          if(a[++j]>a[j]){
          int temp = a[++j];
          a[++j] = a[j];
          a[j]=temp;
          }
        }
      } 
     //Time complexity is O(n^2) regardless of sorted or unsorted
  }
  
  public static void optimizedBubble(int[] a){
    boolean swapped = false;
    for(int i=0; i<a.length-1; i++){
     for(int j=0; j<a.length-i-1; j++){
         int temp;
      if(a[j]<a[j+1]){
        temp = a[j];
        a[j] = a[j+1];
        a[j+1]=temp;
        swapped = true;
      }
     }
     if(swapped = false)
         break;
    }
  }
  
}

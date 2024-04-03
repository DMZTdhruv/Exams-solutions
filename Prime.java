import java.util.Arrays;
import java.util.Scanner;

public class Prime {
  public static void main(String[] args) {
    int[] array1 = {1,2,3,5};
    int[] array2 = {1,2,3,5};

    if(isArrayEqual(array1, array2)){
      System.out.println("Arrays are equal");
    } else {
      System.out.println("Arrays are not equal");
    }
  }

  public static boolean isPrime(int num) {
    if(num <= 1) {
      return false;
    }
    for(int i=2;i*i<=num;i++) {
      if(num%i == 0) {
        return false;
      }
    }
    return true;
  }

  public static boolean isArrayEqual(int arr[], int arr2[]){

    if(arr.length != arr2.length) {
      return false;
    }

    for(int i=0;i<arr.length;i++) {
      if(arr[i] != arr2[i]){
        return false;
      }
    }
    
    return true;
  }
}

import java.util.Arrays;

public class ArrayOps{
  //4a
  public static int sum(int[] arr){
    int sum = 0;
    for (int i=0; i<arr.length; i++){
      sum+=arr[i];
    }
    return sum;
  }

  //4b
  public static int largest(int[] arr){
    int largest=arr[0];
    for (int i=0; i<arr.length; i++){
      if (arr[i]>largest){
        largest=arr[i];
      }
    }
    return largest;
  }

  //4c
  public static int[] sumRows(int[][] matrix){
    int[] sumRows = new int[matrix.length];
    for (int row=0; row<matrix.length; row++){
      sumRows[row]=sum(matrix[row]);
    }
    return sumRows;
  }

  //4d
  public static int[] largestInRows(int[][] matrix){
    int[] largestPerRow = new int[matrix.length];
    for (int row=0; row<matrix.length; row++){
      largestPerRow[row]=largest(matrix[row]);
    }
    return largestPerRow;
  }

  //4e
  public static int sum(int[][] arr){
    int sum=0;
    for (int i=0; i<sumRows(arr).length; i++){
      sum+=sumRows(arr)[i];
    }
    return sum;
  }
/*
  public static int[] sumCols(int[][] matrix){

  }

  public static boolean isRowMagic(int[][] matrix){

  }

  public static boolean isColMagic(int[][] matrix){

  }

  public static boolean isLocationMagic(int[][] matrix, int row, int col){

  }
  */

  public static void main(String[] args) {

  }

}

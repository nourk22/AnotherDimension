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

  //5a
  public static int[] sumCols(int[][] matrix){
    if (matrix.length==0){
      int[] empty={};
      return empty;
    }
    int[] sumCols = new int[matrix[0].length];
    int curr_sum=0;
    for (int col=0; col<matrix[0].length; col++){
      for (int row=0; row<matrix.length; row++){
        curr_sum+=matrix[row][col];
      }
      sumCols[col]=curr_sum;
      curr_sum=0;
    }
    return sumCols;
  }

  //5b
  public static boolean isRowMagic(int[][] matrix){
    boolean isMagic=true;
    int[] sumRows=new int [matrix.length];
    sumRows=sumRows(matrix);
    for (int i=0; i<sumRows.length-1; i++){
      if (sumRows[i]!=sumRows[i+1]){
        isMagic=false;
      }
    }
    return isMagic;
  }

  public static boolean isColMagic(int[][] matrix){
    boolean isMagic=true;
    int[] sumCols=new int [matrix.length];
    sumCols=sumCols(matrix);
    for (int i=0; i<sumCols.length-1; i++){
      if (sumCols[i]!=sumCols[i+1]){
        isMagic=false;
      }
    }
    return isMagic;
  }

  public static boolean isLocationMagic(int[][] matrix, int row, int col){
  //  int[] sumRows=new int [matrix.length];
  //  sumRows=sumRows(matrix);
  //  int[] sumCols=new int [matrix.length];
  //  sumCols=sumCols(matrix);
  //  return sumRows[row]==sumCols[col];
  // simpler
  return sumRows(matrix)[row]==sumCols(matrix)[col];
  }

  public static void main(String[] args) {
//tests are in Tester.java
  }

}

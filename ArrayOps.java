public class ArrayOps{
  //4a
  public static int sum(int[] arr){
    int sum = 0;
    for (int i=0; i<arr.length; i++){
      sum+=arr[i];
    }
    return sum;
  }

  public static int largest(int[] arr){
    int largest=arr[0];
    for (int i=0; i<arr.length; i++){
      if (arr[i]>largest){
        largest=arr[i];
      }
    }
    return largest;
  }

  /*public static int[] sumRows(int[][] matrix){

  }

  public static int largestInRows(int[][] matrix){

  }

  public static int sum(int[][] arr){

  }

  public static int sumCols(int[][] matrix){

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

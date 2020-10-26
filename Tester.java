import java.util.Arrays;

public class Tester{
  public static void main(String[] args) {
    //testing 4a
    int[] a = {5, 2, 3, 4, 5};
    int[] b = {2, 4, 8, 6};
    int[] c = {100, 150, 150, 200};
    int[] d = {};

    int[][] w = new int[3][a.length];
    w[0]=a;
    w[1]=a;
    w[2]=a;

    int[][] x = new int[2][b.length];
    x[0]=a;
    x[1]=b;

    int[][] y = new int[2][a.length];
    y[0]=a;
    y[1]=c;

    int[][] z = new int[4][a.length];
    z[0]=a;
    z[1]=b;
    z[2]=c;
    z[3]=b;

    int[][] empty=new int[2][0];
    int[][] empty2=new int[1][0];
    int[][] empty3=new int[0][0];

    int[][] rect = new int[2][4];
    rect[0]=b;
    rect[1]=c;

    int[][] rect2 = new int[4][4];
    rect2[0]=b;
    rect2[1]=c;
    rect2[2]=c;
    rect2[3]=b;

    int[][] rect3 = { {1, 2, 3},
                      {9, 7, 5},
                      {5, 7, 9},
                      {3, 2, 1}};

    int[][]  A = { {  1,  0, 12, -1 },
                  {  7, -2,  2,  1 },
                  { -5, -2,  2, -9 }
               };
    int[]  B  =   {  1, 3, 5 };

  /*  System.out.println(ArrayOps.sum(a)); //expecting 19
    System.out.println(ArrayOps.sum(b)); //expecting 20
    System.out.println(ArrayOps.sum(c)); //expecting 600
    System.out.println(ArrayOps.sum(d)); //expecting 0

    //testing 4b
    System.out.println(ArrayOps.largest(a)); //expecting 5
    System.out.println(ArrayOps.largest(b)); //expecting 8
    System.out.println(ArrayOps.largest(c)); //expecting 200

    //testing 4c
    System.out.println(Arrays.toString(ArrayOps.sumRows(x))); //expecting [19, 20]
    System.out.println(Arrays.toString(ArrayOps.sumRows(y))); //expecting [19, 600]
    System.out.println(Arrays.toString(ArrayOps.sumRows(z))); //expecting [19, 20, 600, 20]
    System.out.println(Arrays.toString(ArrayOps.sumRows(empty))); //expecting [0, 0]
    System.out.println(Arrays.toString(ArrayOps.sumRows(empty2))); //expecting [0]
    System.out.println(Arrays.toString(ArrayOps.sumRows(empty3))); //expecting []

    //testing 4d
    System.out.println(Arrays.toString(ArrayOps.largestInRows(x))); //expecting [5, 8]
    System.out.println(Arrays.toString(ArrayOps.largestInRows(y))); //expecting [5, 200]
    System.out.println(Arrays.toString(ArrayOps.largestInRows(z))); //expecting [5, 8, 200, 8]


    //testing 4e
    System.out.println(ArrayOps.sum(x)); //expecting 39
    System.out.println(ArrayOps.sum(y)); //expecting 619
    System.out.println(ArrayOps.sum(z)); //expecting 659
    System.out.println(ArrayOps.sum(empty)); //expecting 0
    System.out.println(ArrayOps.sum(empty2)); //expecting 0
    System.out.println(ArrayOps.sum(empty3)); //expecting 0

    //Mr. K's tests for 4
    System.out.println( Arrays.toString(ArrayOps.sumRows(A))); //expected output:[12, 8, -14]

    System.out.println(Arrays.toString(ArrayOps.largestInRows(A))); //expected output:[12, 7, 2]

    System.out.println( ArrayOps.sum(B)); //expected output: 9

    System.out.println( ArrayOps.sum(A));   //this calls the overloaded 2d array version!
    //expected output: 6

    //testing 5a
    System.out.println(Arrays.toString(ArrayOps.sumCols(rect))); //expecting [102, 154, 158, 206]
    System.out.println(Arrays.toString(ArrayOps.sumCols(rect2))); //expecting [204, 308, 316, 412]
    System.out.println(Arrays.toString(ArrayOps.sumCols(empty))); //expecting []
    System.out.println(Arrays.toString(ArrayOps.sumCols(empty2))); //expecting []
    System.out.println(Arrays.toString(ArrayOps.sumCols(empty3))); //expecting []

    //testing 5b
    System.out.println(ArrayOps.isRowMagic(x)); //expecting false
    System.out.println(ArrayOps.isRowMagic(y)); //expecting false
    System.out.println(ArrayOps.isRowMagic(z)); //expecting false
    System.out.println(ArrayOps.isRowMagic(w)); //expecting true
    System.out.println(ArrayOps.isRowMagic(empty)); //expecting true
    System.out.println(ArrayOps.isRowMagic(empty2)); //expecting true
    System.out.println(ArrayOps.isRowMagic(empty3)); //expecting true

    //testing 5c
    System.out.println(ArrayOps.isColMagic(rect)); //expecting false
    System.out.println(ArrayOps.isColMagic(rect2)); //expecting false
    System.out.println(ArrayOps.isColMagic(rect3)); //expecting true
    System.out.println(ArrayOps.isColMagic(w)); //expecting false
    System.out.println(ArrayOps.isColMagic(empty)); //expecting true
    System.out.println(ArrayOps.isColMagic(empty2)); //expecting true
    System.out.println(ArrayOps.isColMagic(empty3)); //expecting true
*/

    //testing 5d
    System.out.println(ArrayOps.isLocationMagic(rect, 0, 2)); //expecting false
    System.out.println(ArrayOps.isLocationMagic(rect2, 3, 3)); //expecting false
    System.out.println(ArrayOps.isLocationMagic(rect3, 1, 2)); //expecting false
    System.out.println(ArrayOps.isLocationMagic(w, 1, 4)); //expecting false

  }
}

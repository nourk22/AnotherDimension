import java.util.Arrays;

public class Tester{
  public static void main(String[] args) {
    //testing 4a
    int[] a = {5, 2, 3, 4, 5};
    int[] b = {2, 4, 8, 6};
    int[] c = {100, 150, 150, 200};
    int[] d = {};

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

    System.out.println(ArrayOps.sum(a)); //expecting 19
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

    //
    /*System.out.println(ArrayOps.
    System.out.println(ArrayOps.
    System.out.println(ArrayOps.
    System.out.println(ArrayOps.
    */
  }
}

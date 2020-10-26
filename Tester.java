public class Tester{
  public static void main(String[] args) {
    //testing 4a
    int[] a = {5, 2, 3, 4, 5};
    int[] b = {2, 4, 8, 6};
    int[] c = {100, 150, 150, 200};
    int[] d = {};
    System.out.println(ArrayOps.sum(a)); //expecting 19
    System.out.println(ArrayOps.sum(b)); //expecting 20
    System.out.println(ArrayOps.sum(c)); //expecting 600
    System.out.println(ArrayOps.sum(d)); //expecting 0

    //testing 4b
    System.out.println(ArrayOps.largest(a)); //expecting 5
    System.out.println(ArrayOps.largest(b)); //expecting 8
    System.out.println(ArrayOps.largest(c)); //expecting 200

    //
  /*  System.out.println(ArrayOps.
    System.out.println(ArrayOps.
    System.out.println(ArrayOps.
    System.out.println(ArrayOps.

    //
    System.out.println(ArrayOps.
    System.out.println(ArrayOps.
    System.out.println(ArrayOps.
    System.out.println(ArrayOps.
    */
  }
}

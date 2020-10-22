import java.util.Arrays;

class Tester{
  static int[] test1 = new int [] {1,2,3,4,5,6};
  static int[] test2 = new int [] {191,181,175,168,145,125};
  static int[][] test3 = new int [][] {{1,2,3,4,5,6}, {191,181,175,168,145,125}};
  static int[][]  A = { {  1,  0, 12, -1 },
                  {  7, -2,  2,  1 },
                  { -5, -2,  2, -9 }
               };
  static int[][] B = { {  1,  2, 3, 4 },
   {  2, 3,  4,  1 },
   { 3, 4,  1, 2 } };
  static int[][] C = { {  1,  1, 1 },
   {  2, 2, 2 },
   { 3,  3, 3 } };
  static int[][] D = { {  2,  2, 2 },
   {  2, 2, 2 } };
  static int[][] E = {
    {  2,  4, 2 },
    {  2, 2, 2 } };
  public static void main(String[] args) {
    System.out.println(ArrayOps.sum(test1));
    System.out.println(ArrayOps.sum(test2));
    System.out.println(ArrayOps.largest(test1));
    System.out.println(ArrayOps.largest(test2));
    System.out.println(Arrays.toString(ArrayOps.sumRows(test3)));
    System.out.println(Arrays.toString(ArrayOps.largestInRows(test3)));
    System.out.println(ArrayOps.sum(test3));
    System.out.println(Arrays.toString(ArrayOps.sumCols(A)));
    System.out.println(ArrayOps.isRowMagic(A));
    System.out.println(ArrayOps.isRowMagic(B));
    System.out.println(ArrayOps.isRowMagic(C));
    System.out.println(ArrayOps.isRowMagic(D));
    System.out.println(ArrayOps.isColMagic(A));
    System.out.println(ArrayOps.isColMagic(B));
    System.out.println(ArrayOps.isColMagic(C));
    System.out.println(ArrayOps.isColMagic(D));
    System.out.println(ArrayOps.isLocationMagic(E, 0, 1));
    System.out.println(ArrayOps.isLocationMagic(E, 1, 1));
  }
}

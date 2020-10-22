import java.util.Arrays;

class Tester{
  static int[] test1 = new int [] {1,2,3,4,5,6};
  static int[] test2 = new int [] {191,181,175,168,145,125};
  static int[][] test3 = new int [][] {{1,2,3,4,5,6}, {191,181,175,168,145,125}};
  public static void main(String[] args) {
    System.out.println(ArrayOps.sum(test1));
    System.out.println(ArrayOps.sum(test2));
    System.out.println(ArrayOps.largest(test1));
    System.out.println(ArrayOps.largest(test2));
    System.out.println(Arrays.toString(ArrayOps.sumRows(test3)));
    System.out.println(Arrays.toString(ArrayOps.largestInRows(test3)));
    System.out.println(ArrayOps.sum(test3));
  }
}

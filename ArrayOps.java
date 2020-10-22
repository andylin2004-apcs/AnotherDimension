class ArrayOps{
  public int[] sum(int[] arr) {
    int total = 0;
    for (int i = 0; i<arr.length; i++){
      total += arr[i];
    }
    return total;
  }
  public int[] largest(int[]arr) {
    int highest = 0;
    for (int i = 0; i<arr.length; i++){
      highest = Math.max(highest,arr[i]);
    }
    return highest;
  }
  public static int[] sumRows(int[][] matrix) {
    int[] result = new int[matrix.length];
    for (int i = 0; i<arr.length; i++){
      result[i] = sum(result[i]);
    }
    return result;
  }
}

class ArrayOps{
  public static int sum(int[] arr) {
    int total = 0;
    for (int i = 0; i<arr.length; i++){
      total += arr[i];
    }
    return total;
  }
  public static int largest(int[]arr) {
    int highest = 0;
    for (int i = 0; i<arr.length; i++){
      highest = Math.max(highest,arr[i]);
    }
    return highest;
  }
  public static int[] sumRows(int[][] matrix) {
    int[] result = new int[matrix.length];
    for (int i = 0; i<matrix.length; i++){
      result[i] = sum(matrix[i]);
    }
    return result;
  }
  public static int[] largestInRows(int[][] matrix) {
    int[] result = new int[matrix.length];
    for (int i = 0; i<matrix.length; i++){
      result[i] = largest(matrix[i]);
    }
    return result;
  }
  public static int sum(int[][] arr) {
    int[] temp = sumRows(arr);
    int result = 0;
    for (int i = 0; i<temp.length; i++){
      result += temp[i];
    }
    return result;
  }
}

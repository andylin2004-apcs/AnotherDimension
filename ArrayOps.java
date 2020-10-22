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
    return sum(temp);
  }
  public static int[] sumCols(int[][] matrix) {
    int[] result = new int[matrix[1].length];
    for (int column = 0; column<matrix[1].length; column++){
      for (int row = 0; row<matrix.length; row++){
        result[column] += matrix[row][column];
      }
    }
    return result;
  }
  public static boolean isEqual(int[] arr){
    for (int i = 0; i<arr.length-1; i++){
      if(arr[i] != arr[i+1]){
        return false;
      }
    }
    return true;
  }
  public static boolean isRowMagic(int[][] matrix) {
    int[] rowSum = sumRows(matrix);
    return isEqual(rowSum);
  }
  public static boolean isColMagic(int[][] matrix) {
    int[] colSum = sumCols(matrix);
    return isEqual(colSum);
  }
  public static boolean isLocationMagic(int[][] matrix, int row, int col) {
    int[] rowSum = sumRows(matrix);
    int[] colSum = sumCols(matrix);
    return rowSum[row] == colSum[col];
  }
}

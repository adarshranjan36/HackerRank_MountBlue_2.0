class Result {

    /*
     * Complete the 'quickSort' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static List<Integer> quickSort(List<Integer> arr) {
      int pivot=arr.get(0);
      List<Integer> left=new ArrayList<>();
      List<Integer> right=new ArrayList<>();
      List<Integer> equal=new ArrayList<>();
      List<Integer> result=new ArrayList<>();
      
      for(int num:arr){
        if(num<pivot){
          left.add(num);
        }
        else if(num>pivot){
          right.add(num);
        }
        else{
          equal.add(num);
        }
      }
      result.addAll(left);
      result.addAll(equal);
      result.addAll(right);
      return result;
    }

}

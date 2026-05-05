class Result {

    /*
     * Complete the 'bonAppetit' function below.
     *
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY bill
     *  2. INTEGER k
     *  3. INTEGER b
     */

    public static void bonAppetit(List<Integer> bill, int k, int b) {
      int total=0;
      for(int price:bill){
        total+=price;
      }
      int actual=(total-bill.get(k))/2;
      if(b==actual){
        System.out.println("Bon Appetit");
      }
      else{
        System.out.println(b-actual);
      }
    }

}

class Result {

    /*
     * Complete the 'staircase' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void staircase(int n) {
    // Write your code here
      for(int i=1;i<=n;i++){
        StringBuilder sb=new StringBuilder();
        //adding space
        for(int j=0;j<n-i;j++){
          sb.append(" ");
        }
        //adding hash
        for(int k=0;k<i;k++){
          sb.append("#");
        }
        System.out.println(sb.toString());
      }
    }

}

class Result {

    /*
     * Complete the 'getTotalX' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY b
     */

    public static int getTotalX(List<Integer> a, List<Integer> b) {
      int lcmA=a.get(0);
      for(int i=1;i<a.size();i++){
        lcmA=getLCM(lcmA,a.get(i));
      }
      int gcdB=b.get(0);
      for(int i=1;i<b.size();i++){
        gcdB=getGCD(gcdB,b.get(i));
      }
      int count=0;
      int multiple=0;
      while(multiple<=gcdB){
        multiple+=lcmA;
        if(multiple<=gcdB && gcdB%multiple==0){
          count++;
        }
      }
      return count;
    }
  //find GCD
  private static int getGCD(int n1,int n2){
    if(n2==0) return n1;
    return getGCD(n2,n1%n2);
  }
  //find LCM
  private static int getLCM(int n1,int n2){
    if(n1==0||n2==0) return 0;
    int gcd=getGCD(n1,n2);
    return Math.abs(n1*n2)/gcd;
  }

}

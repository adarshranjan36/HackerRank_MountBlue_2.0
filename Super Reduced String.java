class Result {

    /*
     * Complete the 'superReducedString' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String superReducedString(String s) {
      StringBuilder sb=new StringBuilder();
      for(int i=0;i<s.length();i++){
        char current=s.charAt(i);
        int lastIdx=sb.length()-1;
        if(sb.length()>0&&sb.charAt(lastIdx)==current){
          sb.deleteCharAt(lastIdx);
        }
        else{
          sb.append(current);
        }
      }
      String result=sb.toString();
      return result.isEmpty()?"Empty String":result;

    }

}

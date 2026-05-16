public static void plusMinus(List<Integer> arr) {
      int positive=0;
      int negative=0;
      int zero=0;
      int total=arr.size();
      for(int num:arr){
        if(num>0){
          positive++;
        }
        else if(num<0){
          negative++;
        }
        else{
          zero++;
        }
      }
      System.out.printf("%.6f%n",(double)positive/total);
      System.out.printf("%.6f%n",(double)negative/total);
      System.out.printf("%.6f%n",(double)zero/total);
    }

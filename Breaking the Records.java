public static List<Integer> breakingRecords(List<Integer> scores) {
      int high=scores.get(0);
      int low=scores.get(0);
      int max=0,min=0;
      for(int i=1;i<scores.size();i++){
        int current=scores.get(i);
        if(current>high){
          high=current;
          max++;
        }
        else if(current<low){
          low=current;
          min++;
        }
      }
      return Arrays.asList(max,min);
    }

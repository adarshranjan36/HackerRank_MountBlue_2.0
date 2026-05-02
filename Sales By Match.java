public static int sockMerchant(int n, List<Integer> ar) {
      Set<Integer> set=new HashSet<>();
      int pair=0;
      for(int color:ar){
        if(set.contains(color)){
          set.remove(color);
          pair++;
        }
        else{
          set.add(color);
        }
      }
      return pair;
    }

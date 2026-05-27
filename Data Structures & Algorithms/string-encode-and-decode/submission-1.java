class Solution {

    public String encode(List<String> strs) {
      StringBuilder sb = new StringBuilder();
      for(String str: strs){
        sb.append(str.length()).append('#').append(str);
      }
      return sb.toString();
    }
    public List<String> decode(String str) {
      List<String> list = new ArrayList<>();
    //   while(str.length()>0){
    //     int k = 0;
    //     int i=0;
    //     while(str.charAt(i)!='#' ){
    //       int n = str.charAt(i)-'0';
    //       k=k*10+n;
    //       i++;
    //     }
        
    //     if(str.length()>k){
    //     list.add(str.substring(i+1,i+1+k));
    //     str=str.substring(i+k+1);
    //     }else{
    //       list.add(str);
    //     }

    //   }
        //More Optimal
        //11#asasasd f  f  g.  h  1  2. #
        //0123456789 10 11 12 13 14 15
        int i=0;
        while (i<str.length()){
            int k=0;
            while(str.charAt(i)!='#'){
                k=k*10+(str.charAt(i)-'0');
                i++;
            }
            i++;
            list.add(str.substring(i,i+k));
            i+=k;
        }



      return list;
    }
}

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
      while(str.length()>0){
        int k = 0;
        int i=0;
        while(str.charAt(i)!='#' ){
          int n = str.charAt(i)-'0';
          k=k*10+n;
          i++;
        }
        
        if(str.length()>k){
        list.add(str.substring(i+1,i+1+k));
        str=str.substring(i+k+1);
        }else{
          list.add(str);
        }

      }
      return list;
    }
}

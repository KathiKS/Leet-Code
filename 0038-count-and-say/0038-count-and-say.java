class Solution {
    private static String built(String s){
        StringBuilder sb=new StringBuilder();
        int pos=0;
        int len=s.length();
        while(pos<len){
            int count=1;
            while(pos<len-1&&s.charAt(pos)==s.charAt(pos+1)){
                count++;
                pos++;
            }
            sb.append(count);
            sb.append(s.charAt(pos));
            pos++;
        }
        return sb.toString();
    }
    public String countAndSay(int n) {
        String ans="1";
        for(int i=1;i<n;i++){
            ans=built(ans);
        }
        return ans;
    }
}
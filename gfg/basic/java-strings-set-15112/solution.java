class Solution {
    static String conRevstr(String s1, String s2) {
        // code here
        String ans=s1.concat(s2);
        String result="";
        for(int i=ans.length()-1;i>=0;i--){
            result+=ans.charAt(i);
        }
        return result;
    }
}
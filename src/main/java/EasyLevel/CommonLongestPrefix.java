package EasyLevel;

public class CommonLongestPrefix {
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        //change
        String[] arrs = {"flower","flight","flow"};
        String res = function(arrs);
        System.out.println(res);
    }

    public static String function(String[] strs){
        if(strs.length == 0 || null == strs) return "";
        for(int i = 0; i < strs[0].length(); i++){
            char c = strs[0].charAt(i);
            for(int j = 1; j < strs.length; j++){
                if(i == strs[j].length() || c != strs[j].charAt(i)){
                    return strs[0].substring(0,i);
                }
            }
        }
        return strs[0];
    }
}

package EasyLevel;

public class RemoveDuplicateNumber {
    /**
     * 给定 nums = [0,0,1,1,1,2,2,3,3,4],
     *
     * 函数应该返回新的长度 5, 并且原数组 nums 的前五个元素被修改为 0, 1, 2, 3, 4。
     */
    public static void main(String[] args) {
        int[] nums = {0,1,1,2,3,4};
        int result = returnLength(nums);
        System.out.println(result);
    }
    public static int returnLength(int[] arrs){
        int i = 0;
        for(int j = 1; j < arrs.length; j++){
            if(arrs[i] != arrs[j]){
                i ++;
                arrs[i] = arrs[j];
            }
        }
        return i + 1;
    }
}

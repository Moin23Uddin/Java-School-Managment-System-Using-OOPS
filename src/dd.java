//import java.util.ArrayList; // import the ArrayList class
//
//import java.util.Arrays;
//
//class Solution {
//
//    public String twoSum(int[] nums, int target) {
//        ArrayList<Integer> jrr = new ArrayList<Integer>();
//        int o = 0;
////        int addi=0;
//
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i+1; j < nums.length; j++) {
//                int addi=nums[i]+nums[j];
//
////                o+=addi;
//                if (addi == target) {
//                    // System.out.println("fefwe");
//
//                    jrr.add(i);
//                    jrr.add(j);
//                    o+=1;
//
//
//                }
//                break;
//
//
//            }
//            if(o>0) {
//                break;
//            }
//
//
//
//
//
//
//        }
//        int[] resultArray = new int[jrr.size()];
//        for (int k = 0; k < jrr.size(); k++) {
//            resultArray[k] = jrr.get(k);
//        }
//
//        int[] stringArray = new int[resultArray.length];
//        for (int i = 0; i < resultArray.length; i++) {
//
//
//            stringArray[i]=  Integer.parseInt(String.valueOf(resultArray[i]));;
//
//
//
//
//        }
//
//        return stringArray;
//    }
//
//
//
//    public static void main(String[] args) {
//        int[] nums = { 2, 7, 11, 15 };
//
//        int target = 9;
//        Solution p = new Solution();
//        int[] z = p.twoSum(nums, target);
//        System.out.println(z);
//    }
//
//}

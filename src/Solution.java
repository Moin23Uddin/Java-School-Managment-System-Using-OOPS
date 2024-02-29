//import java.util.Arrays;
//import java.util.Objects;
//
//class Solution {
//    public int[] plusOne(int[] digits) {
//        String r = "";
//        long k = 0;
//        long n = 0;
//        String t = "";
//        char oi;
//        long tii = 0;
//
//        for (int i = 0; i < digits.length; i++) {
//            r += String.valueOf(digits[i]);
//
//        }
//        k = Integer.parseInt(r);
//        n = k + 1;
//        t = String.valueOf(n);
//        long[] digits2 = new long[t.length()];
//        for (int i = 0; i < t.length(); i++) {
//            oi = t.charAt(i);
//            tii = Integer.parseInt(String.valueOf(oi));
//            digits2[i] = tii;
//
//        }
//
//        return digits2;
//
//    }
//
//    public static void main(String[] args) {
//        int[] digits1 = { 9,8,7,6,5,4,3,2,1,0};
//
//        Solution t = new Solution();
//        int[] ti = t.plusOne(digits1);
//        System.out.println(Arrays.toString(ti));
//
//    }
//}
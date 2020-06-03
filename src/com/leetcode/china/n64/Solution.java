package com.leetcode.china.n64;

/**
 * @author juna3
 * @create 2020-06-02
 *
 */
public class Solution {
    int ret = 0;

    /**
     * 正解
     * 利用了逻辑运算发 短路效应 和 递归 求和
     * @param n
     * @return
     */
    public int sumNums(int n) {
        boolean x = n > 1 && sumNums(n - 1) > 1;    //sumNums(n - 1) > 1 大号后面数字任意
        ret += n;
        return ret;
    }

    /**
     * 递归求和
     * @param n
     * @return
     */
    public int sumNums2(int n) {
        if (n == 1)
            return 1;
        return n + sumNums2(n - 1);
    }

    /**
     * 遍历求和
     * @param n
     * @return
     */
    public int sumNums3(int n) {
        int ret = 0;
        for (int i = 1; i <= n; i++) {
            ret += i;
        }
        return ret;
    }

    /**
     * 公式求和
     * @param n
     * @return
     */
    public int sumNums4(int n) {
        return (1 + n) * n / 2;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        int ret = solution.sumNums(10);
        System.out.println("ret = " + ret);


    }
}

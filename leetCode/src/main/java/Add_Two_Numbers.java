
/*
You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.


Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807.
Example 2:

Input: l1 = [0], l2 = [0]
Output: [0]
Example 3:

Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
Output: [8,9,9,9,0,0,0,1]

 */


import java.util.Arrays;

public class Add_Two_Numbers {
    public static void main(String[] args) {
        int[] l1 = {9,9,9,9,9,9,9};
        int[] l2 = {9,9,9,9};

        System.out.println(Arrays.toString(addTwoNumbers(l1, l2)));
    }

    public static int[] addTwoNumbers(int[] l1, int[] l2) {
        int sum = 0;
        reverse(l1);

        reverse(l2);
        int resultl1 =  sumArray(l1);
        System.out.println(resultl1);
        int resultl2 =  sumArray(l2);
        System.out.println(resultl2);

        sum = resultl1 + resultl2;
        String s = Integer.toString(sum);
        int[] arr = new int[s.length()];
        for (int i = s.length() - 1; i >= 0; i--) {
            arr[i] = sum % 10;
            sum /= 10;
        }
        reverse(arr);
            return arr;
    }

    public static void reverse(int[] l1) {
        for (int i = 0; i < l1.length / 2; i++) {
            int temp = l1[i];
            l1[i] = l1[l1.length - i - 1];
            l1[l1.length - i - 1] = temp;
        }
    }

    public static int sumArray(int[] l1){
        int result1 = 0;
        for (int i =l1.length -1 , n = 0; i >= 0; --i, n++) {
            int pos = (int)Math.pow(10, i);
            result1 += l1[n] * pos;
        }
        return result1;
    }


}
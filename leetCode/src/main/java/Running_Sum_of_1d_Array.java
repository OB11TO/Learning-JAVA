
/*
Дано массив чисел. Мы определяем текущую сумму массива как runningSum[i] = sum(nums[0]...nums[i]).

Верните текущую сумму чисел.



Пример 1:

Вход: nums = [1,2,3,4]
Выход: [1,3,6,10]
Пояснение: Текущая сумма получается следующим образом: [1, 1+2, 1+2+3, 1+2+3+4].
Пример 2:

Вход: nums = [1,1,1,1,1]
Выход: [1,2,3,4,5]
Пояснение: Текущая сумма получается следующим образом: [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1].
Пример 3:

Вход: nums = [3,1,2,10,1]
Выход: [3,4,6,16,17]


Ограничения:

1 <= nums.длина <= 1000
-10^6 <= nums[i] <= 10^6
 */

import java.util.Arrays;

public class Running_Sum_of_1d_Array {
    public static void main(String[] args) {
        int[] num = {1,1,1,1,1};
        System.out.println(Arrays.toString(runningSum(num)));
    }

    public static int[] runningSum(int[] nums) {
        int sum = nums[0];
        for(int i = 1; i <nums.length; i++){
            sum = sum + nums[i];
            nums[i] = sum;
        }
        return nums;
    }
}

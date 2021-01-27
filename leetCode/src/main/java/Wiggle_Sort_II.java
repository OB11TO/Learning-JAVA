import java.util.Arrays;

/*
Задается целочисленный массив nums, переупорядочить его таким образом, чтобы nums[0] < nums[1] > nums[2] < nums[3]....

Вы можете предположить, что входной массив всегда имеет правильный ответ.



Пример 1:

Ввод: nums = [1,5,1,1,6,4]
              1 1 1 4 5 6
              1 6 1 5 5 4
              1 6 1 5 1 4

Выход: [1,6,1,5,1,4]
Объяснение: [1,4,1,5,1,6] также принимается.
Пример 2:

Ввод: nums = [1,3,2,2,3,1]
Выход: [2,3,1,3,1,2]


Ограничения:

1 <= nums.length <= 5 * 104
0 <= nums[i] <= 5000
Гарантируется, что на данный вход будет дан ответ nums.

 nums[0] < nums[1] > nums[2] <

        //1, 5, 1, 1, 6, 4
        //1, 1, 1, 4, 5, 6
        //X, 6, X, 5, X, 4
        //1, 6, 1, 5, 1, 4
 */

public class Wiggle_Sort_II {
    public static void main(String[] args) {
        int[] num = {1,5,1,1,6,4};
        System.out.print(Arrays.toString(wiggleSort(num)));
    }
    public static int[] wiggleSort(int[] nums) {
        Arrays.sort(nums); //сортируем массив
        System.out.println(Arrays.toString(nums));
        System.out.println(nums.length+ "\n");
        int[] tmp = new int[nums.length]; // создаем новый на основе
        for(int i=0;i<nums.length;i++) {
            tmp[i] = nums[i];
        }

        int count = nums.length-1; // если 5, то 4
       System.out.println(count);
        System.out.println(Arrays.toString(tmp));
        for(int i=1;i<nums.length;i=i+2){
            nums[i] = tmp[count--];
            System.out.println(nums[i]);
          //  System.out.println(tmp[count--]);
        }
        System.out.println(Arrays.toString(nums));
        for(int i=0;i<nums.length;i=i+2){
            nums[i] = tmp[count--];
            System.out.println(nums[i]);
        }
        System.out.println(Arrays.toString(nums));
        return nums;
    }
}

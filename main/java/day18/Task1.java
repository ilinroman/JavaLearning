package main.java.day18;

public class Task1 {
    public static void main(String[] args) {
        int[] numbers = {1,10,11,0,3};
        System.out.println(recursionSum(numbers, 0));
    }

    /**
     * Рекурсивный метод, который вернет сумму чисел в массиве ​numbers
     * @param nums массив чисел
     * @param i индекс текущего элемента массива
     * @return сумма
     */
    private static int recursionSum(int[] nums, int i) {
        return i < nums.length ? nums[i++] + recursionSum(nums, i) : 0;
    }
}

package com.company;

public class Main {

    public static void main(String[] args) {
	    double[] nums = new double[15];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Math.random()*200 - 100;
            System.out.println(nums[i]);
        }
        //Ищем индекс первого отрицательного значения элемента
        int j = 0;
        while (nums[j] > 0){
            j++;
        }
        System.out.println("\n--------------\n");
        //Создаем новый массив без переменных стоящих до первого отрицательного значения
        double[] newArr = new double[nums.length - j];
        for (int k = 0; k < newArr.length ; k++) {
            newArr[k] = nums[k + j];
            System.out.println(newArr[k]);
        }
        //C помощью метода находим среднее арифметическое и выводим результат на экран
        double value = arithmeticMean(newArr);
        System.out.println(value);
    }
    public static double arithmeticMean(double[] nums){
        double sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
        }
        return sum / nums.length;
    }
    //Алгоритм сортировки выбором, из допзадания, который я скатал с инета
    public static void sort(double[] array) {
        for (int i = 0; i < array.length; i++) {    // i - номер текущего шага
            int pos = i;
            double min = array[i];
            // цикл выбора наименьшего элемента
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    pos = j;    // pos - индекс наименьшего элемента
                    min = array[j];
                }
            }
            array[pos] = array[i];
            array[i] = min;    // меняем местами наименьший с array[i]
        }
    }
}

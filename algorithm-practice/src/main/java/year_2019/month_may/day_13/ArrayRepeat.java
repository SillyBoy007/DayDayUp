package year_2019.month_may.day_13;


public class ArrayRepeat {
    public static boolean duplicate(int numbers[],int length,int [] duplication) {
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < length; i++){
            sb.append(numbers[i] + "");
        }
        for(int j = 0; j < length; j++){
            if(sb.indexOf(numbers[j]+"") != sb.lastIndexOf(numbers[j]+"")){
                duplication[0] = numbers[j];
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int [] arr = {4,5,6,9,4,3};
        boolean duplicate = duplicate(arr, 6, arr);
        System.out.println(duplicate);
    }
}

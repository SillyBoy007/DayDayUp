package year_2019.month_may.day_14;

/**
 * 查找数组中的重复数字
 */
public class ArrayRepeat {
    private static Integer arrRepeat(int[] arr){
        StringBuffer stringBuffer = new StringBuffer();
        for (int i=0;i<arr.length;i++){
            stringBuffer.append(arr[i]+"");
        }
        for (int i=0;i<stringBuffer.length();i++){
            if (stringBuffer.indexOf(arr[i]+"") != stringBuffer.lastIndexOf(arr[i]+"")){
                return arr[i];
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,5,7};
        System.out.println(arrRepeat(arr));
    }
}

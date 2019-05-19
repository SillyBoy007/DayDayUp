package year_2019.month_may.day_14;

public class ArrayRepeatFind {
    public static Integer getRepeatNumber(int[] arr){
        StringBuffer sb = new StringBuffer();
        for (int i =0;i<arr.length;i++){
             sb.append(arr[i]+"");
        }
        for (int j =0;j<sb.length();j++){
            if (sb.indexOf(arr[j]+"") != sb.lastIndexOf(arr[j]+"")){
                return arr[j];
            }

        }
        return null;
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,2,6};
        System.out.println(getRepeatNumber(arr));

    }
}

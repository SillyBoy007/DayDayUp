package year_2019.month_may.day_14;

/**
 * 二维数组查找,遍历
 */
public class BinaryArrayFind {

    /**
     * 二维数组查找数字
     */

    public static boolean find(int[][] binaryArr,int num){
        for (int i=0;i<binaryArr.length;i++){
            for (int j=0;j<binaryArr[i].length;j++){
                if (binaryArr[i][j] == num){
                    return true;
                }
            }
        }
        return false;
    }
    /**
     * 输出打印二维数组
     * @param binaryArr
     */
    public static void  printBinary(int[][] binaryArr){
        for (int i=0;i<binaryArr.length;i++){
            for (int j=0;j<binaryArr[i].length;j++){
                if (j+1 == binaryArr[i].length){
                    System.out.print(binaryArr[i][j]);
                }
                else {
                    System.out.print(binaryArr[i][j]+",");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int [][] binaryArr= {{1,2,3,4},{2,3,4,5},{3,4,5,6},{7,8,9,11}};
       // printBinary(binaryArr);
       System.out.println(find(binaryArr,11));
    }
}

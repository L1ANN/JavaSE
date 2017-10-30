/**
 * @Author:L1ANN
 * @Description:
 * @Date:Created in 11:23 2017/10/30
 * @Modified By:
 */
public class JavaSE_String {
    public static void main(String[] args) {
        String test = " 这是一条测试String方法的句子";

        byte[] arr1 = test.getBytes();
        System.out.println("字节数组:");
        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]);
        }
        System.out.println();

        char[] arr2 = test.toCharArray();
        System.out.println("字符数组:");
        for(int i=0;i<arr2.length;i++){
            System.out.print(arr2[i]);
        }
        System.out.println();

        String[] arr3 = test.split("String");
        System.out.println("以String分割的字符串数组:");
        for(int i=0;i<arr3.length;i++){
            System.out.print(arr3[i]);
        }

    }
}

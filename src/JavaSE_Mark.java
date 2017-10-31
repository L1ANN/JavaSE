/**
 * @Author:L1ANN
 * @Description: 测试循环的标记Mark，主要用于continue和break
 * @Date:Created in 10:58 2017/10/30
 * @Modified By:
 */
public class JavaSE_Mark {
    public static void main(String[] args) {

        //continue未加标记
        for (int i = 0; i < 3; i++) {
            System.out.println("i->" + i);
            for (int j = 0; j < 5; j++) {
                if (j == 1) continue ;
                System.out.println("j->" + j);
            }
        }
        //continue加标记，跳出循环，从标记处进入下次循环
        go:
        for (int i = 0; i < 3; i++) {
            System.out.println("i->" + i);
            for (int j = 0; j < 5; j++) {
                if (j == 1) continue go;
                System.out.println("j->" + j);
            }
        }
        //break未加标记：跳出离break最近的循环
        for (int i = 0; i < 3; i++) {
            System.out.println("i->" + i);
            for (int j = 0; j < 5; j++) {
                if (j == 1) break ;
                System.out.println("j->" + j);
            }
        }
        //break加标记，跳出标记处的循环
        go:
        for (int i = 0; i < 3; i++) {
            System.out.println("i->" + i);
            for (int j = 0; j < 5; j++) {
                if (j == 1) break go;
                System.out.println("j->" + j);
            }
        }
    }
}

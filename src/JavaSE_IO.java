import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @Author:L1ANN
 * @Description:
 * @Date:Created in 21:45 2017/10/30
 * @Modified By:
 */
public class JavaSE_IO {
    public static void main(String[] args) {
        try {
            InputStream in = JavaSE_IO.class.getClassLoader().getResourceAsStream("time.png");
            FileOutputStream out = new FileOutputStream("a.png");
            byte[] arr = new byte[1024 * 8];
            int len;

            while((len=in.read(arr))!=-1){
                out.write(arr,0,len);
            }
            System.out.println("使用小数组读取写入完毕！");
            in.close();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}

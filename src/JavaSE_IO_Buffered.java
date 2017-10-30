import java.io.*;

/**
 * @Author:L1ANN
 * @Description:
 * @Date:Created in 22:06 2017/10/30
 * @Modified By:
 */
public class JavaSE_IO_Buffered {
    public static void main(String[] args){
        try {
            FileInputStream in = new FileInputStream("a.png");
            FileOutputStream out = new FileOutputStream("b.png");

            BufferedInputStream bin = new BufferedInputStream(in);
            BufferedOutputStream bout = new BufferedOutputStream(out);
            int b;

            while((b=bin.read())!=-1){
                bout.write(b);
            }

            bin.close();
            bout.close();

        }catch(IOException e){
            e.printStackTrace();
        }

    }
}

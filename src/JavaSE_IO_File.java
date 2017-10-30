import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @Author:L1ANN
 * @Description:
 * @Date:Created in 23:07 2017/10/30
 * @Modified By:
 */
public class JavaSE_IO_File {
    public static void main(String[] args){
        try {
            FileReader reader = new FileReader("text_a.txt");
            FileWriter writer = new FileWriter("text_b.txt");

            int ch;
            while((ch=reader.read())!=-1){
                writer.write(ch);
            }
            System.out.println("文件转化成功！");
            reader.close();
            writer.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}

import java.io.File;
import java.io.IOException;

/**
 * @Author:L1ANN
 * @Description: 测试File类常用的方法
 * @Date:Created in 16:59 2017/10/30
 * @Modified By:
 */
public class JavaSE_File {
    public static void main(String[] args) {
        try {
            File file = new File("test.txt");
            System.out.println("文件是否存在：" + file.exists());
            file.createNewFile();
            System.out.println("文件是否存在：" + file.exists());
            System.out.println("文件的绝对路径：" + file.getAbsolutePath());
            System.out.println("文件的相对路径："+file.getPath());
            System.out.println("获取文件的父路径：" + file.getParent());
            System.out.println("文件是否可读：" + file.canRead());
            System.out.println("文件的长度"+file.length());
            System.out.println("文件最后一次修改时间："+file.lastModified());
            System.out.println("文件是否是目录："+file.isDirectory());
            System.out.println("文件是否隐藏："+file.isHidden());
            System.out.println("文件是否存在："+file.isFile());

            File file1 = new File(JavaSE_File.class.getClassLoader().getResource("pack").getFile());
            System.out.println("目录是否存在："+file1.isDirectory());
            System.out.println("该目录下的文件有：");
            String[] list = file1.list();
            for(String it:list){
                System.out.print(it);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

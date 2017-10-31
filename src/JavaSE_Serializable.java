import Serializable.Person;

import java.io.*;

/**
 * @Author:L1ANN
 * @Description: 测试对象的序列化和反序列化
 * @Date:Created in 10:46 2017/10/31
 * @Modified By:
 */
public class JavaSE_Serializable {
    public static void main(String[] args) throws Exception{
        SerizalizePerson();
        Person person = DeserializaPerson();
        System.out.println(person.toString());
    }

    /**
     * 序列化Person对象
     * @throws FileNotFoundException
     * @throws IOException
     */
    private static void SerizalizePerson() throws FileNotFoundException,IOException{
        Person person = new Person();
        person.setName("L1ANN");
        person.setAge(23);
        person.setSex("男");

        File file = new File(JavaSE_Serializable.class.getClassLoader().getResource("Serializable/Person.txt").getFile());
        OutputStream out = new FileOutputStream(file);
        ObjectOutputStream oo = new ObjectOutputStream(out);
        oo.writeObject(person);
        System.out.println("Person对象序列化成功！");
        oo.close();
    }

    /**
     * 反序列化Person对象。
     * @return
     * @throws Exception
     * @throws IOException
     */
    private static Person DeserializaPerson() throws Exception,IOException{
        File file = new File(JavaSE_Serializable.class.getClassLoader().getResource("Serializable/Person.txt").getFile());
        InputStream in = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(in);
        Person person = (Person)ois.readObject();
        System.out.println("Person对象反序列化成功！");
        return person;
    }
}

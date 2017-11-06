import java.util.*;

/**
 * @Author:L1ANN
 * @Description:
 * @Date:Created in 19:38 2017/11/6
 * @Modified By:
 */
public class JavaSE_Collection_Set {
    public static void main(String[] args){
        //创建一个List集合
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("a");
        list.add("d");
        //创建一个Set集合
        Set<String> set = new HashSet<>();
        //将List中的元素放入Set中
        set.addAll(list);
        set.add("111");
        set.add("222");
        set.remove("111");
        Iterator<String> iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next()+"\t");
        }

    }
}

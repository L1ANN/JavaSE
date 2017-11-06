package Serializable;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @Author:L1ANN
 * @Description: Map的四种遍历方式
 * @Date:Created in 20:14 2017/11/6
 * @Modified By:
 */
public class JavaSE_Collection_Map {
    public static void main(String[] args){
        Map<String,String> map = new HashMap<String,String>();
        map.put("1","小明");
        map.put("2","小丽");
        map.put("3","小美");
        map.put("4","小芳");

        //第一种遍历方式，通过加强for循环map.keySet()，然后通过键key得到value值
        for(String s:map.keySet()){
            System.out.print("key："+s+" value:"+map.get(s)+"\t");
        }
        System.out.println();
        //第二种遍历方式，通过加强for循环map.values()
        for(String s:map.values()){
            System.out.print("value:"+s+"\t");
        }
        System.out.println();
        //第三种遍历方式，通过加强for循环Map.Entry<String,String>
        for(Map.Entry<String,String> entry:map.entrySet()){
            System.out.print("key："+entry.getKey()+" value:"+entry.getValue()+"\t");
        }
        System.out.println();
        //第四种遍历方式，通过Iterator遍历获取
        Iterator<Map.Entry<String,String>> it = map.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry<String,String> entry = it.next();
            System.out.print("key："+entry.getKey()+" value:"+entry.getValue()+"\t");
        }
    }
}

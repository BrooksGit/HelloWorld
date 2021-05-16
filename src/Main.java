import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        Map<String, String> map = new HashMap<String, String>();
        map.put("key", "value");
        map.put("name", "zhangsan");

        Set<String> set = map.keySet();   //这个不理解，说明集合学的不够好
        System.out.println(set);    //集合元素可以直接打印出来,底层原理是啥？
        System.out.println(map);//

        ArrayList<String> list=new ArrayList<String>();
        list.add("'");
        System.out.print(list.get(0));
    }
}

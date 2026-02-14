import java.util.*;
public class another {
    public static void main(String []args){
    LinkedList<String> list=new LinkedList<String>();
    list.addFirst("a");
    list.addFirst("is");
    System.out.println(list);
    list.addLast("list");
    System.out.println(list);
    list.add("last");//by default adds at last only
    System.out.println(list);

    for(int i=0;i<list.size();i++){
        System.out.print (list.get(i)+"->");
    }
    System.out.println("NULL");
    }
}

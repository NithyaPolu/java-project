import java.util.ArrayList;
import java.util.Collections;
class functions
{
    public static void main(String []args){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(0);
        list.add(2);
        list.add(3);
        System.out.println(list);

       int element =list.get(0);
        System.out.println(element);

        list.set(0,5);
        System.out.println(list);

        int ele=list.size();
        System.out.println(ele);

        list.remove(0);
        System.out.println(list);
for(int i=0;i<list.size();i++){
            System.out.print(list.get(i));
        }//to print elements not in the form of list
        
        Collections.sort(list);
        System.out.println(list);
    }
}
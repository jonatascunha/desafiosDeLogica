import java.util.ArrayList;

public class ListTest01 {
    public static void main(String[] args) {

        ListMethods list = new ListMethods();
        ArrayList<String> mylist = new ArrayList<>();
        mylist.add("W");
        mylist.add("T");
        mylist.add("A");
        mylist.add("G");
        mylist.add("I");
        mylist.add("B");
        mylist.add("Z");
        mylist.add("0");
        mylist.add("U");
        mylist.add("7");
        list.returnAsc(mylist);
            }



}

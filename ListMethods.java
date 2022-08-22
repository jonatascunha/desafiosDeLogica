import java.util.Collections;
import java.util.List;

public class ListMethods {

    public void returnAsc(List<String> myList){

        for (String myStr: myList) {
            System.out.print(" " + myStr);
        }
        Collections.sort(myList);
        System.out.println("\nThe Sorted List is");
        for (String myStr: myList) {
            System.out.print(" " + myStr);
        }

    }

   public void returnDesc(List<String> myList){

        Collections.sort(myList);

        Collections.reverse(myList);

        for (String myStr: myList) {
            System.out.print(" " + myStr);
        }

    }









}

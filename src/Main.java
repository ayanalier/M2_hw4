import java.util.ArrayList;
import java.util.ListIterator;
public class Main {
    public static void main(String[] args) {
        ArrayList<String> A = new ArrayList<>();
        A.add("да");
        A.add("нет");
        A.add("суши");
        A.add("роллы");
        A.add("макаруны");
        System.out.println(A);
        ArrayList<String> B = new ArrayList<>();
        B.add("1");
        B.add("2");
        B.add("3");
        B.add("4");
        B.add("5");
        ArrayList<String> C = new ArrayList<>();
        ListIterator<String> listIter = A.listIterator();
        ListIterator<String> listter = B.listIterator();
        while (listIter.hasNext()){
            C.add(listIter.next()+listter.next());
        }
        System.out.println(C);
        for (String ret : C) {
            System.out.println(ret);
        }
    }
}


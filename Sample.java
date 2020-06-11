import java.util.ArrayList;
import java.util.Iterator;
public class Sample {
  public static void main(String[] args) {
    ArrayList<String> arr = new ArrayList<>();
    arr.add("Sample");
    Iterator<String> it = arr.iterator();
    while (it.hasNext()) {
      String e = it.next();
      System.out.println(e);
    }
  }
}
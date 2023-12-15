import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        stampaInfoHashSet();
    }
    public static void stampaInfoHashSet(){
        Set<String> hashset1 = new HashSet<String>();
        hashset1.add("Uno");
        hashset1.add("Due");
        hashset1.add("Tre");
        hashset1.add("Quattro");

        System.out.println("Elementi HashSet: " + hashset1);
        System.out.println("Grandezza HashSet: " + hashset1.size());

    }
}

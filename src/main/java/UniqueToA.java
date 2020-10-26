import java.util.*;

public class UniqueToA {

    /*
    As far as I remember it the idea was to write a program
    that would read two lines of input and return the characters
    that were in the first but not the second line (sorted numbers
    then letters).
        e.g. Input of:      e d 1 3 g k
                            f 8 1 j b e
        gives output:       3 d g k
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String line1 = scan.nextLine();
        String[] lettersFromLine1 = line1.split(" ");
        String line2 = scan.nextLine();
        String[] lettersFromLine2 = line2.split(" ");
        SortedSet<String> lettersUniqueToA= new TreeSet<>(Arrays.asList(lettersFromLine1));
        lettersUniqueToA.removeAll(Arrays.asList(lettersFromLine2));
        String result = "";
        for(String s : lettersUniqueToA) {
            result += s + " ";
        }
        System.out.println(result.trim());
    }
}

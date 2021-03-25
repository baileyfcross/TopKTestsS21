import java.util.Comparator;

/**
 * Write a description of class TestsLJBBFC here.
 *
 * @author Logan Belak and Bailey Cross
 * @version Spring 2021
 */
public class TestsLJBBFC 
{
    /**
    main method to try out the TopK

    @param args not used
     */
    public static void main(String args[]) {
        TopK<Integer> thebest = new TopKJDTRefSol<Integer>(5, Comparator.naturalOrder());
        TopK<String> thebestString = new TopKJDTRefSol<String>(3, Comparator.naturalOrder());
        //TopK<Student> thebestE = new TopKJDTRefSol<String>(3, Comparator.naturalOrder());

        //Integer
        thebest.add(5);
        thebest.add(2);
        thebest.add(8);
        System.out.println("With 3 entries for Integer: " + thebest);
        thebest.add(4);
        thebest.add(1);
        thebest.add(9);
        thebest.add(7);
        thebest.add(6);
        thebest.add(0);
        thebest.add(3);
        System.out.println("After adding 10 entries for Integer: " + thebest);
        
        //String
        thebestString.add("L");
        thebestString.add("B");
        thebestString.add("Z");
        System.out.println("With 3 entries for String: " + thebestString);
        thebestString.clear();
        thebestString.add("Q");
        thebestString.add("W");
        thebestString.add("A");
        thebestString.add("R");
        thebestString.add("P");
        thebestString.add("H");
        System.out.println("After clearing, repopulating with 6 entries for String: " + thebestString);
    }
}

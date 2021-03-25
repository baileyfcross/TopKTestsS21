import java.util.Comparator;
/**
 * Write a description of class TestsLJBV here.
 *
 * @author Luke Jennings and Brenna Valle
 * @version Spring 2021
 */
public class TestsLJBV
{
    public static void main(String args[]) {
        System.out.println("Testing for greatest first");
        TopK<Integer> thebest =
            new TopKJDTRefSol<Integer>(5, Comparator.naturalOrder());

        thebest.add(5);
        thebest.add(2);
        thebest.add(8);
        System.out.println("With 3 entries: " + thebest);
        thebest.add(4);
        thebest.add(1);
        thebest.add(9);
        thebest.add(7);
        thebest.add(6);
        thebest.add(0);
        thebest.add(3);

        System.out.println("After adding 10 entries: " + thebest);

        thebest.clear();
        System.out.println("After clearing all the entries: " + thebest);

        thebest.add(5);
        thebest.add(2);
        thebest.add(8);
        thebest.add(4);
        thebest.add(1);
        thebest.add(9);
        thebest.add(7);
        thebest.add(6);
        thebest.add(0);
        thebest.add(3);
        System.out.println("After re-adding 10 entries: " + thebest);
        System.out.println();

        System.out.println("Testing for even first, then odd");
        TopK<Integer> thebest2 =
            new TopKJDTRefSol<Integer>(4, new Comparator<Integer>() {
                    @Override
                    public int compare(Integer first, Integer second){
                        boolean e1 = first % 2 == 0;
                        boolean e2 = second % 2 == 0;

                        if(e1 == e2) return 0;
                        else if (e1 && !e2) return 1;
                        else return -1;
                    }

                });

        thebest2.add(1);
        thebest2.add(2);
        thebest2.add(3);
        System.out.println("With 3 entries: " + thebest2);
        thebest2.add(4);
        thebest2.add(5);
        thebest2.add(9);
        thebest2.add(7);
        thebest2.add(6);
        thebest2.add(0);
        thebest2.add(8);
        System.out.println("With 10 entries: " + thebest2);
    }
}

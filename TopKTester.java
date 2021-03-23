import java.util.Comparator;

/**
   Sample test case implementation for TopK.

   @author Jim Teresco
   @version Spring 2021
*/   
   
public class TopKTester {

    /**
       main method to try out the TopK

       @param args not used
    */
    public static void main(String args[]) {
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
    }
}

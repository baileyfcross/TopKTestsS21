import java.util.Comparator;
/**
 * Tests the TopK Class
 *
 * @author Bailey Cross
 * @version Spring 2021
 */
public class TestsBFCLJB
{
    public TestsBFCLJB()
    {
        
    }
    
    public static void main(String args[]){
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
	
	TopK<String> thebestest =
	    new TopKJDTRefSol<String>(3, Comparator.naturalOrder());
	
	//Adding Initals for String Comparator
	thebestest.add("B");
	thebestest.add("F");
	thebestest.add("C");
	
	System.out.println("After adding 3 entries: " + thebestest);
	
	thebestest.add("L");
	thebestest.add("J");
	thebestest.add("B");
	
	System.out.println("After adding 6 entries: " + thebestest);
    }
}

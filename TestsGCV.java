import java.util.Comparator;
/**
 * Test cases for TopK Data structure.
 *
 * @author Grant Visker
 * @version 3/28/2021
 */
public class TestsGCV
{
    public static void main(String args[])
    {
        TopKJDTRefSol<Double> dubOne = new TopKJDTRefSol<Double>(5, Comparator.naturalOrder()); 

        dubOne.add(2.2);
        dubOne.add(30.0);
        dubOne.add(12.0);
        dubOne.add(1.2);
        dubOne.add(1.20);
        dubOne.add(18.521);
        dubOne.add(37.8);
        dubOne.add(30.0);

        dubOne.clear();

        dubOne.add(1.1);
        dubOne.add(2.2);
        dubOne.add(3.3);
        dubOne.add(4.44);
        dubOne.add(18.521);
        dubOne.add(37.8);
        dubOne.add(30.0);

        System.out.println("Expected:  37.8 30.0 18.521 4.44 3.3");
        System.out.println("Actual: " + dubOne);
        System.out.println();

        Comparator<Double> dubReverse = new Comparator<Double>(){
                public int compare(Double item, Double other){
                    return (int)(Math.round(other - item));
                }

            };

        TopKJDTRefSol<Double> dubTwo = new TopKJDTRefSol<Double>(12, dubReverse); 

        dubTwo.add(.5);
        dubTwo.add(1.2);
        dubOne.add(22.3);
        dubOne.add(12.1);
        dubOne.add(23.00);
        dubOne.add(1.0);
        dubOne.add(2.2);
        dubOne.add(3.1);
        dubOne.add(100.01);
        dubOne.add(4.9);
        dubOne.add(3.22);
        dubOne.add(6.63);
        dubOne.add(22.2);

        System.out.println("Expected: 0.5 1.0 1.2 2.2 3.1 3.22 4.9 6.63 12.1 22.2 22.3 23.0");
        System.out.println("Actual: " + dubTwo);
        System.out.println();

        Comparator<String> length = new Comparator<String>(){
                public int compare(String item, String other){
                    return item.length() - other.length();
                }

            };

        TopKJDTRefSol<String> strOne = new TopKJDTRefSol<String>(25, length);

        strOne.add("hi");
        strOne.add(",");
        strOne.add("this");
        strOne.add("structure");
        strOne.add("is");
        strOne.add("not");
        strOne.add("at");
        strOne.add("capacity");
        strOne.add(".");

        System.out.println("Expected: structure capacity this not hi is at , . ");
        System.out.println("Actual: " + strOne);
        System.out.println();

    }
}

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

        // Testing TopKList<String>
        System.out.println("\nTesting TopKList<String>\n");
        TopK<String> TopK_String = 
            new TopKJDTRefSol<String>(5, Comparator.naturalOrder());

        TopK_String.add("zebra");
        TopK_String.add("elephant");
        TopK_String.add("dog");
        System.out.println("With 3 entries: " + TopK_String); // orig
        TopK_String.add("parrot");
        TopK_String.add("cat");
        TopK_String.add("rat");
        System.out.println("Zoo: " + TopK_String);

        TopK_String.clear();
        System.out.println("Empty Zoo: " + TopK_String);

        // Testing TopKList<Double>
        System.out.println("\nTesting TopKList<Double>\n");
        TopK<Double> TopK_Double = 
            new TopKJDTRefSol<Double>(10, Comparator.naturalOrder());

        TopK_Double.add(10.5); // 1
        TopK_Double.add(103.5);
        TopK_Double.add(201.5);
        TopK_Double.add(74.5);
        TopK_Double.add(81.5); // 5
        TopK_Double.add(29.5);
        TopK_Double.add(201.5);
        TopK_Double.add(31.5);
        TopK_Double.add(67.5);
        TopK_Double.add(8.5); // 10
        TopK_Double.add(28.5);
        TopK_Double.add(74.5);
        TopK_Double.add(36.5);
        TopK_Double.add(1.5);
        TopK_Double.add(6.5); // 15

        System.out.println("Double: " + TopK_Double);

        // Testing TopKList<Double>
        System.out.println("\nTesting TopKList<Fruit>\n");
        Fruit compare = new Fruit();
        TopK<Fruit> TopK_Fruits = 
            new TopKJDTRefSol<Fruit>(10, compare);

        TopK_Fruits.add(new Fruit("apple", 2)); // 1    
        TopK_Fruits.add(new Fruit("dragon fruit", 20));
        TopK_Fruits.add(new Fruit("tomato", 4));
        TopK_Fruits.add(new Fruit("coffee bean", 1));   
        TopK_Fruits.add(new Fruit("orange", 3));
        TopK_Fruits.add(new Fruit("orange", 8));
        TopK_Fruits.add(new Fruit("orange", 4));  
        TopK_Fruits.add(new Fruit("avacado", 6));
        TopK_Fruits.add(new Fruit("coconut", 1)); 
        TopK_Fruits.add(new Fruit("apple", 12));
        TopK_Fruits.add(new Fruit("jackfruit", 15)); 
        TopK_Fruits.add(new Fruit("olive", 99)); 

        System.out.println("Normal Fruit: " + TopK_Fruits);
        TopK_Fruits.clear();
        System.out.println("Normal Fruit after clear: " + TopK_Fruits);
    }
}

/**
 * Class compare Fruit objects. It takes the fruit name and price.
 * 
 * @author Lydia Cartwright, Jordan Breen and Brenna Valle from PS3 updated by Brenna Valle
 * @version Spring 2021
 */
class Fruit implements Comparator
{
    private String name;
    private int price;

    /**
     * Constructs a Fruit object with no parameters.
     */
    public Fruit()
    {}

    /**
     * Constructs a Fruit object with name and price.
     * 
     * @param name the name of the Fruit
     * @param price the price of the Fruit
     */
    public Fruit(String name, int price)
    {
        this.name = name;
        this.price = price;
    }

    /**
     * Compares two Fruit objects by price.
     * 
     * @param x the first Fruit to compare
     * @param y the second Fruit to compare
     * 
     * @return a negative number if x is less than y, a positive number
     * if x is greater than y, and 0 if they are equal.
     */
    @Override
    public int compare(Object x, Object y)
    {
        return ((Fruit)x).name.compareTo(((Fruit)y).name);
    }

    /**
     * toString method to format a Fruit object.
     * 
     * @return the formatted Fruit object
     */
    @Override
    public String toString()
    {
        return "[" + name + ", $" + price + "]"; 
    }
}


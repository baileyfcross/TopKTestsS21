import java.util.Comparator;

/**
 * Test cases for the TopK class.
 *
 * @author Lydia Cartwright
 * @version Spring 2021
 */
public class TestsLGC
{
    // instance variables - replace the example below with your own

    public static void main(String args[]) {
        System.out.println("Testing with Integers\n");
        
        TopK<Integer> IntegerTest =
            new TopKJDTRefSol<Integer>(5, Comparator.naturalOrder());

        System.out.println("After adding no entries: " + IntegerTest);

        IntegerTest.add(1);
        IntegerTest.add(12);
        IntegerTest.add(19);
        System.out.println("After adding 3 entries: " + IntegerTest);
        IntegerTest.add(7);
        IntegerTest.add(16);
        System.out.println("After adding 5 entries: " + IntegerTest);
        IntegerTest.add(8);
        System.out.println("After adding 6 entries: " + IntegerTest);

        
        System.out.println("\nTesting with Strings\n");
        
        TopK<String> StringTest =
            new TopKJDTRefSol<String>(4, Comparator.naturalOrder());

        System.out.println("After adding no entries: " + StringTest);

        StringTest.add("a");
        StringTest.add("f");
        StringTest.add("z");
        System.out.println("After adding 3 entries: " + StringTest);
        StringTest.add("l");
        StringTest.add("b");
        System.out.println("After adding 5 entries: " + StringTest);
        StringTest.add("c");
        System.out.println("After adding 6 entries: " + StringTest);

        //testing with a custom comparator
        System.out.println("\nTesting with a custom comparator\n");
        TopK<Integer> absv = 
            new TopKJDTRefSol<Integer>(10, new Absvalue());

        absv.add(-10);
        absv.add(-3);
        absv.add(1);
        absv.add(5);
        absv.add(-7);
        absv.add(8);
        absv.add(6);
        absv.add(-2);
        absv.add(10);
        System.out.println(absv);
        System.out.println("\nTesting after clearing\n");
        absv.clear();
        System.out.println(absv);
        System.out.println("\nTesting after repopulating\n");
        absv.add(-10);
        absv.add(-3);
        absv.add(1);
        absv.add(5);
        absv.add(-7);
        absv.add(8);
        absv.add(6);
        absv.add(-2);
        absv.add(10);
        System.out.println(absv);
        
        // Testing With a custom class
        System.out.println("\nTesting TopKList<Fruit>\n");
        TopK<Fruit> TopK_Fruits = 
            new TopKJDTRefSol<Fruit>(10, new Fruit());

        TopK_Fruits.add(new Fruit("apple", 2)); // 1    
        TopK_Fruits.add(new Fruit("pear", 20));
        TopK_Fruits.add(new Fruit("peach", 4));
        TopK_Fruits.add(new Fruit("clementine", 1));   
        TopK_Fruits.add(new Fruit("banana", 3));
        TopK_Fruits.add(new Fruit("orange", 8));
        TopK_Fruits.add(new Fruit("watermelon", 4));  
        TopK_Fruits.add(new Fruit("avacado", 6));
        TopK_Fruits.add(new Fruit("pineapple", 1)); 
        TopK_Fruits.add(new Fruit("kiwi", 12));
        TopK_Fruits.add(new Fruit("jackfruit", 15)); 

        System.out.println(TopK_Fruits);
    }

}

class Absvalue implements Comparator
{
    public int compare(Object x, Object y)
    {
        return Math.abs((int)x) - Math.abs((int)y);
    }
}

class Fruit implements Comparator
{
    private String name;
    private int price;
    public Fruit()
    {}

    public Fruit(String name, int price)
    {
        this.name = name;
        this.price = price;
    }

    public int compare(Object x, Object y)
    {
        return ((Fruit)x).price - ((Fruit)y).price;

    }

    public String toString()
    {
        return "[" + name + ", $" + price + "]"; 
    }
}


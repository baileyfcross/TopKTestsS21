import java.util.Comparator;

/**
Tests for TopK.

@author Spencer Moon
@version Spring 2021
 */   

public class TestSMLCGV {

    /**
    main method to try out the TopK

    @param args not used
     */
    public static void main(String args[]) {

        System.out.println("TOPK 1:\n");
        TopK<Integer> topk1 = new TopKJDTRefSol<Integer>(6, Comparator.naturalOrder());
        topk1.add(7);
        topk1.add(200);
        topk1.add(-62);
        System.out.println("After adding 3 entries: " + topk1);
        topk1.add(0);
        topk1.add(90);
        topk1.add(-10000);
        topk1.add(59);
        topk1.add(77);
        topk1.add(46739);
        topk1.add(567);
        topk1.add(999);
        topk1.add(44);
        System.out.println("After adding 12 entries: " + topk1);

        System.out.println("\nTOPK 2:\n");

        TopK<Integer> topk2 = new TopKJDTRefSol<Integer>(7, new Comparator(){

                    public int compare(Object x, Object y)
                    {
                        int x2 = (Integer) x;
                        int y2 = (Integer) y;
                        return y2 % 10 - x2 % 10;
                    }
                });

        topk2.add(7);
        topk2.add(70);
        topk2.add(41);
        topk2.add(899);
        System.out.println("After adding 4 entries: " + topk2);
        topk2.add(38478);
        topk2.add(6);
        topk2.add(52);
        topk2.add(84);
        topk2.add(1827374893);
        topk2.add(222);
        topk2.add(91);
        topk2.add(9000);
        System.out.println("After adding 12 entries: " + topk2);
        topk2.clear();
        topk2.add(334);
        topk2.add(99);
        topk2.add(6);
        topk2.add(777777);
        topk2.add(1200);
        topk2.add(82);
        topk2.add(67);
        topk2.add(935);
        topk2.add(66);
        topk2.add(98);
        System.out.println("After clearing then adding 10 entries: " + topk2);

        System.out.println("\nTOPK 3:\n");

        TopK<String> topk3 = new TopKJDTRefSol<String>(8, new Comparator(){

                    public int compare(Object x, Object y)
                    {
                        String x2 = (String) x;
                        String y2 = (String) y;
                        return (y2.length()*y2.length() - 8*y2.length()) - (x2.length()*x2.length() - 8*x2.length());
                    }
                });

        topk3.add("meow");
        topk3.add("java");
        topk3.add("iPhone");
        topk3.add("Pokemon");
        topk3.add("iPhone");
        System.out.println("After adding 5 entries: " + topk3);
        topk3.add("The structures hold at least two different data types.");
        topk3.add("This is a very long run on sentence because I am rambling because I want to make a long sentence and I am rambling.");
        topk3.add("x");
        topk3.add("Google Chrome is my favorite web browser.");
        topk3.add("Java is fun.");

        System.out.println("After adding 10 entries: " + topk3);

        System.out.println("\nTOPK 4:\n");

        TopK<ThreeVals> topk4 = new TopKJDTRefSol<ThreeVals>(5, new Comparator(){

                    public int compare(Object x, Object y)
                    {
                        ThreeVals x2 = (ThreeVals) x;
                        ThreeVals y2 = (ThreeVals) y;
                        return (Integer)x2.getX() * (Integer)x2.getY() * (Integer)x2.getZ() - (Integer)y2.getX() * (Integer)y2.getY() * (Integer)y2.getZ();
                    }
                });

        topk4.add(new ThreeVals(1, 2, 3));
        topk4.add(new ThreeVals(4, 5, 6));
        topk4.add(new ThreeVals(9, 8, 9));
        topk4.add(new ThreeVals(4, 7, 3));
        topk4.add(new ThreeVals(1, 2, 4));
        topk4.add(new ThreeVals(7, 2, 0));
        topk4.add(new ThreeVals(5, 9, 6));
        topk4.add(new ThreeVals(8, 4, 2));
        topk4.add(new ThreeVals(6, 3, 9));
        System.out.println("After adding 9 entries: " + topk4);
    }
}
class ThreeVals<E extends Comparable<E>> implements Comparable<ThreeVals<E>>
{
    protected E x;
    protected E y;
    protected E z;
    
    public ThreeVals(E x, E y,E z)
    {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    public E getX()
    {
        return x;
    }
    
    public E getY()
    {
        return y;
    }
    
    public E getZ()
    {
        return z;
    }
    
    public void setX(E in)
    {
        x=in;
    }
    
    public void setY(E in)
    {
        y=in;
    }
    
    public void setZ(E in)
    {
        z=in;
    }
    
    public int compareTo(ThreeVals<E> o){
        return getX().compareTo(o.getX());
    }
    
    public String toString()
    {
        return "(" + x + ", " + y + ", " + z + ")";
    }
}

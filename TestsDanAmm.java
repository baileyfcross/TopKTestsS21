import java.util.Comparator;

/**
 * 
 *
 * @author Daniel and Ammar
 * @version 3/25/2021
 */
public class TestsDanAmm
{
    public static void main(String[] args){
        TopK<Integer> case1 = new TopKJDTRefSol<Integer>(3, new IntRevComparator());

        case1.add(1);
        case1.add(2);
        case1.add(3);
        System.out.println("With 3 entries: " + case1);
        case1.add(431);
        case1.add(54);
        System.out.println("After adding 5 entries: " + case1);

        TopK<String> case2 = new TopKJDTRefSol<String>(6, Comparator.naturalOrder());

        case2.add("a");
        case2.add("b");
        case2.add("c");
        case2.add("z");
        case2.add("f");
        case2.add("d");
        System.out.println("With 6 entries: " + case2);
        case2.add("e");
        case2.add("m");
        case2.add("n");
        System.out.println("After adding 9 entries: " + case2);

    }

}

class IntRevComparator implements Comparator<Integer>{
    @Override
    public int compare(Integer int1, Integer int2){
        if (int1 > int2) return -1;
        else if (int2 > int1) return 1;
        return 0;
    }

}
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
        //Test case for max cap 3, with 6 Int elements and reverse order comparator
        TopK<Integer> case1 = new TopKJDTRefSol<Integer>(3, new IntRevComparator());

        case1.add(1);
        case1.add(2);
        case1.add(3);
        System.out.println("With 3 entries: " + case1);
        case1.add(431);
        case1.add(54);
        System.out.println("After adding 5 entries: " + case1);

        System.out.println();
        //Test case for 6 max cap, 9 total elements and String datatype and natural comparator
        TopK<String> case2 = new TopKJDTRefSol<String>(6, Comparator.naturalOrder());

        case2.add("a");
        case2.add("b");
        case2.add("c");
        System.out.println("With 3 entries out of 6: " + case2);
        case2.add("z");
        case2.add("f");
        case2.add("d");
        System.out.println("With 6 entries: " + case2);
        case2.add("e");
        case2.add("m");
        case2.add("n");
        System.out.println("After adding 9 entries: " + case2);
        System.out.println();
        
        //Clear and repopulate case2
        case2.clear();
        System.out.println("Case2 cleared and repopulated");
        case2.add("a");
        case2.add("b");
        case2.add("c");
        case2.add("z");
        case2.add("f");
        case2.add("d");
        case2.add("e");
        case2.add("m");
        case2.add("n");
        System.out.println("After adding 9 entries: " + case2);
        System.out.println();
        
        //Custom datatype test case
        System.out.println();
        TopK<Player> case3 = new TopKJDTRefSol<Player>(3, new PlayerComparator());
        case3.add(new Player("Bob", 21));
        case3.add(new Player("Jon", 26));
        case3.add(new Player("Daniel", 13));
        System.out.println("With 3 entries: " + case3);
        case3.add(new Player("Brendan", 2));
        case3.add(new Player("Timmy", 55));
        case3.add(new Player("Fred", 11));
        System.out.println("With 6 entries: " + case3);
        
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

class Player{
    private int id;
    private String name;
    
    public Player(String name, int id){
        this.id = id;
        this.name = name;
    }
    
    public int getId(){
        return this.id;
    }
    
    public String getName(){
        return this.name;
    }
    
    public String toString(){
        return "[" + this.name + ", " + this.id + "]";
    }
}

class PlayerComparator implements Comparator<Player>{
    @Override
    public int compare(Player p1, Player p2){
        if (p1.getId() > p2.getId()) return 1;
        else if (p2.getId() > p1.getId()) return -1;
        return 0;
    }
}
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;
import java.util.Arrays;
/**
 * Write a description of class TestsMPAT here.
 *
 * @author Amal Thomas, Michael Plekan
 * @version Spring 2021
 */
public class TestsMPAT
{
    /**
     * @param input args[0] The amout of values in the arrays
     */
    public static void main(String[] args){
        Random rand=new Random();
        int input=0;
        try
        {
            input=Integer.parseInt(args[0]);
        }
        catch (Exception e)
        {
            System.out.println("Error.  Must enter long as command line parameter.");
            System.exit(-1);
        }
        
        int[] list1=new int[input];
        long[] list2=new long[input];
        TopKJDTRefSol top = new TopKJDTRefSol(5, Comparator.naturalOrder());
        for(int x =0;x<input;x++){
            list1[x]=rand.nextInt();
            list2[x]=rand.nextLong();
        }
        for(int i:list1){
            top.add(i);
        }
        Arrays.sort(list1);
        System.out.println("this is the last 5 of the list after being sorted");
        for(int x =input-5;x<input;x++){
           System.out.println(list1[x]);
        }
        System.out.println(top);
        top.clear();
        
        
        for(long i:list2){
            top.add(i);
        }
        Arrays.sort(list2);
        System.out.println("this is the last 5 of the list after being sorted");
        for(int x =input-5;x<input;x++){
           System.out.println(list2[x]);
        }
        System.out.println(top);
    }
}

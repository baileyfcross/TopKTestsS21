import java.util.Comparator;
import java.util.ArrayList;

/**
 * Write a description of class TestsLJBBFC here.
 *
 * @author Logan Belak and Bailey Cross
 * @version Spring 2021
 */
public class TestsLJBBFC
{
    /**
    main method to try out the TopK

    @param args not used
     */
    public static void main(String args[]) {
        TopK<Integer> thebest = new TopKJDTRefSol<Integer>(5, Comparator.naturalOrder());
        TopK<String> thebestString = new TopKJDTRefSol<String>(3, Comparator.naturalOrder());
        TopK<Student> thebestAnimal = new TopKJDTRefSol<Student>(3, topKWeight);

        //Integer
        thebest.add(5);
        thebest.add(2);
        thebest.add(8);
        System.out.println("With 3 entries for Integer: " + thebest);
        thebest.add(4);
        thebest.add(1);
        thebest.add(9);
        thebest.add(7);
        thebest.add(6);
        thebest.add(0);
        thebest.add(3);
        System.out.println("After adding 10 entries for Integer: " + thebest);

        //String
        thebestString.add("L");
        thebestString.add("B");
        thebestString.add("Z");
        System.out.println("With 3 entries for String: " + thebestString);
        thebestString.clear();
        thebestString.add("Q");
        thebestString.add("W");
        thebestString.add("A");
        thebestString.add("R");
        thebestString.add("P");
        thebestString.add("H");
        System.out.println("After clearing, repopulating with 6 entries for String: " + thebestString);

        //Animal
        thebestAnimal.setWeight(2.2);
    }
}

/**
 * Demonstrating a simple abstract class
 *
 * Jim Teresco, Siena College, Computer Science 225, Spring 2017
 * Based heavily on example from Darren Lim
 *
 * @author Jim Teresco
 * @version Spring 2020
 */
/* The class is declared as abstract to indicate that it will include
 * one or more abstract methods.
 */
abstract class Student
{
    protected String name = "Fred";

    /* any class that extends Student will be required to implement this method */
    protected abstract void getName();

    /* and we'll provide a method everyone will inherit also */
    public void setName(String newName) {

        name = newName;
    }

    Comparator<Student> topKName = new Comparator<Student>() {
            public int compare(Student a, Student b) {
                if (a.getName() - b.getName() < 0) return -1;
                if (a.getName() - b.getName() > 0) return 1;
            }
        };
}

class Undergraduate extends Student
{
    @Override
    protected void getName()
    {
        System.out.println("Undergraduate : " + name);
    }
} 

class Freshman extends Undergraduate
{
}

class Graduate extends Student
{
    @Override
    protected void getName()
    {
        System.out.println("Graduate : " + name);
    }

}

class Phd extends Graduate
{
    @Override
    protected void getName()
    {
        System.out.println("Phd : " + name);
    }
}

class AbstractClass
{

    public static void main(String[] args) 
    {
        // populate an ArrayList with Student objects and instances of derived classes
        ArrayList<Student> students = new ArrayList<>();
        // this will not be allowed, since we cannot instantiate an abstract class
        //students.add(new Student());
        students.add(new Undergraduate());
        students.add(new Freshman());
        students.add(new Graduate());
        students.add(new Phd());

        // any Student object can call setName
        students.get(0).setName("Mary");
        students.get(1).setName("Don");
        students.get(2).setName("Alice");

        // let's call each one's getName method, which each Student is
        // guaranteed to have, even though class Student doesn't provide one.
        for (Student s : students) {

            s.getName();
        }

    }
}

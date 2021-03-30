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
        TopK<Animal> thebestAnimal = new TopKJDTRefSol<Animal>(7, new Comparator<Animal>() {
                    public int compare(Animal a, Animal b) {
                        return a.numLegs() - b.numLegs();
                    }
                });

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
        System.out.println();

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
        System.out.println();

        //Animal
        thebestAnimal.add(new Animal("Dog", 4, 10.1));
        thebestAnimal.add(new Animal("Spider", 8, 0.03));
        thebestAnimal.add(new Animal("Pig", 4, 36.5));
        System.out.println("With 3 entries for Animal: " + thebestAnimal);
        thebestAnimal.add(new Animal("Snake", 0, 0.5));
        thebestAnimal.add(new Animal("Kangaroo", 2, 96.3));
        thebestAnimal.add(new Animal("Bee", 6, 0.3));
        thebestAnimal.add(new Animal("Centipede", 100, 0.13));
        System.out.println("With 5 entries for Animal: " + thebestAnimal);
    }
}

class Animal {

    // the variable that was in all classes is moved into this abstract class
    private String species;
    private int numLegs;
    private double weight;

    public Animal(String species, int numLegs, double weight) {
        this.species = species;   
        this.numLegs = numLegs;
        this.weight = weight;
    }

    /**
    Return the species of the type of animal.
    @return the species of the type of animal.
     */
    public String species() {
        return species;   
    }

    /**
    Return the number of legs that members of this
    species should have.
    @return the number of legs that members of this
    species should have
     */
    public int numLegs() {
        return numLegs;   
    }

    /**
    Set the weight of this animal

    @param newWeight the new weight of the animal
     */
    public void setWeight(double newWeight) {

        weight = newWeight;
    }

    /**
    Get the weight of the animal

    @return the weight of the animal
     */
    public double getWeight() {

        return weight;
    }
    
    @Override
    public String toString() {
        return species + " with " + numLegs + " and a weight of " + weight + " pounds.";
    }
}
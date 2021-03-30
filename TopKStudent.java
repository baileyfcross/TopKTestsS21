import java.util.Comparator;
/**
 * Write a description of class TopKStudent here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TopKStudent extends Student implements Comparator<Student>
{
    public int compare(Student a, Student b) {
        if (a.getName() < b.getName()) return -1;
        if (a.getName() > b.getName()) return 1;
        return 0;
    }

}

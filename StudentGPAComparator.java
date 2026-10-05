
import java.util.Comparator;

/**
 * Compares Student objects by GPA.
 *
 * @author Adeel Rahman
 * @version 1.0
 */
public class StudentGPAComparator implements Comparator<Student> {

    /**
     * Compares two students by GPA.
     *
     * @param s1 first student
     * @param s2 second student
     * @return comparison result
     */
    @Override
    public int compare(Student s1, Student s2) {
        return Double.compare(s1.getGpa(), s2.getGpa());
    }
}


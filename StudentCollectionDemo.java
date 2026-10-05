import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * Demonstrates Java Collections using Student objects.
 *
 * @author Adeel Rahman
 * @version 1.0
 */
public class StudentCollectionDemo {

    /**
     * Runs the Student Collection Management System.
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {

        System.out.println("========== STUDENT COLLECTION MANAGEMENT SYSTEM ==========");

        // 1. Original Student List
        List<Student> students = new ArrayList<Student>();

        students.add(new Student(1001, "Adeel", "Rahman", 3.9, "CS"));
        students.add(new Student(1002, "Peter", "Parker", 3.2, "PHY"));
        students.add(new Student(1003, "Bruce", "Wayne", 2.8, "BBA"));
        students.add(new Student(1004, "Diana", "Prince", 3.7, "HIS"));
        students.add(new Student(1005, "Clark", "Kent", 2.3, "JRN"));
        students.add(new Student(1006, "Tony", "Stark", 3.5, "ENG"));

        System.out.println("\n1. Original Student List");

        for (Student student : students) {
            System.out.println(student);
        }

        // 2. ArrayList Operations
        System.out.println("\n2. ArrayList Operations");

        System.out.println("Size: " + students.size());
        System.out.println("Is empty: " + students.isEmpty());
        System.out.println("Student at index 0: " + students.get(0));
        System.out.println("Contains Adeel: " + students.contains(students.get(0)));

        Student newStudent =
                new Student(1007, "Steve", "Rogers", 3.6, "POL");

        students.set(1, newStudent);

        System.out.println("After set(): " + students.get(1));

        Student removedStudent = students.remove(5);

        System.out.println("Removed: " + removedStudent);
        System.out.println("Size after remove(): " + students.size());

        // 3. For-Each Traversal
        System.out.println("\n3. For-Each Traversal");

        for (Student student : students) {
            System.out.println(student);
        }

        // 4. Iterator Traversal
        System.out.println("\n4. Iterator Traversal");

        Iterator<Student> iterator = students.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // 5. Lambda / forEach Traversal
        System.out.println("\n5. Lambda / forEach Traversal");

        students.forEach(student -> System.out.println(student));

        // 6. Sort by Name using Comparable
        System.out.println("\n6. Students Sorted by Name");

        Collections.sort(students);

        for (Student student : students) {
            System.out.println(student);
        }

        // 7. Sort by GPA using Comparator
        System.out.println("\n7. Students Sorted by GPA");

        Collections.sort(students, new StudentGPAComparator());

        for (Student student : students) {
            System.out.println(student);
        }

        // 8. Sort by ID using Comparator
        System.out.println("\n8. Students Sorted by ID");

        Comparator<Student> idComparator = new Comparator<Student>() {

            @Override
            public int compare(Student s1, Student s2) {
                return Integer.compare(s1.getId(), s2.getId());
            }
        };

        Collections.sort(students, idComparator);

        for (Student student : students) {
            System.out.println(student);
        }

        // 9. Filtering Students Using Iterator
        System.out.println("\n9. Filtering Students Using Iterator");

        System.out.println("Before filtering:");

        for (Student student : students) {
            System.out.println(student);
        }

        Iterator<Student> filterIterator = students.iterator();

        while (filterIterator.hasNext()) {
            Student student = filterIterator.next();

            if (student.getGpa() < 2.5) {
                filterIterator.remove();
            }
        }

        System.out.println("After removing GPA below 2.5:");

        for (Student student : students) {
            System.out.println(student);
        }

        // 10. HashSet and Duplicate Student Test
        System.out.println("\n10. HashSet and Duplicate Student Test");

        Set<Student> studentSet = new HashSet<Student>();

        Student student1 =
                new Student(2001, "John", "Smith", 3.1, "CS");

        Student student2 =
                new Student(2002, "Mary", "Jones", 3.8, "BIO");

        Student duplicateStudent =
                new Student(2001, "John", "Smith", 3.1, "CS");

        studentSet.add(student1);
        studentSet.add(student2);

        System.out.println("HashSet before duplicate:");

        for (Student student : studentSet) {
            System.out.println(student);
        }

        boolean added = studentSet.add(duplicateStudent);

        System.out.println("Was duplicate added? " + added);

        System.out.println("HashSet after duplicate attempt:");

        for (Student student : studentSet) {
            System.out.println(student);
        }

        // Compare HashSet with ArrayList
        List<Student> duplicateList = new ArrayList<Student>();

        duplicateList.add(student1);
        duplicateList.add(duplicateStudent);

        System.out.println("\nArrayList with duplicate students:");

        for (Student student : duplicateList) {
            System.out.println(student);
        }

        // 11. LinkedList
        System.out.println("\n11. LinkedList");

        List<Student> linkedStudents = new LinkedList<Student>();

        linkedStudents.add(
                new Student(3001, "Alex", "Wilson", 3.5, "CS"));

        linkedStudents.add(
                new Student(3002, "Emma", "Stone", 3.9, "PSY"));

        System.out.println("LinkedList before removal:");

        for (Student student : linkedStudents) {
            System.out.println(student);
        }

        linkedStudents.remove(0);

        System.out.println("LinkedList after removal:");

        for (Student student : linkedStudents) {
            System.out.println(student);
        }

        // 12. TreeSet
        System.out.println("\n12. TreeSet and Sorted Students");

        Set<Student> treeSet = new TreeSet<Student>();

        treeSet.add(
                new Student(4001, "Zoe", "Adams", 3.4, "BIO"));

        treeSet.add(
                new Student(4002, "Adam", "Brown", 3.8, "CS"));

        treeSet.add(
                new Student(4003, "Mike", "Davis", 3.1, "MATH"));

        treeSet.add(
                new Student(4004, "Sarah", "Clark", 3.6, "ENG"));

        System.out.println("TreeSet:");

        for (Student student : treeSet) {
            System.out.println(student);
        }

        System.out.println("\n========== END OF PROGRAM ==========");
    }
}

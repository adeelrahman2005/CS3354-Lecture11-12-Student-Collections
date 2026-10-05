/**
 * Represents a university student.
 *
 * @author Adeel Rahman
 * @version 1.0
 */
public class Student implements Comparable<Student> {

    private int id;
    private String firstName;
    private String lastName;
    private double gpa;
    private String major;

    /**
     * Constructs a Student object.
     *
     * @param id student ID
     * @param firstName student's first name
     * @param lastName student's last name
     * @param gpa student's GPA
     * @param major student's major
     */
    public Student(int id, String firstName, String lastName,
                   double gpa, String major) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gpa = gpa;
        this.major = major;
    }

    /**
     * Gets the student ID.
     *
     * @return student ID
     */
    public int getId() {
        return id;
    }

    /**
     * Gets the student's first name.
     *
     * @return first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Gets the student's last name.
     *
     * @return last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Gets the student's GPA.
     *
     * @return GPA
     */
    public double getGpa() {
        return gpa;
    }

    /**
     * Gets the student's major.
     *
     * @return major
     */
    public String getMajor() {
        return major;
    }

    /**
     * Compares students by first name and then last name.
     *
     * @param other student being compared
     * @return comparison result
     */
    @Override
    public int compareTo(Student other) {
        int comparisonValue = this.firstName.compareTo(other.firstName);

        if (comparisonValue == 0) {
            comparisonValue = this.lastName.compareTo(other.lastName);
        }

        return comparisonValue;
    }

    /**
     * Checks whether two students have the same ID.
     *
     * @param obj object being compared
     * @return true if the IDs are the same
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (obj == null) {
            return false;
        } else if (obj instanceof Student) {
            Student other = (Student) obj;
            return this.id == other.id;
        }

        return false;
    }

    /**
     * Returns a hash code based on the student ID.
     *
     * @return hash code
     */
    @Override
    public int hashCode() {
        return Integer.hashCode(id);
    }

    /**
     * Returns the student information.
     *
     * @return student information
     */
    @Override
    public String toString() {
        return "Student[id=" + id
                + ", firstName=" + firstName
                + ", lastName=" + lastName
                + ", gpa=" + gpa
                + ", major=" + major + "]";
    }
}

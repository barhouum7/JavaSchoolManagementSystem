package school.management.system;

/**
 * Created by GitHub@barhouum7. -- This class is Responsible for keeping track
 * of Teacher's id, name, and Salary.
 */

public class Teacher {

    private int id;
    private String name;
    private double salary;

    /**
     * This a Constructor that we can use it to Create a new instances of Teacher
     * class and initializing a Teacher. Creates a new Teacher Object.
     * 
     * @param id     - Id of the Teacher.
     * @param name   - Name of the Teacher.
     * @param salary - Salary of the Teacher.
     */
    public Teacher(int id, String name, double salary) {

        this.id = id;
        this.name = name;
        this.salary = salary;

    }

    /**
     * Getter For the Id.
     * 
     * @return - Returning the Teacher's Id.
     */
    public int getId() {
        return this.id;
    }

    /**
     * Getter For the Name.
     * 
     * @return - Returning the Teacher's Name.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Getter For the Salary.
     * 
     * @return - Returning the Teacher's Salary.
     */
    public double getSalary() {
        return this.salary;
    }

    /**
     * Setting the Salary.
     * 
     * @param salary
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }
}

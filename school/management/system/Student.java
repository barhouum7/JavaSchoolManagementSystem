package school.management.system;

/**
 * Created by GitHub@barhouum7. -- This class is Responsible for keeeping the
 * track of students fees, name, grade, and fees paid.
 */

public class Student {
    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    /**
     * A Constructor that we can use it to Create a new instances of Student class
     * and initializing a Student. - Fees for every Student is $10.000. - Fees Paid
     * initially is 0.
     * 
     * @param id    - Id for Students: Unique.
     * @param name  - Name of the Student.
     * @param grade - Grade of the Student.
     */
    public Student(int id, String name, int grade) {
        this.feesPaid = 0;
        this.feesTotal = 10000;
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    /**
     * I'm not going to change the student's name, Id, and the total fees. So that's
     * why I don't need a setters for them.
     */

    /**
     * To Updating the student's grade.
     * 
     * @param grade - New Grade of the Student.
     */
    public void setGrade(int grade) {
        this.grade = grade;
    }

    /* Adding All the Getters now */

    /**
     * Getter For the Student's Id.
     * 
     * @return - Returning the Student's Id.
     */
    public int getId() {
        return this.id;
    }

    /**
     * Getter For the Student's Name.
     * 
     * @return - Returning the Student's Name.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Getter For thw Student's Grade.
     * 
     * @return - Returning the Student's Grade.
     */
    public int getGrade() {
        return this.grade;
    }

    /**
     * Getter For the Student's Paid Fees.
     * 
     * @return - Returning the Student's Paid Fees.
     */
    public int getFeesPaid() {
        return this.feesPaid;
    }

    /**
     * Getter For the Student's Total Fees.
     * 
     * @return - Returning the Student's Total Fees.
     */
    public int getFeesTotal() {
        return this.feesTotal;
    }

    /**
     * Keep Adding The Fees to feesPaid Field. Add the Fees to the Fees Paid. The
     * School is going to Receive the Funds.
     * 
     * @param fees The Fees that the Student Pays.
     */
    public void updateFeesPaid(int fees) {
        this.feesPaid += fees;
    }
}
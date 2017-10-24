//import java.util.Random;

/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 8.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/8/">Lab 8 Description</a>
 */
public class BankAccount {

    /**
     * Enum distinguishing between account types.
     */
    public enum BankAccountType {
        /**
         * Checkings account type.
         */
        CHECKINGS,

        /**
         * Savings account type.
         */
        SAVINGS,

        /**
         * Student account type.
         */
        STUDENT,

        /**
         * Workplace account type.
         */
        WORKPLACE
    }
    /**
     * Int account number.
     */
    private int accountNumber;

    /**
     * BankAccountType account type.
     */
    private BankAccountType accountType;

    /**
     * Double account balance.
     */
    private double accountBalance;

    /**
     * String owner name.
     */
    private String ownerName;

    /**
     * Double interest rate.
     */
    private double interestRate;

    /**
     * Double interest Earned.
     */
    private double interestEarned;

    /**
     * Constructor for BankAccount class.
     *
     * @param name - owner's name.
     * @param accountCategory - account type
     */
    public BankAccount(final String name, final BankAccountType accountCategory) {
        this.accountType = accountCategory;
        this.ownerName = name;
    }

    /**
     * Sets account number.
     * @param num - input account number
     */
    public void setAccountNumber(final int num) {
        this.accountNumber = num;
    }

    /**
     * Gets account number.
     * @return account number
     */
    public int getAccountNumber() {
        return this.accountNumber;
    }

    /**
     * Sets bank account type.
     * @param type - enum bank account type
     */
    public void setBankAccountType(final BankAccountType type) {
        this.accountType = type;
    }

    /**
     * Gets bank account type.
     * @return bank account type
     */
    public BankAccountType getBankAccountType() {
        return this.accountType;
    }

    /**
     * Sets account balance.
     * @param bal - account balance
     */
    public void setAccountBalance(final double bal) {
        this.accountBalance = bal;
    }

    /**
     * Gets account balance.
     * @return account balance
     */
    public double getAccountBalance() {
        return this.accountBalance;
    }

    /**
     * Sets owner name.
     * @param name - owner's name
     */
    public void setOwnerName(final String name) {
        this.ownerName = name;
    }

    /**
     * Gets owner's name.
     * @return owner name
     */
    public String getOwnerName() {
        return this.ownerName;
    }

    /**
     * Sets interest rate.
     * @param i -interest rate
     */
    public void setInterestRate(final double i) {
        this.interestRate = i;
    }

    /**
     * Gets interest rate.
     * @return interest rate
     */
    public double getInterestRate() {
        return this.interestRate;
    }

    /**
     * Sets interest earned.
     * @param iEarned - input interest earned
     */
    public void setInterestEarned(final double iEarned) {
        this.interestEarned = iEarned;
    }

    /**
     * Gets interest earned.
     * @return interest earned
     */
    public double getInterestEarned() {
        return this.interestEarned;
    }
}

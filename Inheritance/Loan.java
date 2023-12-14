package Inheritance;

public class Loan {
    int LoanId;
    int amount;
    int rateOfInterest;
    int loanDuration;
    String borrowerName;
    void Apply(){

    }
    void checkLoanEligibility(){

    }
    void calculateInterestPayment(){}
}
 class PersonalLoan extends Loan{
     public static void main(String[] args) {
         PersonalLoan personalLoan=new PersonalLoan();
         personalLoan.LoanId=100;
         personalLoan.amount=100000;
         personalLoan.loanDuration=1;
         personalLoan.borrowerName="Abhi";
         personalLoan.rateOfInterest=12;
         System.out.println(personalLoan.LoanId);
         System.out.println(personalLoan.amount);
         System.out.println(personalLoan.loanDuration);
         System.out.println(personalLoan.borrowerName);
         System.out.println(personalLoan.rateOfInterest);
     }
}

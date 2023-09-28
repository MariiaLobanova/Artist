package Library;

 public class Loan {
     private String book;
     private int IDmember;
     private int dueDate;

     public Loan(String book, int IDmember, int dueDate) {
         this.book = book;
         this.IDmember = IDmember;
         this.dueDate = dueDate;
     }

     public void initiateLoan() {
         System.out.println(IDmember + " initiated a loan for '" + book + "'");
     }

     public void terminateLoan() {
         System.out.println(IDmember+ " terminated the loan for '" + book + "'");
     }
 }


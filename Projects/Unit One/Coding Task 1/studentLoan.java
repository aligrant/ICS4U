/*In finances, when we are making payments over time while compound interest is occurring,
 we use an annuity formula.  If a student has $40 000 in debt, and makes payments of $300 per month,
 while an interest rate of 6% per annum compounded annually is applied, 
 the equation to model the current balance owing, PV, at n months into repaying the loan is:
 Every month, $300 is taken off the debt, and then interest (0.005% of the amount owing) is added on.
 Write a program that prints a break down of the monthly payment until the loan is completely paid off: */

 //I'm importing this so that I can print the balance with select decimal palces and not loose data. 
 import java.text.DecimalFormat;
 public class studentLoan{
    public static void main(String[] args){
        //initial debt
        double debt = 40000;
        //Creating decimal format so that I can limit the decimal places in the balance to 2. 
        DecimalFormat df2 = new DecimalFormat("#.00");
        //Same as above but limiting to 3
        DecimalFormat df3 = new DecimalFormat("0.000");
        //"i" represents the number of months in the loop below 
        double i;
        /*  Essentially, for as long as the debt is greater than 300(last payment will be less than this so it has to be percise), 
        the student will pay 300 each month and their debt will increase by 0.005xthe amount of debt left (a.k.a 0.5%)*/
        for (i=1;debt>300;i++){
            double start = debt;
            double interest = 0.005*(debt);
            debt=1.005*(debt-300);
            //Printing-The collumns have unnoticeable changes in size when the amount of digit changes. 
            System.out.println("Month:"+(int)i+" | Starting Balance:$"+ df2.format(start)+" | Interest:$"+df3.format(interest)+" | Balance Owed:$"+df2.format(debt));
            /*The last payment is under 300, so the loop wont print it and it needs to be done manually. 
            Also, interest is added after the payment so after the last payment there will be no interest as the debt is 0*/
            if(debt<300){
                System.out.println("Month:"+(int)(i+1)+" | Starting Balance:$"+ df2.format(debt)+" | Interest:$0.000"+" | Balance Owed:$0.00");
            }
        }
    }}
 
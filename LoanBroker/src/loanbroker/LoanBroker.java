/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loanbroker;

/**
 *
 * @author razzthechamp
 */
public class LoanBroker
{
    
    public void run()
    {
        String[] choices = {"New loan", "Get Loan quote", "quit"};
        while(true)
        {
            System.out.println("");
            UI.choice(choices); 
            int aws = UI.getInteger();
            if(aws == 0)
            {
                newLoan();
            }
        }
    }

    private void newLoan()
    {
        System.out.println("Enter cpr: ");
        int cpr = scan.next;
        LoanRequest.setCpr(cpr);
        System.out.println("Enter Loan Amount: ");
        int LoanAmount = scan.next();
        LoanRequest.setLoanAmount();
        
    }
    
}

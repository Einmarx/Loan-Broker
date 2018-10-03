/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loanbroker;

import java.util.Scanner;

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
        while(true){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter cpr: ");
        int cpr = scan.nextInt();
        LoanRequest.setCpr(cpr);
        System.out.println("Enter Loan Amount: ");
        int LoanAmount = scan.nextInt();
        LoanRequest.setLoanAmount();
        System.out.println("Enter loan time: ");
        int loanPeriod = scan.nextInt();
        LoanRequest.setloanPeriod();
        System.out.println("Enter credit score: ");
        LoanRequest.setCreditScore();
        
        
        break; 
        
                }
    }
    
}

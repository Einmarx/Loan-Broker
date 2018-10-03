/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankmanager;

/**
 *
 * @author Oliver
 */
public class LoanResponse
{
    private loanRequest request; 
    private double rate= 1.5;
    
    
    public double getLoanMonth(int loanPeriod, double rate)
    {
        if(loanPeriod < 48)
        {
            rate = 1.7;
        }
        return rate;
    }
    
    public double getRateCheckCreditScore(int creditScore, double rate)
    {
        if(creditScore < 600)
        {
            rate = 3.0;
        }
        return rate;
    }
    
    public double getLoanAmount(int loanAmount, double rate)
    {
        if(loanAmount > 500000)
        {
            rate = 1.5;
        }
        return rate;
    }
}

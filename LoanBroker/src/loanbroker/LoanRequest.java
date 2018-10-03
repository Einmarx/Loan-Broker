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
public class LoanRequest
{

    private int loanAmount;
    private int cpr;
    private int loanPeriod;
    private int creditScore;

    public LoanRequest(int cpr, int loanAmount, int loanPeriod, int creditScore)
    {

        this.cpr = cpr;
        this.creditScore = creditScore;
        this.loanAmount = loanAmount;
        this.loanPeriod = loanPeriod;
        
        //  this.password = password;
    }

    public int getLoanAmout()
    {
        return loanAmount;
    }

    public void setLoanAmout(int loanAmout)
    {
        this.loanAmount = loanAmout;
    }

    public int getCpr()
    {
        return cpr;
    }

    public static void setCpr(int cpr)
    {
        //this.cpr = cpr;
    }

    public int getLoanPeriod()
    {
        return loanPeriod;
    }

    public void setLoanPeriod(int loanPeriod)
    {
        this.loanPeriod = loanPeriod;
    }

    public int getCreditScore()
    {
        return creditScore;
    }

    public void setCreditScore(int creditScore)
    {
        this.creditScore = creditScore;
    }


}

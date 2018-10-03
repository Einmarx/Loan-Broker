/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankmanager;


public class loanRequest
{
    private long CPR;
    private long password;
    private int creditScore;
    private double loanAmount;
    private int loanPeriod;

    public long getCPR()
    {
        return CPR;
    }

    public void setCPR(long CPR)
    {
        this.CPR = CPR;
    }

    public long getPassword()
    {
        return password;
    }

    public void setPassword(long password)
    {
        this.password = password;
    }

    public int getCreditScore()
    {
        return creditScore;
    }

    public void setCreditScore(int creditScore)
    {
        this.creditScore = creditScore;
    }

    public double getLoanAmount()
    {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount)
    {
        this.loanAmount = loanAmount;
    }

    public int getLoanPeriod()
    {
        return loanPeriod;
    }

    public void setLoanPeriod(int loanPeriod)
    {
        this.loanPeriod = loanPeriod;
    }
    
    
}

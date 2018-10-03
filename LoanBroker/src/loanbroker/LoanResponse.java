package loanbroker;

public class LoanResponse
{

    private LoanRequest request;
    private double rate = 0;
    // private int password;

 
    public double getLoanAmout(int loanAmount, double rate)
    {
        if (loanAmount > 500000)
        {
            rate = 1.5;
        }
        else
        {
            rate = 2.5;
        }
        return rate;
    }
    
    public double getLoanMonth(int loanPeriod, double rate)
    {
        if (loanPeriod < 48)
        {
            rate *= 1.7;
        }
        return rate;
    }

    public double getRateCheckCreditScore(int creditScore, double rate)
    {
        if (creditScore < 600)
        {
            rate *= 2.2;
        }
        return rate;
    }


}

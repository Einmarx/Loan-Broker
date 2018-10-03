package loanbroker;

public class LoanResponse
{

    private LoanRequest request;
    private double rate;
    // private int password;

 

    public double getLoanYear(int loanPeriod, double rate)
    {
        if (loanPeriod < 4)
        {
            rate *= 1.7;
        }
        return rate;
    }

    public double getRateCheckCreditScore(int creditScore, double rate)
    {
        if (creditScore < 48)
        {
            rate *= 1.2;
        }
        return rate;
    }

    public double getLoanAmout(int loanAmount, double rate)
    {
        if (loanAmount > 500000)
        {
            rate *= (500000 / 100);
        }
        return rate;
    }

}

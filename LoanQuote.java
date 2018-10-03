
package loanbroker;

import java.util.ArrayList;

/**
 *
 * @author razzthechamp
 */
public class LoanQuote
{
private LoanRequest request;
private LoanResponse response;
private int cpr;
public ArrayList saved;




public LoanResponse getLoan()
{
    return response;
}

public void setLoanQuote(int cpr, LoanResponse response)
{
    saved.add(response);
    saved.add(cpr);
}

public static ArrayList getLoan(ArrayList saved)
{
    return saved;
}

public static int setCpr(int cpr)
{
    return cpr;
}

}

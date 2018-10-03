package loanbroker;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author razzthechamp
 */
public class Bank
{

    private int rate;
    private LoanRequest request;
    private LoanResponse response;

    public Bank(LoanRequest request, LoanResponse response)
    {
        this.request = request;
        this.response = response;
        
    }
}

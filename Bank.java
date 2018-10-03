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

    public void start()
    {
        Scanner scan = new Scanner(System.in);
        while (true)
        {
            String[] choices =
            {
                "New loan", "Get loan from cpr", "Quit"
            };
            UI.choice(choices);
            UI.getInteger();
            int aws = UI.getInteger();
            if (aws == 2)
            {
                break;
            } else if (aws == 1)
            {
                System.out.println("Please inter your cpr: ");
                int cpr = UI.getInteger();
                LoanQuote.setCpr(cpr);
                
               // LoanQuote.getLoan(saved);

            } else if (aws == 0)
            {
                    
            }
        }

    }

    public void loanAPP()
    {
          System.out.println("Please enter your cpr: ");
          
    }
    
    
}

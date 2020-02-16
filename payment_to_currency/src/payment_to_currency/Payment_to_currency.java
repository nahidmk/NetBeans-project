
package payment_to_currency;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Payment_to_currency {

    public static void main(String[] args) {
        Scanner mk = new Scanner(System.in);
        double payment;
        payment = mk.nextDouble();
        NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat chi = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat fra = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        NumberFormat ind = NumberFormat.getCurrencyInstance(new Locale("en","in"));
        String usc,chic,frac,indc;
        usc = us.format(payment);
        chic = chi.format(payment);
        frac = fra.format(payment);
        indc = ind.format(payment);
        
        System.out.println("us "+usc);
        System.out.println("china "+chic);
        System.out.println("franch "+frac);
        System.out.println("Indea "+indc);

    }
    
}

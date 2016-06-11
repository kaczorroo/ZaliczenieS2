package com.company;

/**
 * Created by ced on 2016-06-11.
 */
public class ZajezdniaTramwajowa extends Pojazdy {
    private String jakaZajezdnia;

    public ZajezdniaTramwajowa(int numerPojazdu, int predkoscMax, String zajezdnia, String jakaZajezdnia) {
        super(numerPojazdu, predkoscMax, zajezdnia);
        this.jakaZajezdnia = jakaZajezdnia;
    }

    @Override
    public String toString() {
        return "ZajezdniaTramwajowa{" +
                "jakaZajezdnia='" + jakaZajezdnia + '\'' +
                '}';
    }
}

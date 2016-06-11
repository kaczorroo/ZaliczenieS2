package com.company;

/**
 * Created by ced on 2016-06-11.
 */
public class ZajezdniaAutobusowa extends Zajezdnia {
    private int ilePaliwa;

    public ZajezdniaAutobusowa(int numerPojazdu, int predkoscMax, String zajezdnia, String jakaZajezdnia, int ilePaliwa) {
        super(numerPojazdu, predkoscMax, zajezdnia, jakaZajezdnia);
        this.ilePaliwa = ilePaliwa;
    }

    public ZajezdniaAutobusowa(int numerPojazdu, int predkoscMax, String zajezdnia, String jakaZajezdnia) {
        super(numerPojazdu, predkoscMax, zajezdnia, jakaZajezdnia);
    }

    public int SumaSpalania() {
        return ilePaliwa;
    }

    @Override
    public String toString() {
        return "ZajezdniaAutobusowa{" +
                "jakaZajezdnia='" + getZajezdnia() + '\'' +
                ", ilePaliwa=" + ilePaliwa +
                '}';
    }
}

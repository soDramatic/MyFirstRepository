package jukebox.fixtures;

import jukebox.JukeBox;

public class CreditsForPayment {

    private int payment;
    private int credits;

    public void execute() { // executed after each table row
        this.credits = new JukeBox().calculateCredits(payment);
    }

    public void setPayment(int payment) { // setter method
        this.payment = payment;
    }

    public int credits() { // returning function because of question mark in the test
        return this.credits;
    }
}

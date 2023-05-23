package com.company;
import java.text.SimpleDateFormat;
import java.util.Date;

public class donation {
    double amount;
    int donationID;
    donation(double amount,int abcID){
        this.amount = amount;
        this.donationID = abcID;
    }
    void anual (){
        maindb ob = new maindb();
                                                                                                        //donation a amount
        Date m = new Date();
        double getAmount = ob.getDb();

        SimpleDateFormat sdf = new  SimpleDateFormat("d");              //getting date
        SimpleDateFormat mon = new  SimpleDateFormat("M");              //getting month
        int b =Integer.parseInt(sdf.format(m));
        int mo =Integer.parseInt(mon.format(m));

        if((mo==5)&&(b==24)){
            System.out.println("Amount of "+amount+" is transfered as a donation. Donation id number "+donationID);
            getAmount = getAmount - amount;
            ob.setDb(getAmount);
        }
    }
}

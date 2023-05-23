package com.company;

import java.util.Scanner;

public class Loan extends account {
    void loan(int v)
    {
        System.out.println("***********************************************");
        System.out.println("According to your account balance your maximum loan limit as fallow:");         // loan details
        System.out.println("in range of 20000-5000:30000");
        System.out.println("in range of 50000-10000:80000");
        System.out.println("in range of 100000-150000:130000");
        System.out.println("more than 150000:150000");
        System.out.println("interest is 15%");
        System.out.println("***********************************************");
        Scanner loa=new Scanner(System.in);
        System.out.println("Enter the required amount:");
        double amt= loa.nextDouble();                                                                          //loan amount
        double monthpay=0;
        System.out.println("***********************************************");
        if((amount[v]<=50000)&&(amount[v]>=20000))
        {
            if(amt<=30000)                                                                                  //checking ability to get a loan
            {                                                                                                  //calculating the pay
                System.out.println("your loan is passed");
                System.out.println("you have to pay in a year:");
                monthpay=(amt+amt*0.15)/12;
                System.out.println("your monthly pay is:Rs."+monthpay);
            }
        }
        if((amount[v]<=100000)&&(amount[v]>=50000))
        {
            if(amt<=80000)
            {
                System.out.println("your loan is passed");
                System.out.println("you have to pay in two year:");
                monthpay=(amt+amt*0.15)/24;
                System.out.println("your monthly pay is:Rs."+monthpay);
            }
        }
        if((amount[v]<=150000)&&(amount[v]>=100000))
        {
            if(amt<=130000)
            {
                System.out.println("your loan is passed");
                System.out.println("you have to pay in two year:");
                monthpay=(amt+amt*0.15)/24;
                System.out.println("your monthly pay is:Rs."+monthpay);
            }
        }
        if((amount[v]>=150000))
        {
            if(amt<=150000)
            {
                System.out.println("your loan is passed");
                System.out.println("you have to pay in two year:");
                monthpay=(amt+amt*015)/36;
                System.out.println("your monthly pay is:Rs."+monthpay);
            }
        }
        else
        {
            System.out.println("you can't have a loan");
        }
        System.out.println("***********************************************");
        System.out.println("return to Home page:y/n");
        Scanner retu=new Scanner(System.in);
        String ret=retu.nextLine();
        if(ret.equals("y")) {
            Main.main(null);
        }
    }
}

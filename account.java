package com.company;

import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.*;
abstract class add extends maindb implements data  {}

public class account extends add {
    public int t;
    public double[] amount={12122,554554,545466,54646,54465,479985,234485,131546,54465};        //initialize amounts


    double tra(int b)
    {

        Scanner dep = new Scanner(System.in);
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("input 1 for deposit:");
        System.out.println("input 2 for withdraw:");
        System.out.println("input 3 for check balance:");
        System.out.println("input 4 for Transfer cash:");
        System.out.println("------>:");
        double gdb=getDb();
        Scanner newin=new Scanner(System.in);
        int chose=newin.nextInt();
        account amo=new account();
        if(chose==1)
        {
            System.out.println("Enter deposit amount:");
            double deposit= dep.nextDouble();
            gdb=gdb+deposit;                                      //adding money to main data
            amo.amount[b]=amount[b]+deposit;                    // adding money to account
            System.out.println("***********************************************");
            System.out.println("* Your deposit is add");
            System.out.println("* Your balance is Rs:"+amo.amount[b]);
            System.out.println("************* THANK YOU COME AGAIN ************");


        }
        if(chose==2)
        {
            System.out.println("Enter withdraw amount:Rs.");
            double withdraw=dep.nextDouble();
            gdb=gdb-withdraw;                                 //getting money from main data
            amo.amount[b]=amount[b]-withdraw;               //getting money from account
            System.out.println("***********************************************");
            System.out.println("* Your withdraw amount is:Rs."+withdraw);
            System.out.println("* Your balance is:Rs."+amo.amount[b]);
            System.out.println("************* THANK YOU COME AGAIN ************");
        }
        if(chose==3)
        {
            System.out.println("***********************************************");
            System.out.println("Your balance is:Rs."+amo.amount[b]);
            interest(b);
            System.out.println("************* THANK YOU COME AGAIN ************");
        }
        if(chose==4)
        {
            System.out.println("***********************************************");
            System.out.print("Enter receivers account number:");
            int receive=dep.nextInt();                                                 //receivers pin
            int c=receive-1001;
            System.out.println("Receivers name:"+name[c]);
            System.out.print("Enter transfer amount:");
            double transfer=dep.nextDouble();
            amo.amount[b]=amount[b]-transfer;
            amo.amount[c]=amo.amount[c]+transfer;
            System.out.println("Transfer success full");
            System.out.println("************* THANK YOU COME AGAIN ************");
        }
        setDb(gdb);


        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("return to Home page:y/n");
        Scanner retu=new Scanner(System.in);
        String ret=retu.nextLine();
        if(ret.equals("y")) {
            Main.main(null);
        }
        return 0;

    }
    void interest(int m)
    {

        Date d=new Date();
        SimpleDateFormat sdf=new  SimpleDateFormat("d");
        int b=Integer.parseInt(sdf.format(d));
       if(b==30)
       {
           System.out.println("your interest is added");
           System.out.println("your balance is:");
           for(int i=0;i< pin.length;i++)                           //counting interest
           {
               if(acctype[i]=='a') {
                   amount[i] = amount[i] + amount[i] * 0.13;

               }
               if(acctype[i]=='y') {
                   amount[i] = amount[i] + amount[i] * 0.05;

               }
               if(acctype[i]=='w') {
                   amount[i] = amount[i] + amount[i] * 0.09;

               }
               if(acctype[i]=='c') {
                   amount[i] = amount[i] + amount[i] * 0.1;

               }

           }
           System.out.println(amount[m]);
       }


    }
}

interface data
{
    public String []name={"kamala","nimal","gihan","bishan","isuru","nimala","dhanidu","rukshan","sunila"};     // account names
    public int[] pin={1001,1002,1003,1004,1005,1006,1007,1008,1009};                                            //account pin
    public char[] acctype={'a','c','y','y','a','w','c','y','w'};                                                //account types
    //a-adult account
    //c -child account
    //y-youth account
    //w-women account
}


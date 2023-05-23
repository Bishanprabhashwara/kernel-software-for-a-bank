package com.company;

import java.util.Scanner;

public class maindb
{
    private double db=1000000.00000;                // main balance in the bank
    public double getDb()
    {
        return db;
    }              // getter
    public void setDb(double db)
    {
        this.db=db;
    }       //setter

    void  maindb()
    {
        maindb newmaindb=new maindb();
        System.out.println("Account balance:Rs."+newmaindb.db);
        System.out.println("Adding amount:");
        Scanner amount=new Scanner(System.in);
        double amt=amount.nextDouble();
        newmaindb.db=newmaindb.db+amt;
        System.out.println("Full balance"+newmaindb.db);
        System.out.println("return to Home page:y/n");
        Scanner retu=new Scanner(System.in);
        String ret=retu.nextLine();
        if(ret.equals("y")) {
            Main.main(null);
        }
    }
}

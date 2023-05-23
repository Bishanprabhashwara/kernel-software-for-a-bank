package com.company;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

abstract class col extends account implements data{};

abstract class coll extends col {};
public class Reward extends coll{
    Date m=new Date();

    account rew1=new account();

    SimpleDateFormat sdf=new  SimpleDateFormat("d");        //getting date
    SimpleDateFormat mon=new  SimpleDateFormat("M");        //getting mounth
    int b=Integer.parseInt(sdf.format(m));
    int mo=Integer.parseInt(mon.format(m));

    public void reward()
    {
        for (int i=0;i<acctype.length;i++)
        {
            if((mo==3)&&(b==8))                 //rewarding to women day
            {
                if(acctype[i]=='w')
                {
                    amount[i]=amount[i]+50000;
                    System.out.println(pin[i]+" have a reward of "+amount[i]+" due to world women day");
                }

            }

        }
        for (int i=0;i<acctype.length;i++)
        {
            if((mo==10)&&(b==1))                    //rewarding to childrens day
            {
                if(acctype[i]=='c')
                {
                    amount[i]=amount[i]+10000;
                    System.out.println(pin[i]+" have a reward of "+amount[i]+" due to children day day");
                }
                if(acctype[i]=='a')                     //rewarding to adults day
                {
                    amount[i]=amount[i]+20000;
                    System.out.println(pin[i]+" a reward of "+amount[i]+" due to elders day day");
                }

            }
            else
            {
                System.out.println("no one have any rewards");
                break;
            }

        }
        System.out.println("return to Home page:y/n");
        Scanner retu=new Scanner(System.in);
        String ret=retu.nextLine();
        if(ret.equals("y")) {
            Main.main(null);
        }

    }

}

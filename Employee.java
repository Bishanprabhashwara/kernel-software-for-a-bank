package com.company;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Employee extends maindb {
    int[] empid={2001,2002,2003,2004,2005,2006,2007,2008,2009,2010};
    String[] empName={"wanidu","thanula","sakunika","haridu","wimala","kamal","Amal","perera","jayasinhe","mahesh"};
    String[] address={"galle","matara","nuwara","gampaha","colombo","galle","ampara","galle","matara","colombo"};
    String[] position={"accountant","assistant","accountant","manager","assistant","accountant","accountant","manager","assistant","assistant"};

    void details()
    {
        int f=0;
        Scanner details=new Scanner(System.in);
        System.out.println("Enter employee id:");
        int id=details.nextInt();
        Employee newemp=new Employee();
        for(int i=0;i< empid.length;i++)                        // display employee details
        {
            if(empid[i]==id)
            {
                System.out.println("***********************************************");
                System.out.println("Employee name:"+empName[i]);
                System.out.println("Employee address:"+address[i]);
                System.out.println("Employee position:"+position[i]);
                f=i;
                System.out.println("***********************************************");
            }


        }
        newemp.pay(f);
        System.out.println("return to Home page:y/n");
        Scanner retu=new Scanner(System.in);
        String ret=retu.nextLine();
        if(ret.equals("y")) {
            Main.main(null);
        }

    }
    void pay(int x)
    {
        double gDb=getDb();
        Date d=new Date();
        SimpleDateFormat sdf=new  SimpleDateFormat("d");                //getting the date
        int b=Integer.parseInt(sdf.format(d));
        if(b==25)
        {
            if (position[x].equals("accountant"))
            {
                System.out.println("salary of 100000 added");
            }
            if (position[x].equals("assistant"))
            {
                System.out.println("salary of 50000 added");
            }
            if (position[x].equals("manager"))
            {
                System.out.println("salary of 120000 added");
            }
        for (int j=0;j< empid.length;j++)
        {

            if(position[j].equals("accountant"))
            {
                gDb=gDb-100000;

            }
            if(position[j].equals("assistant"))
            {
                gDb=gDb-50000;

            }
            if(position[j].equals("manager"))
            {
                gDb=gDb-120000;

            }
            setDb(gDb);

        }
        }
    }

}

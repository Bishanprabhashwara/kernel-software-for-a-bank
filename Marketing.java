package com.company;

import java.util.Scanner;

public class Marketing extends maindb {
void marketing()
{
    double gDb=getDb();
    System.out.println("select marketing type:");
    System.out.println("1:television");
    System.out.println("2:newspaper");
    System.out.println("3:radio");
    System.out.println("4:social media");
    System.out.println(("->:"));
    maindb newdb=new maindb();
    Scanner mark=new Scanner(System.in);
    int type=mark.nextInt();
    if(type==1)                                             //choosing market method
    {
        gDb=gDb-100000;
    }
    if(type==2)
    {
        gDb=gDb-50000;
    }
    if(type==1)
    {
        gDb=gDb-70000;
    }
    if(type==1)
    {
        gDb=gDb-90000;
    }
    setDb(gDb);
    System.out.println("return to Home page:y/n");
    Scanner retu=new Scanner(System.in);
    String ret=retu.nextLine();
    if(ret.equals("y")) {
        Main.main(null);
    }
}
}

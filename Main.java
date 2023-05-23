package com.company;
import java.util.Date;
import java.util.Scanner;

import static java.lang.String.valueOf;
//abstract class add1 implements reward,data {}
class Admin
{
    Scanner adm=new Scanner(System.in);


    String username="Admin";
    void admin(int y)
    {
        int count=0;
        System.out.println("User name:");
        String usern=adm.nextLine();                                       //reading username
        System.out.println("Password:");                                    //reading password
        int passwordA=adm.nextInt();
        Employee emp =new Employee();                                   // making object to Employee class
        Marketing mar=new Marketing();                                  //// making object to marketing class
        maindb newmaindp2=new maindb();
        donation don = new donation(10000,001);         // making object to donation class

        if((username.equals(usern))&&(passwordA==12345))                //checking username and password
        {
            if(y==2) {
                emp.details();
            }
            if(y==4)
            {
                mar.marketing();
            }
            if(y==6)
            {
                newmaindp2.maindb();
            }
            if(y==7){
                don.anual();
            }

        }
        else
        {
            System.out.println("wrong user name or password ");
            Main.main(null);
        }
    }
}
class Password implements data
{

    public int n=0;
    public void password(int c)
    {
        int n=0;
        int p = 0;

        data da=new Password();
        Password pass1=new Password();
        Scanner pass=new Scanner(System.in);
        System.out.println("Enter pin:");                       //reading pin
        int password=pass.nextInt();
        for(int i=0;i< pin.length;i++) {
            if (password == pin[i])
            {
                p=pin[i];
                n=i;

            }

        }
            if (password == p)          //checking the pin
            {
                if(c==1) {
                    System.out.println("Welcome" + " " + name[n]);
                    account acc = new account();
                    acc.tra(n);
                }
                if(c==3) {
                    System.out.println("Welcome" + " " + name[n]);
                    Loan newloan = new Loan();
                    newloan.loan(n);
                }

            }
            else
            {
                System.out.println("Wrong pin");
                System.out.print("Again ");
                pass1.password(c);
            }

    }

}
interface collect
{
    public Date welcome();
}

public class Main extends Password{


    public Date welcome()
    {
        Date d=new Date();
        return d;
    }
    public static void main(String[] args) {
	// write your code here

        System.out.println("-----------------------------------------------------------------------------");
        Main date=new Main();
        System.out.println("WELCOME\t\t\t\t\t\t\t\t\t\t\t"+date.welcome());
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("Select system:");
        System.out.println("1:Customer banking:");
        System.out.println("2:Employee Details:");
        System.out.println("3:Loaning system:");
        System.out.println("4:Marketing system:");
        System.out.println("5:Rewarding system:");
        System.out.println("6:Manin account:");
        System.out.println("7:Donation:");
        System.out.println("Enter system number: ");
        maindb mdb = new maindb();
        Scanner newinput=new Scanner(System.in);
        int system=newinput.nextInt();
        if (system==1) {                                        //selecting system
            Password pas = new Password();
            pas.password(system);
        }
        account acc1=new account();
        acc1.interest(0);
        if(system==5) {                                 //rewarding system
            Reward newrew = new Reward();
            newrew.reward();
        }
        if(system==2) {
            Admin newadmin = new Admin();
            newadmin.admin(system);
        }
        if(system==6) {
            Admin newadmin1 = new Admin();
            newadmin1.admin(system);
        }
        if(system==4) {
            Admin newadmin2 = new Admin();
            newadmin2.admin(system);
        }
        if(system==3)
        {
            Password pas = new Password();
            pas.password(system);
        }
        if(system == 7){
            Admin newadmin1 = new Admin();
            newadmin1.admin(system);
        }
        else
        {
            System.out.println("wrong input try again");
            Main.main(null);
        }
        System.out.println("-----------------------------------------------------------------------------");
    }

}

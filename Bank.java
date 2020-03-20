//Assignment Q4
/*
Assume that a bank maintains two kinds of accounts for customers, one called as savings
account and other as current account. The savings account provides compound interest and
withdrawal facilities but no cheque book facility. The current account provides cheque 
book facility but no interest. Current account holders also maintain a minimum balance 
and if the balance falls below this level, a service charge is imposed.  Create a class
account that stores customer name, account number (Should generate automatically if new 
customer added) and type of account. From this derive the classes cur_acct and sav_acct 
to make them more specific to their requirements. Include necessary member functions in 
order to achieve the following tasks: 
a. Accept deposit from a customer and update the balance 
b. Display the balance. 
c. Compute and deposit interest. 
d. Permit withdrawal andupdate the balance. 
e. Check for minimum balance, impose penalty, necessary and update the balance.  
 */
import java.util.Scanner;
import java.lang.Math;
class account
{
String cname;
int accno;
String type;
int bal;
void account(String cname , int accno , String type, int bal)
{
this.cname = cname;
this.accno = accno;
this.type = type;
this.bal = bal;
}
void input()
{
Scanner s = new Scanner(System.in);
System.out.println("Enter cname");
cname = s.nextLine();
System.out.println("Enter accno");
accno = s.nextInt();
System.out.println("Enter bal");
bal = s.nextInt();
}
void display(){
System.out.println("Customer Name " + cname);
System.out.println("Account Number " + accno);
System.out.println("Balance " + bal);
}
void deposit(){
Scanner s = new Scanner(System.in);
int amt;
System.out.println("Enter the amount to deposit");
amt = s.nextInt();
bal=bal+amt;
}
}
class savacct extends account
{
Scanner s = new Scanner(System.in);
double inter;
int comp_int(){
int time1,rate1;
rate1=10;
System.out.println("\nEnter time");
time1 = s.nextInt();
inter = bal*Math.pow(1+rate1/100 , time1) - bal ;
return 1 ;
}
void update_bal()
{
bal=bal+comp_int();
}
void withdrawal()
{
int amt;
System.out.println("Enter amount to withdrawn");
amt = s.nextInt();
if(bal>=amt){
bal=bal-amt;
}
else
{
System.out.println("The amount cannot be withdrawn");
}
}
}


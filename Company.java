import java.util.*;
class employee
{
String name;
int empid;
int salary;
employee()
{
name="Animesh";
empid=22;
salary=9000;
}
employee(String n,int e,int s)
{
name=n;
empid=e;
salary=s;
}
String no()
{
return name;
}
int fo()
{
return salary;
}
double increaseSalary(double per_in)
{
double in=(salary*(per_in/100));
double s=salary+in;
return s;
}
}
class manager extends employee
{
public String department="d";

}
class Company{
}

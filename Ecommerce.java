import java.util.*;
class Ecommerce
{
void numberofItems(int tag)
{
   int n=10;
   if(tag>=10)
   {
    int count=0;
    if(tag%n==0)
  {
    count=tag/n;   
  }
int p=count+tag;
    System.out.print("The total number of items (purchased + free items) :"+p);
   }  

}
public static void main(String[] args)
{
Scanner sc=new Scanner (System.in);
System.out.print("Money Spent:");
int spent=sc.nextInt();
System.out.print("Price of each item:");
int item=sc.nextInt();
System.out.print("Number of tags:");
int tags=sc.nextInt();
Ecommerce obj=new Ecommerce();
obj.numberofItems(tags);
}
}




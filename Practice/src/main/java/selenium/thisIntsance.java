package selenium;

public class thisIntsance
{
	 int a=15;
	 int b=30;
void age()
{
	int a=19;
	System.out.println("gowtham "+ this.b);
	}
public static void main(String[] args) 
{
   int b=25;
   thisIntsance t=new thisIntsance();
   t.age();
   System.out.println(b);
}
}

package selenium;

public class methodArguments 
{
    public static void main(String[] args)
    {
		methodArguments first=new methodArguments();
		first.me("Gowtham");
		first.me(25);
	}
	public void me(String name)
	{
		System.out.println(name);
	}
	public void me(int age)
	{
		System.out.println(age);
	}
}

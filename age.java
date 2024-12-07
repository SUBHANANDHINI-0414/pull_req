class age {
int b;
age()
{
System.out.println("constructor call");
b=50;
}
public static void main(String args[])
{
age obj = new age();
System.out.println("The number is:"+obj.b);
}
}


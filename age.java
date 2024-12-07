class age {
int a;
age()
{
System.out.println("constructor call");
a=49;
}
public static void main(String args[])
{
age obj = new age();
System.out.println("The number is:"+obj.a);
}
}


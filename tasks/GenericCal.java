package tasks;
class Cal
{
	void test()
	{
		System.out.println("Running");
	}
}

 class GenericCal {
public static void  main(String[] args) {
   System.out.println("HI");	
   Cal a = new Cal();
   a.test();
}
}

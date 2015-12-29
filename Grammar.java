public class Grammar{


	public static void main(String[] args) {
		int x = 10 ;
		int y = 20 ;
		int z = 30 ; 

		/*
		* if-else if -else
		*/
		if (x == 10) {
			System.out.println("x = "+ x);
		}else if (x == 20) {
			System.out.println("11111");
		}else{
			System.out.println("kill the world");
		}

		/*
		*	switch -case -default
		*/
		char grade = 'c';
		switch (grade) 
		{
			case 'a':
				System.out.println("excellent");
				break;
			case 'b':
			case 'c':
				System.out.println("well done");
				break;
			case 'd':
				System.out.println("you passed");
				break;
			case 'e':
				System.out.println("better try again");
				break;
			default:
				System.out.println("invallid grade");

		}

		System.out.println("your grade is "+grade);
	}
}
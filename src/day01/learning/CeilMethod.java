package day01.learning;

public class CeilMethod {

	public  int modFinder(int n) {
		

        int a=n%10;


        if(a<6) {
            while(n>=1) {
                if(n%10==0) {
                    System.out.println(n);
                    break;
                }
                n--;
            }
        } else {

            System.out.println("hi");

            while(n<=1000) {
                if(n%10==0) {
                    System.out.println(n);
                    break;

                }
                n++;
            }

        }


	
	return n;
	
	
}
}

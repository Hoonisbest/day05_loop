package day05_loop;

public class Quiz01 {
	public static void main(String[] args) {
		int i = 1,sum=0;
		for( ; i <5 ; i++) {
			System.out.println(i+".hello");
		}
		for(i=1;i<=100;i++) {
			sum +=i;
		if(sum==528) {
			System.out.println(i);
			System.out.println(sum);
		   }
		}
		for(i=1;i<=25;i++) {
			System.out.print(i+"\t");
			if(i%5==0) {System.out.println();
		}
	}
		
	}
}
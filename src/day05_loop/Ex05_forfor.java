package day05_loop;

public class Ex05_forfor {
	public static void main(String[] args) {
	int su1, su2, sum=0;
		for (su1=1;su1<=10;su1++) {
			System.out.println("+++½ÃÀÛ");
			for(su2=1;su2<=10;su2++) {
				System.out.println(su2);
				sum+=1;
			}
		}
		System.out.println(sum);
	}
}

package day05_loop;

public class Ex03_for {
	public static void main(String[] args) {
		int evenSum =0, oddsum=0;
		for(int su=1;su<=10;su++) {
			if(su%2==0) {
				evenSum +=su;
			}else {
				oddsum+=su;
			}
		}
	System.out.println("1~10 Â¦¼öÇÕ : " +evenSum);
	System.out.println("1~10 È¦¼öÇÕ : " +oddsum);
	}
	
}

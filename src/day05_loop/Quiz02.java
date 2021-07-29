package day05_loop;

public class Quiz02 {
	public static void main(String[] args) {
		int su1 =0,su2=0;
		
		
		//1¹ø
		for(int a=1;a<=9;a++) {
			for(int i=1;i<=9;i++) {
				System.out.println(a+" x "+i+" = "+a*i);
				
			}
			System.out.println("--------------------");
		
		}

		
		//2¹ø
		int n=1;
		for(int i = 1;i<=5;i++) {
			for(int a=1;a<=5;a++) {
				System.out.print(n+" ");
				n++;
			}System.out.println();
		}
		
		
		
		//3¹ø
		n = 1;
		for(int i = 1;i<=5;i++) {
			for(int a=1;a<=5;a++) {
				System.out.print(n+"\t");
				n++;
			}
			System.out.println();
		}
		
   }
		
		
	}


package day05_loop;

import java.util.Scanner;

public class Tquiz {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//무한루프 응용
		/*for (int i = 0;;)
			{
				System.out.print("수입력 : ");
				i = input.nextInt();  
				System.out.println("내가 입력한 수는 : "+ i); 
			if(i==9)  
				break;			
				}
				System.out.println("9가 입력되어 프로그램을 종료합니다.");
		//A~Z까지
			char i= 'A';
			for(i='A';i<='Z';i++) {
			System.out.println(i);	
			}
		//1~20	까지 2또는3의 배수가 아닌수의 총합
			int i=0, sum =0;
			
		for(i=1;i<=20;i++) {
			if(i%2==0 || i%3==0) {
				continue;}
			else {
				sum+=i;
			}
		}System.out.println(sum);
		
		//두개의 주사위
		int d1, d2;
	    int cnt = 0;
	    
	    for (d1=1;d1<=6;d1++)
	    {
	        for (d2=1;d2<=6;d2++)
	        {
	        	if (d1 + d2 == 6) {
	        cnt++;
	        	}
	    }
	}System.out.println("총"+cnt+"개");*/
	
	//구구단 응용
		for(int a=1;a<=7;a++) {
			for(int i=1;i<=7;i++) {
				System.out.print("★");
	
				}System.out.println();
				}
		}
}

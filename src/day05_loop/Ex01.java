package day05_loop;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		/*
		 for���� ; ������ ������ 2���� ���;� �Ѵ�
		 �ʱⰪ ���ǽ� �������� ��� �������
		 for(�ʱⰪ ; ���ǽ� ; ������{
		 	���ӹ���
		 }
		 */
		int sum = 0, cnt = 1;
		sum += cnt++;
		sum += cnt++;
		sum += cnt++;
		sum += cnt++;
		sum += cnt++;
		sum += cnt++;
		sum += cnt++;
		sum += cnt++;
		sum += cnt++;
		sum += cnt++;
		System.out.println(sum);
		System.out.print(cnt);
		sum = 0;
		for(cnt=1;cnt<=10;cnt++) {
			sum+=cnt;
		}
		System.out.println("sum : "+sum);
	}
}
